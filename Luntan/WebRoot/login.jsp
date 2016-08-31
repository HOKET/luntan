<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
     <title>论坛登录界面</title>
  </head>
  <body bgcolor="#F0E68C">
  <div align="center">
		<s:form action="login" method="post">
			<table>
			<caption>用户登录</caption>
           	<tr><td><s:textfield name="user.username" label="账号" cssStyle="width:130px"></s:textfield></td></tr>
   			<tr><td><s:password name="user.password" label="密码" cssStyle="width:130px"></s:password></td></tr>
   			
   			<tr><td><a href="tiezi">游客入口</a></td></tr>
			</table>
				<input type="submit" value="登录"/>
				<input type="reset" value="重置"/>
		</s:form>
		如果没注册点击<a href="register.jsp">这里</a>注册！
	</div>
  </body>
</html>
