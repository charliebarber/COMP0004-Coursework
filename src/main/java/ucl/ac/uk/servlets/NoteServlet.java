package ucl.ac.uk.servlets;

import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/note.html")
public class NoteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.
        Model model = ModelFactory.getModel();
        NoteIndex index = model.getIndex();
        String key = request.getParameter("key");

        // Then forward to JSP.
        request.setAttribute("note", index.get(Integer.valueOf(key)));

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/note.jsp");
        dispatch.forward(request, response);
    }
}