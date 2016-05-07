<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">
    <br /><br /><br /><br />

    <div class="table-responsive">
        <table class="table">
            <tbody>
            <c:forEach var="" items="${}}">

                <tr>
                    <td>${}</td>
                    <td>${}</td>
                    <td>${}</td>
                </tr>

            </c:forEach>
            </tbody>
        </table>
    </div>

</div>


</body>
<c:import url="footer.jsp"/>
</html>