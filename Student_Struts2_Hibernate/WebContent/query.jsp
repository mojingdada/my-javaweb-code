<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示用户信息</title>
</head>
<body>
<center>
	<h1>用户信息</h1>
  <table border="1" width="400">

   <tr>
     <th>用户ID</th>
     <th>用户名</th>
     <th>密码</th>
     <th>是否删除</th>
 </tr>
 <s:iterator value="#request.studentlist" id="Student">
 <tr>
      <td align="center"><s:property value="#Student.Student_id"/> </td>
      <td align="center"><s:property value="#Student.student_name"/> </td>
      <td align="center"><s:property value="#Student.student_password"/> </td>
	<td align="center"><a href="Studentdelete.action?id=<s:property value='#Student.Student_id'/>">删除</a></td>    
   </tr>   
   </s:iterator>
   </table>
   <br>
   <a href="admin_save.jsp">添加用户</a><br>
   <a href="login.jsp">返回</a>
</center>
</body>

</html>
