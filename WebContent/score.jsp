<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 20/03/09 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form method="post" action="score">
			<table border="1" cellspacing="0">
				<caption style="font-size: 20px;"><font><b>학 점 계 산 기</b></font></caption>
				<tr>
				<th>이  름</th>
				<td><input type="text" name="name" /></td>
				</tr>
				<tr>
				<th>국  어</th>
				<td><input type="text" name="kor" /></td>
				</tr>
				<tr>
				<th>영  어</th>
				<td><input type="text" name="eng" /></td>
				</tr>
				<tr>
				<th>수  학</th>
				<td><input type="text" name="mat" /></td>
				</tr>
				<tr>
				<td colspan="2" align="center">
				<input type="submit" value="계산" />
				<input type="reset" value="취소" />
				</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>