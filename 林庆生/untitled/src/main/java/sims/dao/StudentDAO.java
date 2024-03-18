package sims.dao;

import sims.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO {
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "178835777980lqs");
            pstmt = conn.prepareStatement("SELECT * FROM student");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getString("name"), rs.getInt("chineseScore"), rs.getInt("mathScore")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public void add(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "178835777980lqs");
            pstmt = conn.prepareStatement("INSERT INTO student (name, chineseScore, mathScore) VALUES (?, ?, ?)");
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getChineseScore());
            pstmt.setInt(3, student.getMathScore());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "178835777980lqs");
            pstmt = conn.prepareStatement("DELETE FROM student WHERE name = ?");
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}