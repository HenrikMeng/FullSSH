<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<html:form action="/loginStruts1">
			<hr>
			<center>
				ÓÃ»§Ãû£º
				<html:text property="uname"></html:text>
				<br>
				ÃÜ&nbsp;&nbsp;Âë£º
				<html:password property="upwd"></html:password>
				<br>
				<br>
				<html:submit />
				<html:cancel />
			</center>
		</html:form>
	</body>
</html>

