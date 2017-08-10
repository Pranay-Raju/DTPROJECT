<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List Of Category</title>
<%-- 

  <link rel="stylesheet" href="<c:url value="/resources/lib/bootstrap-3.3.6/css/bootstrap.min.css"/>">
	
<link rel="stylesheet" href="<c:url value="/resources/lib/jquery/jquery-ui-1.10.4.custom.css"/>"> --%>


<style type="text/css">
th {
	text-align: left
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">


	
	
			</div>

		<h1>List Of Books</h1>

<button class="btn btn-primary" onclick="addBook()"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add Category
		</button>
		<br>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th width="4%">S.N</th>
					<th width="12%">Category ID</th>
					<th width="12%">Category Name</th>
					<th width="12%">Category Description</th>
					<th width="12%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList1}" var="product" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${product.id}" /></td>
						<td><c:out value="${product.name}" /></td>
						<td><c:out value="${product.price}" /></td>
						
						<td><nobr>								

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
<%-- 	<script type="text/javascript" src="<c:url value="../resources/lib/jquery/jquery-1.10.2.js"/>"></script>
	<script type="text/javascript" src="<c:url value="../resources/lib/jquery/jquery-ui-1.10.4.custom.js"/>"></script>
	<script type="text/javascript" src="<c:url value="../resources/lib/jquery/jquery.ui.datepicker.js"/>"></script>
	<script type="text/javascript" src="<c:url value="../resources/lib/bootstrap-3.3.6/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="../resources/js/js-for-listBooks.js"/>"></script>
 --%>
	
</body>
