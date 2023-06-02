/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import entity.Airlanes;
import entity.AirlanesArray;
import entity.User;
import entity.UsersList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "DestinationServlet", urlPatterns = {"/destinationServlet"})
public class DestinationServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
         try {
           String destination = request.getParameter("destination");
           List<Airlanes> airlane =AirlanesArray.getListDestination(destination);
            request.setAttribute("result", airlane);
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/result.jsp");
            rd.forward(request, response);
             airlane.clear();
        } catch (Exception e) {
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/error.jsp");
            rd.forward(request, response);            
        }
}
}