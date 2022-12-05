<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Homepage</title>
<script type="text/javascript">

    function validateUserName(){
        var userName = document.getElementById('un').value;
        var password = document.getElementById('pw').value;
        if(userName.length < 1){
            alert("Uhum! Where is your name?")
            return false;
        }
        if(password.length < 1){
            alert("Yo! Gimme the Password.")
            return false;
        }

        else{
            return true;
        }

    }
</script>
</head>


<body>

    <h1 align ="center">Friendship Calculator <3</h1>
    <h3 align ="center">LOG IN BELOW</h3>
    <hr/>

    <form:form action="user-homepage" method="get" onsubmit="return validateUserName()">
            <div align="center">
                <p>
                    <label for="un">U S E R N A M E  :</label>
                    <input type="text" id="un"/>
                </p>

                <p>
                    <label for="pw">P A S S W O R D  :</label>
                    <input type="text" id="pw"/>
                </p>

                <input type="submit" value="LOGIN"><br/>
                <input type="submit" value="REGISTER">
            </div>
    </form:form>

</body>


</html>