package com.shruti.springbootannotations.repository;

import com.shruti.springbootannotations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
