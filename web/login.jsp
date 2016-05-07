<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<html>
<body>
<form action = "j_security_check" method = "post">
    <table>
        <tr><td>User name: <INPUT TYPE="TEXT" NAME="j_username" ></td></tr>
        <tr><td>Password: <INPUT TYPE="PASSWORD" NAME="j_password" ></td></tr>
        <tr><th><INPUT TYPE="SUBMIT" VALUE="Log In"></th></tr>
    </table>
</form>
</body>


</html>
