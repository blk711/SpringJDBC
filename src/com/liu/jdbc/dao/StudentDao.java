package com.liu.jdbc.dao;

import com.liu.jdbc.domain.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    void update(Long sid, Student student);
    void delete(Long id);
    Student get(Long id);
    List<Student> listAll();
}
