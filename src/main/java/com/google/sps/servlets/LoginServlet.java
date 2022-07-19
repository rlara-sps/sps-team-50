package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/login-handler")
public class LoginServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    Set<String> TAs = new HashSet<String>();
    TAs.addAll(Arrays.asList(
        new String[] {"hchu@sps-program.com", "robertolara@sps-program.com", "eahorlu@sps-program.com", "dsanchez@sps-program.com", 
    "yuchengwang@sps-program.com"}));

    // Get the value entered in the form.
    String email = request.getParameter("email");
    Boolean isTA = TAs.contains(email);

    Cookie emailCookie = new Cookie("email", email);
    Cookie TACookie = new Cookie("isTA", String.valueOf(isTA));

    // Write the value to the response so the user can see it.
    response.addCookie(emailCookie);
    response.addCookie(TACookie);
    response.sendRedirect("/index.html");
  }
}