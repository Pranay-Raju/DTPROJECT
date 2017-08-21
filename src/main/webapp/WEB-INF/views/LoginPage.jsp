<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <c:url var="actionUrl" value="j_spring_security_check" />  
<div class="container"  >
	<!-- Trigger the modal with a button -->
	<!-- Modal -->
	<div class="modal fade" id="login" role="dialog">
		<div class="modal-dialog modal-sm">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header" style="padding: 15px 35px;">
					<h4>ECommerce Login</h4>
				</div>
				<div class="modal-body" style="padding: 35px 35px;">
			<form  method="post" action="${actionUrl }" class="form-horizontal" >
				
				
				<%-- 	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post"> --%>
						<div class="form-group form-group-sm">

							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-user"></i>
								</div>
								<input type="text" class="form-control"
									placeholder="Enter Username" id="j_username" name="j_username">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-eye-open"></i>
								</div>
								<input type="password" class="form-control"
									placeholder="Enter Password" id="j_password" name="j_
									
									password" >
							</div>
							<br>
						</div>
						<button type="submit" class="btn btn-success  btn-block">
							<span class="glyphicon glyphicon-off"></span> Log In
						</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	$(document).ready(function() {
		$("#log").click(function() {
			$("#login").modal();
			});
		});
</script>