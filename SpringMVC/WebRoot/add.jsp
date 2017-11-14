<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
   
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   		<div>
   			<form action="insert" method="post">
   				<table border="1">
   					<tr>
   						<td>产品名称</td>
   						<td><input type="text" name="productname" > </td>
   					</tr>
   			
   					<tr>
   						<td>产品简述</td>
   						<td><input type="text" name="Descs" > </td>
   					</tr>
   					<tr>
   						<td>产品类别</td>
   						<td> <select name="name">
   						
   							<option value="0">数码产品</option>
   							<option value="1">衣服</option>
   							<option value="2">书籍</option>
   							<option value="3">家庭用品</option>
   						</select> </td>
   					</tr>
   					<tr>
   						<td></td>
   						<td><input type="submit" > </td>
   					</tr>
   				</table>
   			
   			</form>
   		
   		</div>
  </body>
</html>
