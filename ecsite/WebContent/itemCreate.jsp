<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemCreate画面</title>
</head>
<body>
		<div id= "top">
		</div>
		<div id="main">
				<div id= top>
						<p>商品登録</p>
				</div>
				<div>
						<s:form action="ItemCreateConfirmAction">
							<s:textfield name = "ItemName"/>
							<s:textfield name = "ItemPrice"/>
							<s:textfield name = "ItemStock"/>
							<s:submit value="登録"/>
						</s:form>

				</div>
		</div>
		<div id="footer">
		</div>
</body>
</html>