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
				�û�����
				<html:text property="uname"></html:text>
				<br>
				��&nbsp;&nbsp;�룺
				<html:password property="upwd"></html:password>
				<br>
				<br>
				<html:submit />
				<html:cancel />
			</center>
		</html:form>
	</body>
</html>

