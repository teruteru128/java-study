package com.github.teruteru128.sample.primes;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PrimesListInitFilter extends HttpFilter {

  @Override
  protected void doFilter(HttpServletRequest request, HttpServletResponse response,
      FilterChain chain) throws IOException, ServletException {
    var session = request.getSession();
    var savedPrimes = (List<?>) session.getAttribute("savedPrimes");
    if (savedPrimes == null) {
      session.setAttribute("savedPrimes", new LinkedList<>());
    }
    chain.doFilter(request, response);
  }
}
