<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<s:form name="f" action="/struts2/login2Action.action" cssStyle="../css/css1.css">
			<table align="center">
				<s:textfield label="用户名" name="user.uname"></s:textfield>
				<s:password label="密码" name="user.upwd"></s:password>
				<s:submit value="提交" ></s:submit>
				<s:reset value="重置"></s:reset>
			</table>
		</s:form>
	</body>
</html>

