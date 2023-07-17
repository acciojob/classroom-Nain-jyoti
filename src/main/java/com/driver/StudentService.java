package com.driver;

import java.util.List;

public class StudentService {
    StudentRepository studentRepositry= new StudentRepository();

    public  void addStudent(Student student) {
        studentRepositry.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepositry.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        studentRepositry.addStudentTeacherPair(student, teacher);
    }

    public static Student getStudentByName(String name) {
        return studentRepositry.getStudentByName(name);
    }

    public static Teacher getTeacherByName(String name) {
        return studentRepositry.getTeacherByName(name);
    }

    public static List<String> getStudentsByTeacherName(String teacher) {

        return studentRepositry.getStudentsByTeacherName(teacher);
    }

    public static List<String> getAllStudents() {
        return studentRepositry.getAllStudents();
    }

    public static void deleteTeacherByName(String teacher) {
        studentRepositry.deleteTeacherByName(teacher);
    }

    public static void deleteAllTeachers() {
        studentRepositry.deleteAllTeachers();
    }
}
