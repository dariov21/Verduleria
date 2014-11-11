<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app = "verduleria">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<title>Verduleria</title>
</head>
<body  >
<script type="text/javascript" src="angular.js"></script>
<script type="text/javascript" src="app.js"></script>

<div ng-controller = "verduleriaController as verduleria">
    person : {{verduleria.person.name}}
</div>
</body>
</html>