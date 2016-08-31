<%@ page language = "java" import="java.util.*" pageEncoding = "utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
       <title>游客页面</title>
<style type="text/css">
</style>
</head>
<body bgcolor = "#E3E3E3">       
   	<table border="1">
   		<caption>所有帖子信息</caption>
   			<tr><th>发布者</th><th width="150px">主题</th><th width="500px">内容</th><th>发布时间</th></tr>
   		      <s:iterator value="#request.list" id="li"> 
   			  <tr>
   			  	<td align="center"><s:property value="#li.username"/></td>
				<td align="center"><s:property value="#li.title"/></td>
				<td align="center"><s:property value="#li.content"/></td>
				<td align="center"><s:property value="#li.date"/></td>
             </s:iterator>
	</table>
</body>
</html>
