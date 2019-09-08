package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("catchRequest")
public class Graph extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            //Step 1: set the content type
            response.setContentType("text/html");

            //Step 2: get the printwriter
            PrintWriter out = response.getWriter();

            //Step 3: generate HTML content
            out.println("<html><body>");

            out.println("<h2>Hello post request</h2>");
            out.println("<hr>");
            out.println("<h2>Time on the server is: " + new java.util.Date() + "</h2>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Step 1: set the content type
        response.setContentType("text/html");

        //Step 2: get the printwriter
        PrintWriter out = response.getWriter();

        //Step 3: generate HTML content
        out.println("<html><body>");

        out.println("<h2>Hello get request</h2>");
        out.println("<hr>");
        out.println("<h2>Time on the server is: " + new java.util.Date() + "</h2>");
    }
}
