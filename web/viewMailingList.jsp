<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">

    <div class="table-responsive">
        <table class="table">

            <thead>
            <tr>
                <th class="fancy-title">Username</th>
                <th class="fancy-title">First Name</th>
                <th class="fancy-title">Last Name</th>
                <th class="fancy-title">email</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${allUsers}">
                <tr>
                    <td>${user.userName}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
<c:import url="footer.jsp"/>
</html>