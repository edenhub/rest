<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 14-10-18
  Time: 下午3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<p><a href="../webapi/users/jack">users</a> </p>
<p>
    <form action="../webapi/users/jacks" method="post">
    <input type="submit">
    </form>
</p>

<p>
    <a href="../webapi/params?name=jack&age=22&myParam=kkkkkkk">paramTest</a>
</p>
<p>
    <form action="../webapi/myForm" method="post">
        <input name="name"><br>
        <input type="submit"/>
    </form>
</p>

<p>
    <form action="../webapi/myBean/jack" method="post">
        <input name="age"><br/>
        <input type="submit"/>
    </form>
</p>
<p><a href="../webapi/req">request</a> </p>
</body>
</html>
