<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear Employee, Please enter your details</h2>
<br>
<br>

<form:form action ="showDetails" modelAttribute="employee" method="post">

    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: #ff0000;"/>
    <br><br>
    Surname <form:input path="surName"/>
    <form:errors path="surName" cssStyle="color: #ff0000;"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: #ff0000;"/>
    <br><br>
    Department <form:select path="department" items="${employee.departments}"/>
    <br><br>
    Which car do you want? <form:radiobuttons path="car" items="${employee.cars}"/>
    <br> <br>
    What languages do you know?
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br> <br>
    PhoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber" cssStyle="color: #ff0000;"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email" cssStyle="color: #ff0000;"/>
    <input type="submit">
</form:form>

</form>
</body>
</html>