package com.github.teruteru128.sample.primes;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;

import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.study.Factory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimesCreateServlet extends HttpServlet {

  private final Arena auto = Arena.ofAuto();
  private final ThreadLocal<MemorySegment> buf2ThreadLocal = ThreadLocal.withInitial(()-> auto.allocate(21));
  private final ThreadLocal<MemorySegment> qThreadLocal = ThreadLocal.withInitial(()->{
    var q = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(q);
    return q;
  });
  private final MemorySegment state = __gmp_randstate_struct.allocate(auto)
      .reinterpret(auto, gmp_h::gmp_randclear);
  private final MemorySegment window = __mpz_struct.allocate(auto)
      .reinterpret(auto, gmp_h::mpz_clear);
  private final MemorySegment min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);

  public PrimesCreateServlet() {
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var max = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(max, 10);
    mpz_pow_ui(max, max, 19);
    mpz_sub_ui(max, max, 39);
    mpz_init(window);
    mpz_sub(window, max, min);
    gmp_randinit_default(state);
    Factory.seedRandomState(state);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var session = req.getSession();
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    resp.setContentType("text/html");
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var buf = auto.allocate(21);
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("</head>");
    writer.println("<body>");
    @SuppressWarnings("unchecked")
    List<String> savedPrimes = (List<String>) session.getAttribute("savedPrimes");

    if (savedPrimes == null) {
      savedPrimes = new LinkedList<>();
    }

    var h = req.getParameter("q");
    int n;
    try {
      n = Integer.parseInt(h);
    } catch (NumberFormatException e) {
      resp.sendRedirect("/index.html");
      return;
    }
    writer.println("<ul>");
    var list = new LinkedList<String>();
    if (n < 1000) {
      for (int i = 0; i < n; i++) {
        synchronized (state) {
          mpz_urandomm(p, state, window);
        }
        mpz_add(p, p, min);
        mpz_nextprime(p, p);
        mpz_get_str(buf, 10, p);
        var primeNumber = buf.getString(0);
        list.add(primeNumber);
      }
    } else {
      IntStream.range(0, n).parallel().mapToObj(i -> {
        var q = qThreadLocal.get();
        synchronized (state) {
          mpz_urandomm(q, state, window);
        }
        mpz_add(q, q, min);
        mpz_nextprime(q, q);
        var buf2 = buf2ThreadLocal.get();
        mpz_get_str(buf2, 10, q);
        return buf2.getString(0);
      }).forEach(e -> {
        synchronized (list) {
          list.add(e);
        }
      });
    }
    for (String primeNumber : list) {
      writer.print("<li><a href=\"https://factordb.com/index.php?query=");
      writer.print(primeNumber);
      writer.print("\" target=\"_blank\">");
      writer.print(primeNumber);
      writer.println("</a></li>");
    }
    writer.println("</ul>");
    writer.println("<a href=\"./viewer\">作った素数を見る</a>");
    writer.println("<a href=\"../../\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
    writer.flush();
    savedPrimes.addAll(list);
    session.setAttribute("savedPrimes", savedPrimes);
  }
}
