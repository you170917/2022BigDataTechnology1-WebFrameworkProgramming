package sims.servlet;

import sims.model.Student;
import sims.service.StudentService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/AddStudentServlet")

public class AddStudentServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String chineseScoreStr = request.getParameter("chineseScore");
        String mathScoreStr = request.getParameter("mathScore");

        if (name != null && !name.isEmpty() && chineseScoreStr != null && !chineseScoreStr.isEmpty() && mathScoreStr != null && !mathScoreStr.isEmpty()) {
            int chineseScore = Integer.parseInt(chineseScoreStr);
            int mathScore = Integer.parseInt(mathScoreStr);
            Student student = new Student(name, chineseScore, mathScore);
            studentService.addStudent(student);
            response.sendRedirect("list.jsp");
        } else {
            // 处理错误情况，例如向用户显示错误消息
        }
    }
}