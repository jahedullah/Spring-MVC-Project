<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Register</title>
</head>


<body>

    <h1 align ="center">Friendship Calculator <3</h1>
    <h3 align ="center">Register here !!</h3>
    <hr/>
    <div align = "center">

        <form:form method ="GET" action = "registration-success" modelAttribute="userReg">

            <label>User : </label>
            <form:input path = "name" />
            <br/>

            <label>User Name : </label>
            <form:input path = "username" />
            <br/>

            <label>Password : </label>
            <form:password path = "password" />
            <br/>

            <label>Country : </label>
                <form:select path = "countryName">
                    <form:option value="Bd" label="Bangladesh"></form:option>
                    <form:option value="Pak" label="Pakistan"></form:option>
                    <form:option value="Mal" label="Malaysia"></form:option>
                    <form:option value="Aus" label="Australia"></form:option>

                </form:select>
            <br/>

            <label>Hobbies :</label>
                Cricket : <form:checkbox path="hobbies" value="cricket" />
                Reading : <form:checkbox path="hobbies" value="reading" />
                Travel :  <form:checkbox path="hobbies" value="travel" />
                Programming : <form:checkbox path="hobbies" value="programming" />
            <br/>

            <label>Gender : </label>
            Male <form:radiobutton path="gender" value="male" />
            FeMale <form:radiobutton path="gender" value="female" />

            <br/>

            <input type ="submit" value="Register">

        </form:form>
    </div>


</body>


</html>