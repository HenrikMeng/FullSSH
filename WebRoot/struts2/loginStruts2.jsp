<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<s:form name="f" action="/struts2/login2Action.action" cssStyle="../css/css1.css">
			<table align="center">
				<s:textfield label="�û���" name="user.uname"></s:textfield>
				<s:password label="����" name="user.upwd"></s:password>
				<s:submit value="�ύ" ></s:submit>
				<s:reset value="����"></s:reset>
			</table>
		</s:form>
	</body>
</html>

