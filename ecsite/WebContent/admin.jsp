<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
		<div id="header">
		</div>
		<div id="main">
					<div id="top">
							<p>Admin</p>
					</div>
					<div>
							<h1>商品</h1>
					</div>
					<div id="text-center">
							<s:form action="ItemCreateAction">
									<s:submit value="新規登録"/>
							</s:form>
							<s:form action="ItemListAction">
									<s:submit value="一覧"/>
							</s:form>

				</div>
		</div>
		<div id="footer">
		</div>
</body>
</html>