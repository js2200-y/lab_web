<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>POST</title>
	</head>
	<body>
        <header>
		  <h1>휴우</h1>
        </header>
        <nav>
            <ul>
                <li>
                    <c:url value="/" var="mainPage"/>
                    <a href="${ mainPage }">메인 페이지</a>
                </li>
                <li>
                    <c:url value="/post" var="postList"/>
                    <a href="${ postList }">포스트 목록 페이지</a>
                </li>
                <li>
                    <c:url value="/post/modify" var="postModify">
                        <c:param name="id" value="${ post.id }"></c:param>
                    </c:url>
                    <a href="${ postModify }">포스트 수정</a>
                </li>
            </ul>
        </nav>
        
        <main>
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>내용</th>
                    <th>작성자</th>
                    <th>수정시간</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${ searchResult }" var="search">
                <tr>
                    <td>${ search.id }</td>
                    <td>${ search.title}</td>
                    <td>${ search.content}</td>
                    <td>${ search.author}</td>
                    <td>
                        <c:url value="/post/search" var="postSearch" >
                        <c:param name="id" value="${ h.id }"></c:param>
                        </c:url>
                    </td>
                    <td>${ search.modifiedTime }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        
        </main>
	</body>
</html>