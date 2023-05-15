/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.entity.House;
import com.entity.HouseCreater;

import static com.entity.ListGenerator.getListFloorAndNumberOfRooms;
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
@WebServlet(name = "FloorServlet", urlPatterns = {"/floorServlet"})
public class FloorServlet extends HttpServlet {

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
            //количество комнат и интервал этажей
            House[] houses = HouseCreater.getHouses();
            ArrayList<House> result = new ArrayList<>();

            String string = request.getParameter("avg");

            String[] values = string.split("[-\\s]+");
            int numberOfRooms = Integer.parseInt(values[0]);
            int fromFloor = Integer.parseInt(values[1]);
            int toFloor = Integer.parseInt(values[2]);
            for (House house : houses) {
                if (numberOfRooms == house.getRoomsCount() && house.getFloor() > fromFloor && house.getFloor() < toFloor) {
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
