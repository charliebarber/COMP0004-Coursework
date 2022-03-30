package ucl.ac.uk.servlets;

import ucl.ac.uk.model.IndexNode;
import ucl.ac.uk.model.Model;
import ucl.ac.uk.model.ModelFactory;
import ucl.ac.uk.model.NoteIndex;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/search.html")
public class SearchServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.
        Model model = ModelFactory.getModel();
        NoteIndex index = model.getIndex();

        String query = (String) request.getParameter("query");

        ArrayList<IndexNode> results = index.search(query);
        for (IndexNode result : results) {
            System.out.println(result.getNote().getLabel());
        }

        request.setAttribute("results", results);

        // Then forward to JSP.

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/results.jsp");
        dispatch.forward(request, response);
    }
}