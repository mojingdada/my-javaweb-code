<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="CSS/demo.css" rel="stylesheet" type="text/css" />
<link href="CSS/style2.css" rel="stylesheet" type="text/css" />
<link href="CSS/style.css" rel="stylesheet" type="text/css" />
<link href="CSS/style3.css" rel="stylesheet" type="text/css" />
<link href="CSS/animate_custon.css" rel="stylesheet" type="text/css" />
<title>用户登录</title>
</head>
<body>
	<center>
		<s:form action="login" method="post">
			<s:textfield name="Student_name" label="用户名"></s:textfield>
			<s:password name="Student_password" label="密码"></s:password>
			<s:submit value="提交"></s:submit>
		</s:form>
		<div id="Bottom">&copy;北京邮电大学 2017</div>
	</center>
</body>
</html>
