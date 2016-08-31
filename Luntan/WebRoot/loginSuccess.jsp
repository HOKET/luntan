<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import = "org.user.daoimp.DlDaoImp"%>
<%@page import = "java.util.Map"%>
<%@page import = "com.opensymphony.xwork2.ActionContext"%>

<html>
<head></head>
<script type="text/javascript">
	function daoshu(i){
		window.location.href = "tiezi"; 
	}
</script>
<body onload="daoshu(<s:property value="#session.user.getPower()" />)">

</body>
</html>
