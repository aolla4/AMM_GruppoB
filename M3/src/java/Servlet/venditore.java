/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import CLASSI.BuyObj;
import CLASSI.FactoryBuyObj;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mariabernadetta
 */
@WebServlet(name = "venditore", urlPatterns = {"/venditore.html"})
public class venditore extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        
        if (session.getAttribute("id") == null) {
            request.setAttribute ("loggedclient",true);
            request.getRequestDispatcher ("venditore.jsp").forward(request,response);
        }
        else    if (session.getAttribute("id") != null) {
                        if (session.getAttribute("idutente") == "cliente") {
                          request.setAttribute("sellerlogged",true);
                          request.getRequestDispatcher("venditore.jsp").forward(request, response);
                          
                        }
                        else {
                            if(request.getParameter("sellersubmit") != null){
                            BuyObj newob = new BuyObj();
                     
                            newob.setobjname(request.getParameter("nome"));
                            newob.setobjurl(request.getParameter("usr"));
                            newob.setobjdesc(request.getParameter("lungo"));
                            try {
                            newob.setobjdisp(Integer.parseInt(request.getParameter("qta")));
                        } 
                        
                        catch (Exception e) {
                            newob.setobjdisp(0);
                        }

                        try {
                            newob.setobjprice(Double.parseDouble(request.getParameter("prz")));
                        } 

                        catch (Exception e) {
                            newob.setobjprice(0);
                        }
             
                                    if (newob.getobjname() != null && 
                                    newob.getobjurl() != null && 
                                    newob.getobjdesc() != null &&
                                    newob.getobjdisp() != 0 &&
                                    newob.getobjprice() != 0.0)
                                    {
                          
                        
                                    request.setAttribute("newob", newob);
                                    request.setAttribute("aggiuntaoggetto", true);
                                    request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    
                                                                }
                                    else {
                                    request.setAttribute("incompletezzadati", true);
                                    request.getRequestDispatcher("venditore.jsp").forward(request, response);
                                         }                         
                                                                        }
                           else {
                           request.getRequestDispatcher("venditore.jsp").forward(request, response);
                                }
                          
                      }
        }
         
        
        
   
        }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
