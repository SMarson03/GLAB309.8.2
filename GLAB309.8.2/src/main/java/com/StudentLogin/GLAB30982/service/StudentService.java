package com.StudentLogin.GLAB30982.service;

import com.StudentLogin.GLAB30982.dto.StudentDto;
import com.StudentLogin.GLAB30982.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}



