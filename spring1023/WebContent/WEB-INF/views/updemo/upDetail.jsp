<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="../temp/header.jsp"%>
<article>
	<header style="color:white">FreeBoard</header>
	<ul class="list-unstyled">
	<li class="border-top my-3">ICT No1 Detail �� ������ �Դϴ�.</li>
	</ul>
	<div class="container">
	<div class="row">
		<h2>FreeBoard Detail </h2>
			<div class="row mb-3">
				<label for="subject" class="col-sm-2 col-form-label">����</label>
				<div class="col-sm-10">
					<input type="text" name="title" class="form-control" id="title"
					 readonly="readonly" value="${v.title}"
					>
				</div>
			</div>
			<div class="row mb-3">
				<label for="writer" class="col-sm-2 col-form-label">�ۼ���</label>
				<div class="col-sm-10">
					<input type="text" name="writer" class="form-control" id="writer"
					 readonly="readonly" value="${v.writer}" 
					>
				</div>
			</div>
			<div class="row">
				<label for="content" class="col-sm-2 col-form-label">����</label>
				<div class="col-sm-10">
				<textarea name="content" rows="10" cols="50" id="content" readonly="readonly">${v.content}</textarea>
				</div>
			</div>
			<div class="row mb-3">
				<label for="pwd" class="col-sm-2 col-form-label">������</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					 readonly="readonly" value="${v.reip}">
				</div>
			</div>	
			<div class="row mb-3">
				<label for="pwd" class="col-sm-2 col-form-label">��¥</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" 
					 readonly="readonly" value="${v.bdate}">
				</div>
			</div>	
			<div  class="container text-center" role="group">
			<%-- chkpwdForm�� ȭ������ϰ�, sysout���� 2�Ķ���Ͱ��� ��� �غ��� --%>
			<button class="btn btn-primary" type="button" 
			onclick="location='upboardModify?num=${v.num}'">����</button>
			<button class="btn btn-primary" type="button" 
			onclick="upboardDelete(${v.num})">����</button>
            <button class="btn btn-danger" type="button" onclick="location='upboardList'">����Ʈ</button>
			</div>
		</div>
	</div>
</article>
<script>
	function upboardDelete(num) {
	    $.ajax({
	        type: 'POST',
	        url: '<%=application.getContextPath()%>/upboardDelete',
	        data: { num: num },
	        async: true,
	        success: function(response) {
	           	window.location.href="upboardList"
	        },
	        error: function(xhr, status, error) {
	         	console.log(error)
	        }
	    });
	}
	</script>
<%@include file="../temp/footer.jsp"%>