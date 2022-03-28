package ucl.ac.uk.servlets;

import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;
import ucl.ac.uk.model.note.BasicNote;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/createnote.html")
public class CreateNoteServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.

        Model model = ModelFactory.getModel();
        NoteIndex index = model.getIndex();
        BasicNote basicnote = new BasicNote(request.getParameter("label"), request.getParameter("text"));
        index.add(basicnote);
        System.out.println("RETRIEVED" + index.get(1).getLabel());
        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
    }
}