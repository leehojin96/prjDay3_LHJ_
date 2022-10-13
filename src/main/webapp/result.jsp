<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="prjDay3_LHJ.Score" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Score score = (Score)request.getAttribute("scoreinput");
%>
<form action="studentinput">

<table>
<caption>결과 확인</caption>

<tr>
<td>이름</td>
<td><input type="text" name="name" value=<%=score.getName() %> readonly></td>
</tr>

<tr>
<td>영어 점수</td>
<td><input type="text" name="eng" value=<%=score.getEng() %> readonly></td>
</tr>

<tr>
<td>국어 점수</td>
<td><input type="text" name="kor" value=<%=score.getKor() %> readonly></td>
</tr>

<tr>
<td>성적</td>
<td><input type="text" name="grade" value=<%=score.getGrade() %> readonly></td>
</tr>

<tr>
<td><a href="index.html"><input type="button" value="초기 화면" ></a></td>
<td><button>데이터 입력</button></td>
</tr>

</table>
</form>
</body>
</html>