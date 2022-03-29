package ucl.ac.uk.servlets;

import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/editnote.html")
public class EditNoteServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.
        Model model = ModelFactory.getModel();
        NoteIndex index = model.getIndex();
        String key = request.getParameter("key");


        String type = request.getParameter("type");

        // Edit note depending on whether the user wants to update the content or label
        if (type.equals("content")) {
            index.updateContents(Integer.valueOf(key), (String) request.getParameter("contents"));
        }

        if (type.equals("label")) {
            index.updateLabel(Integer.valueOf(key), (String) request.getParameter("label"));
        }
        // Then forward to JSP.


        ServletContext context = getServletContext();
        request.setAttribute("msg", "Note edited successfully");
        RequestDispatcher dispatch = context.getRequestDispatcher("/message.jsp");
        dispatch.forward(request, response);
    }
}