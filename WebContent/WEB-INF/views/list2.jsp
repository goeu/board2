<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${list}
	
	${param.msg} <!-- 변수명 -->
	
	<script>
		var msg = "${param.msg}"; 
		
		if(msg ==='success'){
			alert("등록 성공");
		}
	</script> 
</body>
</html>