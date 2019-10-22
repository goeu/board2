<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
<form action="/board/register" method="post">
<div class="input-group">
  <input type="text" class="form-control" name="title" placeholder="title" aria-describedby="basic-addon1">
   <textarea rows="20" cols="100" name="content"></textarea>
      <input type="text" class="form-control" name="writer" placeholder="writer" aria-describedby="basic-addon1">
</div>
		<button type="submit" class="btn btn-default btn-lg">
			<span aria-hidden="true"></span>
			등록
		</button>
</form>
</body>
</html>