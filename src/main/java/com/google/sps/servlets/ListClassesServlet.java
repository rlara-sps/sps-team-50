package com.google.sps.servlets;

import com.google.sps.Course;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homepage")
public class ListClassesServlet extends HttpServlet{

    ArrayList<Course> courseList = new ArrayList<>();
    
    Course netw = new Course("12", "Network Architecture", "Gross Hall", "Prof John");
    Course mus = new Course("23", "Music Theory", "Rubenstein", "Prof Brooks");

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

      courseList.add(netw);
      courseList.add(mus);
      response.setContentType("text/html;");
      response.getWriter().println("<h1>Hello world!</h1>");
      response.getWriter().println(courseList.get(0).location);
    }

    
}
