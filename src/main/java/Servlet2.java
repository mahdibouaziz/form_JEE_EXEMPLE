
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "servlet2", urlPatterns = { "/servlet2" })
public class Servlet2 extends HttpServlet{

    private static final long serialVersionUID = 1825023232864573043L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = "Hello Ramez";
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nom + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
