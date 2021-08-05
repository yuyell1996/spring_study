<%--
  Created by IntelliJ IDEA.
  User: 11150
  Date: 2021/8/5
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>

    <div align="center">
        <p>添加学生</p>
        <form action="add" method="post">
            姓名：<input type="text" name="name"><br/>
            邮箱：<input type="text" name="email"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="注册学生">
        </form>
        <br/>
        <br/>
        <p>查询学生</p>
        <form action="queryId" method="get">
            学生ID：<input type="text" name="id">
            <input type="submit" value="查询学生">
        </form>
    </div>

</body>
</html>
