/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.entity.House;
import com.entity.HouseCreater;


import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "RoomsCountServlet", urlPatterns = {"/roomsCountServlet"})
public class RoomsCountServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //количество комнат
            int num = Integer.parseInt(request.getParameter("avg"));
            ArrayList<House> result = new ArrayList<>();
            House[] houses = HouseCreater.getHouses();

            for (House house : houses) {
                if (num == house.getRoomsCount()) {
                    result.add(house);
                }
            }

            request.setAttribute("result", result);
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/WEB-INF/jsp/result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/WEB-INF/jsp/error.jsp");
            rd.forward(request, response);
        }
    }
}
