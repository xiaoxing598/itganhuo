<%@ page language="java" import="java.util.*,cn.itganhuo.app.entity.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
<meta charset="UTF-8" />
<title>404-IT干货技术分享网</title>
</head>
<body id="body">

	<div class="container wrap">
		<div class="row inner edge">
			<h1>八戒，你又调皮了不是！</h1>
			<p><a href="javascript:window.location.href='<%=request.getContextPath()%>/'">果断回首页</a></p>
			<div style="display: none">${errorMsg }</div>
		</div>
	</div>

</html>