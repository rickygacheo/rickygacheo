<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h3>入门程序</h3>
<a href="Hello?username=test"> 入门程序</a>

<form action="Hello" method="post">
    name:<input type="text" name="username"/>
    password:<input type="text" name="password"/>
    age:<input type="text" name="age"/>
    date:<input type="text" name="date"/>
    <input type="submit"/>
</form>
<br/>

<form action="uploadFile" method="post">
    select file: <input type="file" name="file1"/>
    <input type="submit" name="upload"/>
</form>

</body>
</html>
