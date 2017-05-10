/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ra21506703
 */
public class signo extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            String nasc = request.getParameter("nasc");
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<img src=\"http://p2.trrsf.com/image/fget/cf/600/600/images.terra.com/2016/01/14/signos-do-zodiaco-doutissima-shutterstock.jpg\">");
            out.println("<h1>Sua data de nascimento:" + nasc + "</h1>");
            out.println("<h1>Seu signo é:" + DescobridorSigno.verificaSigno(nasc) + "</h1>");
            
            if (DescobridorSigno.verificaSigno(nasc) ==Signos.ARIES){
                out.println("<img src=\"http://vignette4.wikia.nocookie.net/saintseya/images/f/f7/Mu_de_%C3%81ries.png/revision/latest?cb=20170205190021&path-prefix=pt\">");
            }
            if (DescobridorSigno.verificaSigno(nasc) ==Signos.TOURO){
                out.println("<img src=\"http://vignette1.wikia.nocookie.net/saintseiya/images/4/46/Aldebar%C3%A1n-Tauro_26.jpg/revision/latest?cb=20131012145601&path-prefix=es\">");
            }
            
            out.println("</body>");
            out.println("</html>");
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
