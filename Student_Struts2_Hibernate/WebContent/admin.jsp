<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员操作</title>
</head>
<body>
	欢迎您，管理员！请选择您的操作：
	<br>
	<s:form action="Studentquery" method="post" >
	<s:submit style="width:100px;height:100px" value="管理数据库" />
	<a href="login.jsp"><input type="button"
		style="width: 100px; height: 100px;" value="返回"></input></a>
	 </s:form>
</body>
</html>