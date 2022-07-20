package com.google.sps.servlets;

import com.google.gson.Gson;
import com.google.sps.model.OH;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ohs")
public class ListOHServlet extends HttpServlet{

  private List<OH> ohList = new ArrayList<>(List.of(new OH("546", "12", "Monday", "12:00", "15:00", "Gross Hall", "Mike Ben")));
  
  Gson gson = new Gson();

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String ohListJson = gson.toJson(ohList);
    response.setContentType("application/json;");
    response.getWriter().println(ohListJson);
  }
    
}
