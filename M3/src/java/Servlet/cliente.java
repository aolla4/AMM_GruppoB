/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import CLASSI.BuyObj;
import CLASSI.FactoryBuyObj;
import CLASSI.FactoryClient;
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
@WebServlet(name = "cliente", urlPatterns = {"/cliente"})
public class cliente extends HttpServlet {

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
            request.setAttribute ("sellerlogged",true);
            request.getRequestDispatcher ("cliente.jsp").forward(request,response);
        }
        else    if (session.getAttribute("id") != null) {
                        if (session.getAttribute("idutente") == "venditore") {
                          request.setAttribute("loggedclient",true);
                          request.getRequestDispatcher("cliente.jsp").forward(request, response);
                          
                        }
                        else {
                            if (request.getParameter ("objId") != null) {
                             BuyObj acquisto = FactoryBuyObj.getInstance().getObject(Integer.parseInt(request.getParameter("objId"))) ;
                             request.setAttribute ("acquisto",acquisto);
                             request.setAttribute ("features",true);
                             request.getRequestDispatcher("cliente.jsp").forward(request,response);
                             
                            }
                            
                            else if (request.getParameter("acquisto") != null) {
                            }                           
     /*
                    else if (request.getParameter("Idoggetto_scelto") != null){
                        Double conto = Utenti_Factory.getInstance().getUtenti_Clienti((int) session.getAttribute("id")).getCredito().getSaldo();
                        Oggetti oggettoScelto = Utenti_Factory.getInstance().getOggetto(Integer.parseInt(request.getParameter("Idoggetto_scelto")));
                                                                                        
                        if (conto > oggettoScelto.getPrezzo()) {
                        
                            request.setAttribute("oggetto", oggettoScelto);
                            request.setAttribute("acquistato", true);
                            request.getRequestDispatcher("Login_Cliente.jsp").forward(request, response);
                        }
                        
                        else {
                            request.setAttribute("Noacquistato", true);
                            request.getRequestDispatcher("Login_Cliente.jsp").forward(request, response);
                        }
                    }
                        
                    else{
                        request.setAttribute("Buyer", true);
                        
                        request.setAttribute("listaOggetti", listaOggetti);
                        request.getRequestDispatcher("Login_Cliente.jsp").forward(request, response);                     
                    }
                }
            }
        }
        
        */
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
