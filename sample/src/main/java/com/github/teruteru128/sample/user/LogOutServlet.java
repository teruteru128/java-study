package com.github.teruteru128.sample.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogOutServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var user = (User) req.getSession().getAttribute("user");
    if (user.getLogInStatus() == LogInStatus.LOGIN_SUCCESS) {
      req.getSession().removeAttribute("user");
    }
    resp.sendRedirect(req.getContextPath());
  }
}
