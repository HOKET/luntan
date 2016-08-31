<%@ page language = "java" import="java.util.*" pageEncoding = "utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
       <title>管理员页面</title>
<style type="text/css">
</style>
</head>
<body bgcolor = "#E3E3E3">       
<div style="height：70px;width:400px;">
	<a href="mytie">我的贴子</a>
	<a href="login.jsp">退出登录</a>
	<s:form action="find" method="post">
	<s:textfield name="user.username" placeholder="请填写你要查找的用户"style="width:130px;"></s:textfield>
	<input style="float:left" type="submit" value="查找"/>
	</s:form>
</div>
<div>    
   	<table border="1">
   		<caption>所有帖子信息</caption>
   			<tr><th>发布者</th><th width="150px">主题</th><th width="500px">内容</th><th>发布时间</th><th colspan="2">操作</th></tr>
   		      <s:iterator value="#request.list" id="li"> 
   			  <tr>
   			  	<td align="center"><s:property value="#li.username"/></td>
				<td align="center"><s:property value="#li.title"/></td>
				<td align="center"><s:property value="#li.content"/></td>
				<td align="center"><s:property value="#li.date"/></td>
				<td align="center"><a href="deleteTie?id=<s:property value="#li.id"/>">删除</a></td>
				<td align="center"><a href="huifu?TieId=<s:property value="#li.id"/>">回复</a></td>
			  </tr>
             </s:iterator>
	</table>
	<form action="fatie.jsp">
	<input type="submit" value="发帖"/>
	</form>
</div>
</body>
</html>
