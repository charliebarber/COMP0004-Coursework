package ucl.ac.uk.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/newnote.html")
public class NewNoteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Get the note type so the forms can be rendered differently
        String noteType = request.getParameter("type");

        // Forward note type to servlet for creating notes
        request.setAttribute("type", noteType);
        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/createnote.jsp");
        dispatch.forward(request, response);
    }
}