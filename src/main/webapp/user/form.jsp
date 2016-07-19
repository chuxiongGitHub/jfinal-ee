<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="../res/bootstrap/css/bootstrap.css">
</head>
<body>
<div id="main" class="container">
    <div class="col-lg-6 col-sm-6 col-md-6">
        <form action="" method="post">
            <div class="form-group">
                <label>姓名</label>
                <input type="text" width="20%" class="form-control" placeholder="请输入用户名" >
            </div>
            <div class="form-group">
                <label>年龄</label>
                <input type="text" width="20%" class="form-control" placeholder="请输入年龄" >
            </div>
            <div class="form-group">
                <label>性别</label>
                <div class="radio-inline">
                    <input type="radio" checked="checked" value="1">男
                </div>
                <div class="radio-inline">
                    <input type="radio" value="2">女
                </div>
            </div>
                <div class="form-group">
                    <label>备注</label>
                    <textarea style="height: 70px" class="form-control" placeholder="请输入备注"></textarea>
                </div>
                <div style="text-align: center">
                   <button type="submit" class="btn btn-primary" style="width: 120px">提交</button>
                </div>

        </form>
    </div>
</div>
</body>
</html>
