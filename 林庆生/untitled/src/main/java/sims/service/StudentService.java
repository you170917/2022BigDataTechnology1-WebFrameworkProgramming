package sims.service;

import sims.dao.StudentDAO;
import sims.model.Student;
import java.util.List;

public class StudentService {
    private StudentDAO studentDAO = new StudentDAO();

    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    public void addStudent(Student student) {
        studentDAO.add(student);
    }

    public void deleteStudent(String name) {
        studentDAO.delete(name);
    }
}