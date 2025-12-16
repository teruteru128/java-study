package com.github.teruteru128.sample.user;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserBeanFilter extends HttpFilter {

  @Override
  protected void doFilter(HttpServletRequest request, HttpServletResponse response,
      FilterChain chain) throws IOException, ServletException {
    var session = request.getSession();
    var user = (User) session.getAttribute("user");
    if (user == null) {
      session.setAttribute("user", new User());
    }
    chain.doFilter(request, response);
  }
}
