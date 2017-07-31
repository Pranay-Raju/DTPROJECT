<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Category Details</h3>
        <form:form method="POST" action="saveCategory" modelAttribute="category">
             <table>
                <tr>
                    <td><form:label path="categoryName">categoryName</form:label></td>
                    <td><form:input path="categoryName"/></td>
                </tr>
               <%--  <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                </tr> --%>
                <tr>
                    <td><form:label path="categoryDescription">categoryDescription</form:label></td>
                    <td><form:input path="categoryDescription"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
         ${message}
    <c:if test="${!empty categoryList}"> 
 <table align="center" border="1">
  <tr>
   <th>ID</th>
   <th>Name</th>
   <th>Description</th>
  </tr>

  <c:forEach items="${categoryList}" var="category">
   <tr>
    <td><c:out value="${category.id}"/></td>
  
    <td><c:out value="${category.categoryName}"/></td>
    <td><c:out value="${category.categoryDescription}"/></td>
   <%--  <td align="center"><a href="editPublication.html?pubId=${publication.pubId}">Edit</a> | <a href="deletePublication.html?pubId=${publication.pubId}">Delete</a></td> --%>
   </tr>
  </c:forEach>
 </table>
 </c:if>
 
        
        
        
    </body>
</html>