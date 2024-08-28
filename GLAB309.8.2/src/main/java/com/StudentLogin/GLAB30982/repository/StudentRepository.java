package com.StudentLogin.GLAB30982.repository;

import com.StudentLogin.GLAB30982.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{

    Student findByEmail(String email);
}

