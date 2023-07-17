package Session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginSession", urlPatterns = {"/LoginSession"})
public class LoginSession extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();

        

        String name = request.getParameter("nama");
        String password = request.getParameter("password");

        if (password.equals("admin") && (name.equals("mitaa"))) {
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            request.getRequestDispatcher("Header.html").include(request, response);
        } else {
            request.getRequestDispatcher("Header2.html").include(request, response);
        }
        out.close();
    }
}
