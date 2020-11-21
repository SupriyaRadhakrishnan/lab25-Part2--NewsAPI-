<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Tech Crunch News</h1>
<form method ="" action="/">
<label for="search">Search</label>
<input type="text" name="search">
<input type="submit" value="Search">
</form>
<c:forEach var="article" items="${articles}">
<div>
<h2>${article.getTitle()}</h2>
<c:out value="${article.getDescription()}"></c:out>
<c:out value="Author : ${article.getAuthor()}"></c:out> <br />
<img src="${article.getUrlToImage()}"><br /><br />
<a href="${article.getUrl()}" >${article.getContent()}</a>
</div>
</c:forEach>
</body>
</html>