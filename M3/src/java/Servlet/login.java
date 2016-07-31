/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import CLASSI.BuyObj;
import CLASSI.FactoryBuyObj;
import CLASSI.FactoryClient;
import CLASSI.FactorySeller;
import CLASSI.clienti;
import CLASSI.venditore;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "login", urlPatterns = {"/login.html"},loadOnStartup = 0)
public class login extends HttpServlet {
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db-definition/feltrinolla";
private static final String DB_BUILD_PATH = "WEB-INF/db-definition/feltrinolla";

@Override 
    public void init(){
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        FactoryBuyObj.getInstance().setConnectionString(dbConnection);
        FactoryClient.getInstance().setConnectionString(dbConnection);
        FactorySeller.getInstance().setConnectionString(dbConnection);
    }

    
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
       
HttpSession session = request.getSession();

if(request.getParameter("submit") != null)    
        {
            String username = (String) request.getParameter("usr");
            String password = (String) request.getParameter("psw");
            
            
            
            ArrayList<BuyObj> ObjectList = FactoryBuyObj.getInstance().getObjectList();
            ArrayList<clienti> ClientList = FactoryClient.getInstance().getClientiList();
            for(clienti c : ClientList)
            {
                    if(c.getUserClient().equals(username)&&
                       c.getClientpsw().equals(password))
                    {
                       
                      session.setAttribute ("idutente", "cliente");
                      session.setAttribute("id", true);
                      session.setAttribute("loggedclient",true);
                      session.setAttribute ("ObjectList", ObjectList);
                      session.setAttribute("clienteAutenticato", c);  
                      session.setAttribute("venditoreAutenticato", c);
                      request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
            }
            ArrayList<venditore> SellerList = FactorySeller.getInstance().getSellerList();
            for(venditore v : SellerList)
                  
            {
                    if(v.getUserSeller().equals(username)&&
                       v.getSellerpsw().equals(password))   
                    {
                      session.setAttribute("idutente", "venditore");
                      session.setAttribute("id", true);
                      session.setAttribute ("sellerlogged",true);
                      session.setAttribute("clienteAutenticato", v);  
                      session.setAttribute("venditoreAutenticato", v);
                      request.getRequestDispatcher("venditore.jsp").forward(request, response);
                      
                      
                    }
       
            }
            
           
                
                request.setAttribute("login_fallito", true);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
         else {
            if(session.getAttribute("id") != null){
            
                switch ((String)session.getAttribute("idutente")) {
                    case ("cliente"): {
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
              
                    case ("venditore"): {
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    }
                }
            }
            else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
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
            