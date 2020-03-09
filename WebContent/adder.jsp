<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	<!-- 페이지 지시자 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>두 수 더하기(배포서술자 - web.xml 파일에 등록)</h2>
	<form method="get" action="adder1">
		<p>첫번째 수 : <input type="text" name="num1" />	<!-- name 은 무조건 변수 이름임 -->
		<p>두번째 수 : <input type="text" name="num2" />
		<input type="submit" value="더하기" />
	</form>

</body>
</html>