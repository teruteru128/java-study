package com.github.teruteru128.sample;

import static com.github.teruteru128.gmp.gmp_h.*;

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

public class PrimesServlet extends HttpServlet {

  private final Arena auto = Arena.ofAuto();
  private final MemorySegment state = __gmp_randstate_struct.allocate(auto)
      .reinterpret(auto, gmp_h::gmp_randclear);
  private final MemorySegment window = __mpz_struct.allocate(auto)
      .reinterpret(auto, gmp_h::mpz_clear);
  private final MemorySegment min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);

  public PrimesServlet() {
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
    var h = req.getParameter("q");
    int n;
    try {
      n = Integer.parseInt(h);
    } catch (NumberFormatException e) {
      return;
    }
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    resp.setContentType("text/plain");
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var buf = auto.allocate(21);
    var writer = resp.getWriter();
    for (int i = 0; i < n; i++) {
      synchronized (state) {
        mpz_urandomm(p, state, window);
      }
      mpz_add(p, p, min);
      mpz_nextprime(p, p);
      mpz_get_str(buf, 10, p);
      writer.println(buf.getString(0));
    }
  }
}
