<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    	<title>回复</title>
</head>

<body bgcolor="#F0E68C">
  <div align="center">
		<s:form action="addHuifu" method="post">
			<table border="1">
			<caption>填写回复信息</caption>  
   			<tr><td><s:textarea name="huifu.content" label="回复内容" rows="5" cols="35"></s:textarea></td></tr>
   			
			</table>
			<input type="submit" value="确定"/>
			<input type="reset" value="重置"/>
		</s:form>
		</div>
</body>
</html>

