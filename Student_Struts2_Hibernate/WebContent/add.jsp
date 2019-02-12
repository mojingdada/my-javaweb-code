<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生添加页面</title>
  </head>
  
  <body>
   <form action="student!add.action" method="post">
   	<table>
   			<tr>
	   			<td>
	   				用户名:
	   			</td>
	   			<td>
	   				<input type="text" name="stu.stuName">
	   			</td>
   			</tr>
   			<tr>
	   			<td>
	   				年  龄:
	   			</td>
	   			<td>
	   				<input type="text" name="stu.age">
	   			</td>
   			</tr>
   			<tr>
	   			<td colspan="2">
	   				<input type="submit" value="添加">
	   			</td>
   			</tr>
   	</table>
   </form>
  </body>
</html>
