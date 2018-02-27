package edu.wctc.dj.burtsbeans.controller;

import edu.wctc.dj.burtsbeans.model.Product;
import edu.wctc.dj.burtsbeans.model.ProductService;
import edu.wctc.dj.burtsbeans.model.ShoppingCart;
import edu.wctc.dj.burtsbeans.model.ShoppingCartService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShoppingCartController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShoppingCartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShoppingCartController at " + request.getContextPath() + "</h1>");
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

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        ProductService productService = new ProductService();
        RequestDispatcher dispatcher = null;

        String quantityString = request.getParameter("quantity");
        int quantity = Integer.parseInt(quantityString);

        String id = request.getParameter("id");
        Product product = productService.getProduct(id);
        
        shoppingCartService.addToCart(product, quantity);
        
        LinkedHashMap<Integer, Product> shoppingCart = shoppingCartService.getCartContents();
        
        request.setAttribute("cartList", shoppingCart);
        request.setAttribute("product", product);
        request.setAttribute("quantity", quantity);

        dispatcher = request.getRequestDispatcher("/shoppingCart.jsp");

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
