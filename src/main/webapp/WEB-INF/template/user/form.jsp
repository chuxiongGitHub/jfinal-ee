<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="/res/bootstrap/css/bootstrap.css">
</head>
<body>
<div id="main" class="container">
    <div class="col-lg-6 col-sm-6 col-md-6">
        <form action="${user==null? '/user/submit':'/user/update'}" method="post">
            <input type="hidden" value="${user.id}" name="user.id">
            <div class="form-group">
                <label>姓名</label>
                <input type="text" name="user.username" value="${user.username}" width="20%" class="form-control"
                       placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <label>年龄</label>
                <input type="text" name="user.age" value="${user.age}" width="20%" class="form-control"
                       placeholder="请输入年龄">
            </div>
            <div class="form-group">
                <label>性别</label>
                <div class="radio-inline">
                    <input type="radio" name="user.sex"
                    <c:if test="${user.sex!=null && user.sex==1}"> checked="checked" </c:if> value="1">男
                </div>
                <div class="radio-inline">
                    <input type="radio" name="user.sex"
                           <c:if test="${user.sex!=null && user.sex==2}">checked="checked" </c:if> value="2">女
                </div>
            </div>
            <div class="form-group">
                <label>备注</label>
                <textarea style="height: 70px" name="user.remark"  class="form-control"
                          placeholder="请输入备注">${user.remark}</textarea>
            </div>
            <div style="text-align: center">
                <button type="submit" class="btn btn-primary" style="width: 120px">提交</button>
            </div>

        </form>
    </div>
</div>
</body>
</html>
