import SomePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alexey Pavlov on 01.09.2019.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();


//        Cart cart = (Cart)session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//
//        if(cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);
//
//
//        PrintWriter pw = response.getWriter();

//        pw.println("<html>");
//        pw.println("<h1> your count is: " + count + " </h1>");
//        pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

    }
}
