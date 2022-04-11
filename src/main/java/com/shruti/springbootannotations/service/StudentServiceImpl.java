package com.shruti.springbootannotations.service;


import com.shruti.springbootannotations.entity.Student;
import com.shruti.springbootannotations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;


    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }
}
