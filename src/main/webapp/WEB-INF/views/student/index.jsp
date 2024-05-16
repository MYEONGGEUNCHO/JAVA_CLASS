<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<select name="searchType">
			<option value="all" ${param.searchType == 'all' ? 'selected' : '' }> 전체 </option>
			<option value="id" ${param.searchType == 'id' ? 'selected' : '' }> 아이디 </option>
			<option value="name" ${param.searchType == 'name' ? 'selected' : ''}> 이름 </option>
		</select>
		<input type="text" name="searchWord">
		<input type="button" value="전송">
	</form>
	<c:forEach var="vo" items="${list }">
		<a href="view.do?studno=${vo.studno }"> ${vo.studno }</a> ${vo.name } ${vo.id } ${vo.grade } <br>
	</c:forEach>
</body>
</html>