<%@ page import="jakarta.servlet.http.Cookie" %>
<%
  // create a new cookie
  Cookie myCookie = new Cookie("Name", "MuskanBhandari");

  // set the cookie's maximum age (in seconds)
  myCookie.setMaxAge(3600); // expires in 1 hour

  // add the cookie to the response
  response.addCookie(myCookie);
%>

<html>
<head><title>Cookie Example</title></head>
<body>
  <h1>Cookie Example</h1>
  <p>A cookie has been saved with the name 'Name' and value 'Muskan Bhandari'.</p>
</body>
</html>
