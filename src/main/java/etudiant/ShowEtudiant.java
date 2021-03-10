package etudiant;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ShowEtudiant", urlPatterns = { "/ShowEtudiant" })
public class ShowEtudiant  extends HttpServlet{

    private static final long serialVersionUID = 7605123791864213859L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* create an attribute data that contains the array etudiantList to acces it in the JSP file */
        req.setAttribute("data", Etudiant.etudiantList);
        //Link to the jsp file + forward
        RequestDispatcher rd = req.getRequestDispatcher("afficheEtudiant.jsp");
        rd.forward(req, resp);
    }

}
