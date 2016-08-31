<%@ page language = "java" import="java.util.*" pageEncoding = "utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
       <title>回复页面</title>
<style type="text/css">
</style>
</head>
<body bgcolor = "#E3E3E3"> 
<div>
	<table border="1">
   		<caption>回复</caption>
   			<tr><th>回复用户</th><th width="500px">回复内容</th><th>回复时间</th></tr>
   		      <s:iterator value="#request.list" id="li"> 
   			  <tr>
   			  	<td align="center"><s:property value="#li.username"/></td>
				<td align="center"><s:property value="#li.content"/></td>
				<td align="center"><s:property value="#li.date"/></td>
			  </tr>
             </s:iterator>
	</table>
	<a href="huifu?Tieid=<s:property value="#li.Tieid"/>">回复</a>
	<a href="tiezi">返回主界面</a>
	
</div> 
</body>
</html>