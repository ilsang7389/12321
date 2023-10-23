<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--upList.jsp --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../temp/header.jsp"%>
<article>
	<header style="color: white">Fileupload Demo</header>
	<ul class="list-unstyled">
		<li class="border-top my-3">FileList</li>
	</ul>
	<div class="container">
		<table class="table table-bordered" id="upboardTable">

			<thead>
				<tr>
					<th colspan="6"><select id="sv" name="sv">
							<option value="0">Search</option>
							<option value="1">hit</option>
							<option value="2">bdate</option>
					</select></th>
				</tr>
				<tr>
					<th>��ȣ</th>
					<th>�̹���</th>
					<th>����</th>
					<th>�ۼ���</th>
					<th>��ȸ��</th>
					<th>�ۼ���¥</th>
				</tr>
			</thead>
			<tbody>
				<%-- for start 
				${vo.�Ӽ� } , ${map.key }
				List<BoardVO> list => BoardVO => e
				--%>
				<c:forEach var="item" items="${list}">

					<tr class="table">
						<td scope="row">${item.num}</td>
						<td><a href="upboardDetail?num=${item.num }">
						<img src="${rPath }/imgfile/${item.imgn}">
						

						</a></td>
						<td>${item.title} <span style="color: red">[${item.cnt }]</span></td>
						<td>${item.writer}</td>
						<td>${item.hit}</td>
						<td>${item.bdate}</td>
					</tr>

				</c:forEach>
				<%-- for end --%>
			</tbody>
			<tfoot>
				<%-- page���� --%>
				 <%@include file="../temp/pageProcess.jsp" %> 
				<%-- �˻����� --%>
				<tr>
					<th colspan="6">
						<%-- ������ ����Ʈ �𵨷� ��û�� ������. --%>
						<form class="d-flex" method="post" action="upList">
							<select class="form-control btn-mini" name="searchType"
								id="searchType" style="margin-left: 120px;">
								<option value="">�˻�</option>
								<option value="1">����</option>
								<option value="2">�̸�</option>
								<option value="3">����</option>
							</select> <input class="form-control me-2" type="text"
								placeholder="Search.." name="searchValue" id="searchValue"
								style="width: 300px">
							<button class="btn btn-outline-secondary" type="submit">Search</button>
						</form>
					</th>
				</tr>
				<tr>
					<td colspan="6" style="text-align: right;">
						<button type="button" class="btn btn-outline-secondary"
							onclick="location='upform'">���ۼ�</button>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
</article>

<%@include file="../temp/footer.jsp"%>