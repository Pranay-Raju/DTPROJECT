<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Dropdowns within a Navbar</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
<div class="bs-example">
    <nav id="myNavbar" class="navbar navbar-inverse" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Profile</a></li>
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Messages <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="">Inbox</a></li>
                            <li><a href="#">Drafts</a></li>
                            <li><a href="#">Sent Items</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Trash</a></li>
                        </ul>
                    </li>
                </ul>
                
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Profile</a></li>
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Category<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="categeory">
                 <c:forEach items="${categoryList}" var="category" >
                <%--  <a class="alink" id="mycategory" href="navproducts/${category.id}"> --%>
                     <a class="alink" href=" nav/<c:out value="${category.id}" />">
                 	   <c:out value="${category.categoryName}" />
                     </a>
             <%-- <c:out value="${category.categoryName}" /> --%> 
               
              
              <%--    <a class="alink" href=" <c:out value="${category.categoryName}" />"></a>		 --%>	
					</c:forEach></li>
                   		 </ul>
                     
                  </li>
                  
              </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Sign <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                        
                        <sec:authorize access="!isAuthenticated()">
                            <li><a href="login">Login Page</a></li>
                            <li><a href="register">Registration Page</a></li>
                            </sec:authorize>
                            <sec:authorize access="isAuthenticated()">
                              <li> <a href="<c:url value="j_spring_security_logout" />">Logout</a></li>
                              </sec:authorize>
                            <li><a href="#">Product action</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Settings</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div>
    </nav>
</div>

<%-- <c:if test="${LoginPageClicked}">
		<jsp:include page="LoginPage.jsp"></jsp:include>
	</c:if>
 --%>
<c:choose>
		<c:when test="${LoginPageClicked}">
			<c:import url="/WEB-INF/views/LoginPage.jsp"></c:import>
		</c:when>
	</c:choose>


<c:choose>
		<c:when test="${IfRegisterClicked}">
			<c:import url="/WEB-INF/views/RegistrationPage.jsp"></c:import>
		</c:when>
	</c:choose>
	<c:choose>
		<c:when test="${Clickedshowproduct}">
			<c:import url="/WEB-INF/views/ShowProduct.jsp"></c:import>
		</c:when>
	</c:choose>
	<c:choose>
	 <c:when test="${Clickedcatproduct}">
			<c:import url="/WEB-INF/views/catproducts.jsp"></c:import>
		</c:when>
	</c:choose>

	<c:choose>
		<c:when test="${UserClickedshowproduct}">
			<c:import url="/WEB-INF/views/ListCategory.jsp"></c:import>
		</c:when>
	</c:choose>
		<%-- 
	<c:choose>
		<c:when test="${SupplierPageClicked}">
			<c:import url="/WEB-INF/views/SupplierPage.jsp"></c:import>
		</c:when>
	</c:choose> --%>
	

		<c:choose>
			<c:when test="${!Administrator}">
				<c:if test="${!empty productList}">
					<div id="myproduct">
						<!-- <ul> -->
						<div class="row" id="myproduct"
							style="padding-top: 20px; padding-botton: 20px; padding-left: 20px; padding-bottom: 20px;">
							<!-- <h3 style="margin-left: 15px">Latest Products</h3> -->
							<c:forEach items="${ProductList}" var="product">
								<div class="col-xs-2 w3-animate-zoom">
									<div class="img" style="margin: 5px">
										<a href="ShowProduct/${product.id}"> <img height="192px"
							                                width="192px" alt="${product.id }"
							src="<c:url value="/resources/images/${product.id }.jpg"></c:url>"></a>
										<div class="desc w3-black" style="opacity: 0.9">
											<p>
												${product.name}<br> <i class="fa fa-inr" aria-hidden="true"></i> ${product.price}
												
											</p>

										</div>
									</div>
								</div>
							</c:forEach>
						</div>
						<!-- </ul> -->
					</div>
				</c:if>
			</c:when>
		</c:choose>

	  
</body>
</html>           
<%-- <%@include file="ListCategory.jsp" %>       --%>               		