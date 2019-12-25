<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ItemCreateConfirm画面</title>
</head>
<body>
		<div id="header">
		</div>
		<div id="main">
				<div id="top">
						<p>UserCreateConfirm</p>
				</div>
				<div>
						<s:form action="ItemCreateCompleteAction">
								<s:submit value="完了"/>
						</s:form>

				</div>
		</div>
		<div id="footer">
		</div>
</body>
</html>