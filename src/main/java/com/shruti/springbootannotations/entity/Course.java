package com.shruti.springbootannotations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private int id;

    private String courseName;

    private Student student;
}
