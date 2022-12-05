<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Homepage</title>


</head>


<body>
    <h1 align ="center">Friendship Calculator <3</h1>
    <hr/>

    <form:form action="process-homepage" method="get" modelAttribute="userInfo">
        <div align="center">
            <p>
                <label for="yn">Your Name :</label>
                <form:input id="yn" path = "userName"/>
                <form:errors path="userName" />
            </p>

            <p>
                <label for="fn">Friend Name :</label>
                <form:input id="fn" path="friendName"/>

            </p>

            <input type="submit" value="calculate">
        </div>
    </form:form>
</body>

</html>