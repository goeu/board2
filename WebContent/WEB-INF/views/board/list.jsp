<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
</style>
<script>
	function geul(){
		location.href="/board/register";
	}
</script>
</head>
<body>
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">board</div>
		<!-- Table -->
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정일</th>
			</tr>

			<c:forEach items="${list}" var="item">
				<tr>
					<td><c:out value="${item.bno}" /></td>
					<td><c:out value="${item.title}" /></td>
					<td><c:out value="${item.content}" /></td>
					<td><c:out value="${item.writer}" /></td>
					<td><c:out value="${item.regdate}" /></td>
					<td><c:out value="${item.updatedate}" /></td>
					<td><c:out value="${item.cnt}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
<nav aria-label="Page navigation">
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
		<div style="margin-left:50px">
		<button type="button" class="btn btn-default btn-lg" onclick="geul()">
			<span aria-hidden="true"></span>
			글쓰기
		</button>
	</div>
</body>
</html>

