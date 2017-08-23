<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<% String msg = (String)session.getAttribute("msg"); %>
<!DOCTYPE HTML5>
<html>
  <head>
    
    <title>Word</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    result:<%= msg %> <br>
  </body>
</html>
