package ucl.ac.uk.servlets;

import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/index.html")
public class HomeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.
        Model model = ModelFactory.getModel();
        NoteIndex noteindex = model.getIndex();

        // Get the viewmode set by buttons but set it to orderAdded by default
        String viewMode = request.getParameter("viewmode");
        if (viewMode == null) {
            viewMode = "orderAdded";
        }

        // Then forward to JSP.
        request.setAttribute("notes", noteindex.getLabelIndex());
        if (viewMode.equals("orderAdded")) {
            request.setAttribute("viewmode", "Order added");
        }
        if (viewMode.equals("sorted")) {
            request.setAttribute("viewmode", "Sorted order");
        }

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
    }
}