<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    	<title>发贴</title>
</head>

<body bgcolor="#F0E68C">
  <div align="center">
		<s:form action="addTie" method="post">
			<table border="1">
			<caption>填写主题信息</caption>
           	<tr><td><s:textfield name="tiezi.title" label="主题" cssStyle="width:130px"></s:textfield></td></tr>
   			<tr><td><s:textarea name="tiezi.content" label="主题内容" rows="5" cols="35"></s:textarea></td></tr>
			</table>
			<input type="submit" value="发布"/>
			<input type="reset" value="重置"/>
		</s:form>
		</div>
</body>
</html>
