<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/19
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
    <link rel="stylesheet" href="/res/bootstrap/css/bootstrap.css">
    <script type="application/javascript" src="/res/js/jquery-3.1.0.js"></script>
</head>
<body>
<div id="main" class="container">
    <div class="row">
        <div class="col-lg-12 col-sm-12 col-md-12">
            <table class="table table-bordered table-hover">
                <tr>
                    <th colspan="6" valign="center">用户信息表</th>
                    <th align="center"><a class="btn btn-primary" href="/user/form">新增用户</a></th>
                </tr>
                <tr>
                    <th>序号</th>
                    <th>用户id</th>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>备注信息</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${userList}" var="data">
                    <tr>
                        <td></td>
                        <td>${data.id}</td>
                        <td>${data.username}</td>
                        <td>${data.age}</td>
                        <td>
                            <c:if test="${data.sex!=null&&data.sex==1}">男</c:if>
                            <c:if test="${data.sex!=null&&data.sex==2}">女</c:if>
                        </td>
                        <td>${data.remark}</td>
                        <td width="auto">
                            <a class="btn btn-warning" href="/user/edit/${data.id}">修改</a>
                            <a class="btn btn-danger" href="/user/del/${data.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<script>
    $(function () {
        var len = $('table tr').length;
        console.log(len);
        for (var i = 1; i < len; i++) {
            $('table tr:eq(' + i + ') td:first').text(i - 1);
        }
    });
</script>
</body>
</html>
