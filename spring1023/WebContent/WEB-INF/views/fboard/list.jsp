<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="../temp/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<header style="color: white">FreeBoard</header>
	<ul class="list-unstyled">
		<li class="border-top my-3">ICT34�� FreeBoard List ������ �Դϴ�.</li>
	</ul>
	<div class="container">
		<div class="row">
			<h2>FreeBoard List</h2>
			<table class="table table-hover">
				<thead>
					<tr class="table-secondary">
						<th scope="col">��ȣ</th>
						<th scope="col">����</th>
						<th scope="col">�ۼ���</th>
						<th scope="col">�۳���</th>
						<th scope="col">��ȸ��</th>
						<th scope="col">��¥</th>
					</tr>
				</thead>
				<tbody>
					<%-- �ݺ�����  --%>
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
				<%-- �ݺ���  --%>
				</tbody>
				<tfoot>

					<tr>
						<th colspan="5" class="text-end">
							<!-- https://getbootstrap.com/docs/5.0/components/buttons/ -->
							<button class="btn btn-outline-danger btn-sm"
								onclick="location='fbordWrite'">���ۼ�</button>
						</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</article>
pageEncoding="EUC-KR"%>
<%@include file="../temp/footer.jsp"%>