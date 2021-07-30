package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(Student student);

    Student selectById(Integer id);
    List<Student> selectAll();
}
