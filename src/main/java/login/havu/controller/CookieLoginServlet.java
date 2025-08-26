package login.havu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/CookieLoginServlet")
public class CookieLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // demo kiểm tra cứng user/pass
        if ("nglien".equals(user) && "2005".equals(pass)) {
            // tạo cookie
            Cookie cookie = new Cookie("username", user);
            cookie.setMaxAge(60*5); // 5 phút
            response.addCookie(cookie);

            response.sendRedirect("welcome.jsp");
        } else {
            response.getWriter().println("Login failed (Cookie)");
        }
    }
}
