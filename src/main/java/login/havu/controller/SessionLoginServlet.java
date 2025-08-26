package login.havu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("nglien".equals(user) && "2005".equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", user);

            response.sendRedirect("welcome.jsp");
        } else {
            response.getWriter().println("Login failed (Session)");
        }
    }
}
