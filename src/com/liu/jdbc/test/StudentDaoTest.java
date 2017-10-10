package com.liu.jdbc.test;

import com.liu.jdbc.dao.StudentDao;
import com.liu.jdbc.dao.StudentDaoImpl;
import com.liu.jdbc.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void testSave() {
        Student student = new Student();
        student.setName("张学友");
        student.setAge(43);
        studentDao.save(student);
    }

    @Test
    public void testUpdate() {
        Student student = new Student();
        student.setName("西门吹雪");
        student.setAge(43);
        studentDao.update(1L,student);
    }


}
