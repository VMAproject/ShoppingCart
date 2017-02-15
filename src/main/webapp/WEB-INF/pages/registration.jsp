<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><meta charset="UTF-8">

    <title>Registration</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">

</head>
<body>
<jsp:include page="_header.jsp"/>
<jsp:include page="_menu.jsp"/>


<h2>Registration Form</h2>

<%--<form:form method="POST" modelAttribute="Accounts">--%>
    <%--<form:input type="hidden" path="id" id="id"/>--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><label for="username">User Name: </label> </td>--%>
            <%--<td><form:input path="username" id="username"/></td>--%>
            <%--<td><form:errors path="username" cssClass="error"/></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><label for="Mail">Mail: </label> </td>--%>
            <%--<td><form:input path="mail" id="mail"/></td>--%>
            <%--<td><form:errors path="mail" cssClass="error"/></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><label for="password">Password: </label> </td>--%>
            <%--<td><form:input path="password" id="password"/></td>--%>
            <%--<td><form:errors path="password" cssClass="error"/></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td colspan="3">--%>
                <%--<c:choose>--%>
                    <%--<c:when test="${edit}">--%>
                        <%--<input type="submit" value="Update"/>--%>
                    <%--</c:when>--%>
                    <%--<c:otherwise>--%>
                        <%--<input type="submit" value="Register"/>--%>
                    <%--</c:otherwise>--%>
                <%--</c:choose>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
<br/>
<br/>
Go back to <a href="<c:url value='/index.jsp' />">Go to index</a>

<jsp:include page="_footer.jsp"/>
</body>
</html>
