package com.liu.jdbc.dao;

import com.liu.jdbc.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoImpl implements StudentDao {



    private JdbcTemplate jdbcTemplate;

    //
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(Student student) {
        String sql = "INSERT INTO t_student (name, age) VALUES (?,?)";
        jdbcTemplate.update(sql,student.getName(),student.getAge());
    }

    @Override
    public void update(Long sid,Student student) {
        String sql = "UPDATE t_student SET name=?, age=? WHERE id="+sid+"";

        jdbcTemplate.update(sql,student.getName(),student.getAge());

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public List<Student> listAll() {
        return null;
    }
}
