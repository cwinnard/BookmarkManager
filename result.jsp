<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload Example in JSP and Servlet - Java web application</title>
        <style>
		table, th, td {
    		border: 1px solid black;
   		    border-collapse: collapse;
		}
</style>
    </head>
 
    <body> 
        <div id="result">
            <h3>${requestScope["message"]}</h3>
        </div>
      
		<table>
		<tr>
			<td>User ID</td>
			<td>Bookmark Name</td>
			<td>link</td>
			
		</tr>
		<c:forEach var="bookmark" items="${bookmarkList}">
			<tr>
				<td>${bookmark.BookmarkName}</td>
				<td>${bookmark.BookmarkURL}</td>
				<td>${bookmark.bookmarkID}</td>
			</tr>
		</c:forEach>
	</table>
      
    </body>
</html>
