package ucl.ac.uk.servlets;

import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/deletenote.html")
public class DeleteNoteServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.
        Model model = ModelFactory.getModel();
        NoteIndex index = model.getIndex();
        String key = request.getParameter("key");
        index.delete(Integer.valueOf(key));

        // Then forward to JSP.

        ServletContext context = getServletContext();
        request.setAttribute("msg", "Note deleted successfully");
        RequestDispatcher dispatch = context.getRequestDispatcher("/message.jsp");
        dispatch.forward(request, response);
    }
}