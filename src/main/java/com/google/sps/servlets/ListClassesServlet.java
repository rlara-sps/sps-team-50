package com.google.sps.servlets;

import com.google.gson.Gson;
import com.google.sps.model.Course;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/classes")
public class ListClassesServlet extends HttpServlet{

    private List<Course> courseList = new ArrayList<>(List.of(new Course("12", "Network Architecture", "Prof John"),
    new Course("23", "Music Theory", "Prof Brooks")));
    
    Gson gson = new Gson();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

      String courseListJson = gson.toJson(courseList);
      response.setContentType("application/json;");
      response.getWriter().println(courseListJson);

    }      
}
