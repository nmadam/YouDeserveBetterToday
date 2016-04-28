<%@ page contentType="comment/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="head-tag.jsp"/>

<html>
<head>
    <title>Uh-Oh</title>
</head>
<body>
    <c:import url="navbar.jsp"/>

    <div class="container">
    <br /><br /><br />
        Invalid userid/password combination. <br />
        <a href="login.jsp">Try again</a>
    </div>
</body>
    <c:import url="footer.jsp"/>
</html>
