<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="../temp/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<header style="color: white">FreeBoard</header>
	<ul class="list-unstyled">
		<li class="border-top my-3">ICT34기 FreeBoard List 페이지 입니다.</li>
	</ul>
	<div class="container">
		<div class="row">
			<h2>FreeBoard List</h2>
			<table class="table table-hover">
				<thead>
					<tr class="table-secondary">
						<th scope="col">번호</th>
						<th scope="col">제목</th>
						<th scope="col">작성자</th>
						<th scope="col">글내용</th>
						<th scope="col">조회수</th>
						<th scope="col">날짜</th>
					</tr>
				</thead>
				<tbody>
					<%-- 반복시작  --%>
					<c:forEach var="item" items="${list}">

						<tr class="table-warning">
							<th scope="row">${item.num}</th>
							<td ><a href="fboardHit?num=${item.num}" class="link-secondary">${item.subject}</a></td>
							<th >${item.subject}</th>
							<td>${item.writer}</td>
							<td>${item.hit}</td>
							<td>${item.fdate}</td>
						</tr>

					</c:forEach>
				<%-- 반복끝  --%>
				</tbody>
				<tfoot>

					<tr>
						<th colspan="5" class="text-end">
							<!-- https://getbootstrap.com/docs/5.0/components/buttons/ -->
							<button class="btn btn-outline-danger btn-sm"
								onclick="location='fbordWrite'">글작성</button>
						</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</article>
pageEncoding="EUC-KR"%>
<%@include file="../temp/footer.jsp"%>