package com.app.SpringBootManyToOne.repo;

import com.app.SpringBootManyToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
