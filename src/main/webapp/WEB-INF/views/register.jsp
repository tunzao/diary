<%--
  Created by IntelliJ IDEA.
  User: likuan
  Date: 7/4/13
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>用户注册</title>
    <meta charset="utf-8">
    <link type="text/css" href="/statics/css/register.css" rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
</head>
<body>
<div id="container">
    <div class="form-signin">
        <h2 class="form-signin-heading">用户注册</h2>

        <form action="/reg" class="form-horizontal">

            <div class="control-group">
                <label class="control-label" for="nameId">用户名</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on"><li class="icon-user"></li></span>
                        <input type="text" name="name" id="nameId" placeholder="user name"/>
                    </div>
                </div>
            </div>

            <div class="control-group">
                <label class="control-label">邮箱</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on"><li class="icon-envelope"></li></span>
                        <input type="email" name="email" placeholder="email address"/>
                    </div>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">密码</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on"><li class="icon-lock"></li></span>
                        <input type="password" name="password" placeholder="password"/>
                    </div>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">确认密码</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on"><li class="icon-lock"></li></span>
                        <input type="password" name="passwordAgain" placeholder="repassword"/>
                    </div>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">昵称</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on"><li class="icon-tag"></li> </span>
                        <input type="text" name="nickName" placeholder="nick name"/>
                    </div>
                </div>
            </div>

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">Save changes</button>
                <button type="button" class="btn">Cancel</button>
            </div>

        </form>
    </div>
</div>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="/statics/js/register.js"></script>
</body>
</html>