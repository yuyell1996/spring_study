package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

public interface StudentDao {
    int insertStudent(Student student);
    Student selectById(Integer id);
}
