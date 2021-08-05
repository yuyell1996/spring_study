package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

        WebApplicationContext ctx = null;
        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        ServletContext sc = getServletContext();
        Object attr = sc.getAttribute(key);
        if(attr!=null){
            ctx = (WebApplicationContext) attr;
        }

        StudentService service = (StudentService) ctx.getBean("myService");
        Student student = new Student();
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));

        int res = service.addStudent(student);
        request.setAttribute("res",res);
        request.getRequestDispatcher("/add_result.jsp").forward(request,response);
    }
}
