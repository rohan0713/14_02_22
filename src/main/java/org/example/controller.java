package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "controller", value = "/controller.do")
public class controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request,response);
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(request.getParameter("t1"));
        arr.add(request.getParameter("t2"));
        arr.add(request.getParameter("r1"));
        arr.add(request.getParameter("c1"));
        arr.add(request.getParameter("c2"));
        arr.add(request.getParameter("c3"));

        StringBuilder stringBuffer=new StringBuilder();
        for (String s : arr) {
            if (s != null) {
                stringBuffer.append(s).append("\t");
            }
        }
        out.println(stringBuffer.toString());
    }
}
