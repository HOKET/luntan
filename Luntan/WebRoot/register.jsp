<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    	<title>论坛用户注册</title>
</head>
<body bgcolor="#F0E68C">
  <div align="center">
		<s:form action="register" method="post">
			<table>
			<caption>用户注册</caption>
           	<tr><td><s:textfield name="user.username" label="账号" cssStyle="width:130px"></s:textfield></td>
           	<td><s:fielderror fieldName="cuowu"></s:fielderror></td></tr>
   			<tr><td><s:password name="user.password" label="密码" cssStyle="width:130px"></s:password></td></tr>
			</table>
			<input type="submit" value="注册"/>
			<input type="reset" value="重置"/>
		</s:form>
		</div>
</body>
</html>
