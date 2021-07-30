package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int res = studentDao.insertStudent(student);
        return res;
    }

    @Override
    public List<Student> AllStudent() {
        List<Student> students = studentDao.selectAll();
        return students;
    }

    @Override
    public Student selectById(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
