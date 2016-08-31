<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    	<title>查找失败界面 </title>
</head>
<body bgcolor="#E3E3E3">
		查找失败，没有搜索到该用户，点击<a href="tiezi">这里</a>返回主界面。
  </body>
</html>
