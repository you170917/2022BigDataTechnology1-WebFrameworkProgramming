package sims.servlet;

import sims.service.StudentService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/DeleteStudentServlet")

public class DeleteStudentServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        studentService.deleteStudent(name);
        response.sendRedirect("list.jsp");
    }
}