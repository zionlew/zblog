<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<<<<<<< HEAD
<% String msg = (String)request.getAttribute("msg"); %>
=======
<% String msg = request.getParameter("msg"); %>
>>>>>>> 6298816045ad4ccb3efd612d5e432dc34783712e
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Word</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    result:<%= msg %> <br>
  </body>
</html>