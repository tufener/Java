<%@ page import="java.io.*,java.util.*"%>


<html>

<head>

<title>Applcation object in JSP</title>

</head>

<body>
<%-- 	<%
		Integer hitsCount = (Integer) application.getAttribute("hitCounter");
		if (hitsCount == null || hitsCount == 0)
		{
			/* First visit */
			out.println("Welcome to my website!");
			hitsCount = 1;
		} else
		{	/* return visit */
			out.println("Welcome back to my website!");
			hitsCount += 1;
		}
		application.setAttribute("hitCounter", hitsCount);
	%> --%>
	
	Object o = application.getAttribute("hitCounter");
		int hitsCount = 0;
		if (o == null)
			application.setAttribute("hitCounter", hitsCount);
		else {
			hitsCount = (int) o;
			hitsCount += 1;
		}
		application.setAttribute("hitCounter", hitsCount);
		out.print(hitsCount);

</body>
</html>