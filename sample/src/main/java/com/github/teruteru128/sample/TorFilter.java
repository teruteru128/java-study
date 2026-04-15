package com.github.teruteru128.sample;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TorFilter extends HttpFilter {

  private final String onionLocation;

  public TorFilter() {
    this(null);
  }

  public TorFilter(String onionLocation) {
    this.onionLocation = onionLocation;
  }

  @Override
  protected void doFilter(HttpServletRequest request, HttpServletResponse response,
      FilterChain chain) throws IOException, ServletException {
    if (onionLocation != null) {
      var host = request.getHeader("Host");
      if (host != null && !host.contains(".onion")) {
        response.addHeader("Onion-Location", onionLocation);
      }
    }
    chain.doFilter(request, response);
  }
}
