<%@page import="com.lyl.entity.studentinfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'inputStuInfo_result.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="stuInfo" class="com.lyl.entity.studentinfo"></jsp:useBean>
	<jsp:setProperty property="*" name="stuInfo" />
	<jsp:useBean id="stuServer" class="com.lyl.DAO.StudengInfoDaoImpl"></jsp:useBean>
	<%
		if (stuServer.save(stuInfo))
			out.print("录入成功");
		else
			out.print("录入失败");
	%><br>
	<a href="displayStuInfo.jsp" type="button">查看现有学生信息</a>
	<br>
	<a href="inputStuInfo.jsp" type="button">返回录入</a>
	<br>
</body>
</html>
