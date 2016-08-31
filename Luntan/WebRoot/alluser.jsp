<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>所有用户信息</title>
  </head>
  
  <body>
       	<table border="1">
   		<caption>所有用户信息</caption>
   			<tr><th>用户ID</th><th>权限</th><th>升级为管理员</th><th>操作</th></tr>
   		      <s:iterator value="#request.list" id="li"> 
   			  <tr>
   			  	<td align="center"><s:property value="#li.username"/></td>
				<td align="center"><s:property value="#li.power"/></td>
				<td align="center"><a href="addAdmin?username=<s:property value="#li.username"/>">确定</a></td>
				<td align="center"><a href="deleteUser?username=<s:property value="#li.username"/>">删除</a></td>
				</tr>
             </s:iterator>
	</table>
	<a href="tiezi">返回</a>
  </body>
</html>
