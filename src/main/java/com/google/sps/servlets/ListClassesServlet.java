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

    private ArrayList<Course> courseList = new ArrayList<>(List.of(new Course("12", "Network Architecture", "Gross Hall", "Prof John"), new Course("23", "Music Theory", "Rubenstein", "Prof Brooks")));
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

      String courseListJson = convertToJson(courseList);
      response.setContentType("application/json;");
      response.getWriter().println(courseListJson);
    }



    private String convertToJson(ArrayList<Course> courseList) {
      Gson gson = new Gson();
      String json = gson.toJson(courseList);
      return json;
    }
    

    
}
