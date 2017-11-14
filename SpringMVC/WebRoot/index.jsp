<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <div>
    	<table>
	  	<tr>
	  		
	  		<td>产品名称</td>
	  		<td>产品简述</td>
	  		<td>类别</td>
	  		<td>操作</td>
	  	</tr>
	  	
	  	<c:forEach items="${list}" var="l">
			<tr>
			
				<td>${l.productname}</td>
				<td>${l.getDescs()}</td>
				<td>${l.catagorys.getName()}</td>
				<td><a href="del?id=${l.id}">删除</a> </td>
				
			
			</tr>
	  	</c:forEach>
	
	  </table>
	  
	  <a href="ssg?pageindex=1">首页</a>
	<a href="ssg?pageindex=${pageindex-1}">上一页</a>
	<a href="ssg?pageindex=${pageindex+1}">下一页</a>
	<a href="ssg?pageindex=${countpage}">末页</a><br>
	<a href="add.jsp">新增</a>
	</div>
  </body>
</html>
