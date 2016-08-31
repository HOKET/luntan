<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>帖子</title>
  </head>
  
  <body>
   <table border="1">
   		<caption>帖子信息</caption>
   			<tr><th>发布者</th><th>主题</th><th>内容</th><th>发布时间</th><th>操作</th></tr>
   		      <s:iterator value="#request.list" id="li"> 
   			  <tr>
   			  	<td align="center"><s:property value="#li.username"/></td>
				<td align="center"><s:property value="#li.title"/></td>
				<td align="center"><s:property value="#li.content"/></td>
				<td align="center"><s:property value="#li.date"/></td>
				<td align="center"><a href="deleteTie">删除</a></td>
             </s:iterator>
	</table>
	<a href="tiezi">返回</a>
  </body>
</html>
