<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Category Details</h3>
        <form:form method="POST" action="saveSupplier" modelAttribute="supplier">
             <table>
                <tr>
                    <td><form:label path="supplierName">supplierName</form:label></td>
                    <td><form:input path="supplierName"/></td>
                </tr>
             
                <tr>
                    <td><form:label path="supplierAddress">supplierAddress</form:label></td>
                    <td><form:input path="supplierAddress"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>