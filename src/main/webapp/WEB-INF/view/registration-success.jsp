<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Homepage</title>
</head>


<body>

<h1>Registration is successful.</h1>
<h4>The details entered by you are - ></h4>
User : ${userReg.name}<br/>
User Name : ${userReg.username}<br/>
Password : ${userReg.password}<br/>
Country : ${userReg.countryName}<br/>
Hobbies : ${userReg.hobbies}<br/>
Gender : ${userReg.gender}<br/>

</body>


</html>