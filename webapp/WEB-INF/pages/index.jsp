<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<h2>Afet Listesi</h2>

		<c:url var="actionUrl" value="/index" />

		<form:form action="${actionUrl}" modelAttribute="afetModel" method="POST" acceptCharset="UTF-8">
			<form:input cssClass="form-control" path="seriNo" />
			<form:errors path="seriNo" />
			
			<form:input cssClass="form-control" path="neden" />
			<form:errors path="neden" />
			
			<form:input cssClass="form-control" path="nedenAciklama" />
			<form:errors path="nedenAciklama" />
		
		    <form:button cssClass="btn btn-primary" id="save">Kaydet</form:button>
		</form:form>
		
		
		<c:if test="${not empty lists}">

			<div class="container">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Seri No</th>
							<th>Baslama Tarihi</th>
							<th>Bitis Tarihi</th>
							<th>Neden</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lists}">
							<tr>
								<td>${item.seriNo}- ${item.id}</td>
								<td>${item.baslamaTarihi}</td>
								<td>${item.bitisTarihi}</td>
								<td>${item.neden}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>
	</div>
</body>
</html>
