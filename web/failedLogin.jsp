<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="head-tag.jsp"/>

<html>
<head>
    <title>Uh-Oh</title>
</head>
<body>
    <c:import url="navbar.jsp"/>

    <div class="container">

        <h3>Invalid userid/password combination.<h3></h3> <br />

        <p class = "text-warning"><a href="login.jsp"><strong>Try again</strong></a></p>
    </div>
</body>
    <c:import url="footer.jsp"/>
</html>
