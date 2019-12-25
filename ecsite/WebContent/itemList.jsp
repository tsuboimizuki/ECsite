<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>itemList画面</title>
</head>
<body>
		<div id="header">
		</div>
		<div id="main">
				<div id="top">
						<p>itemList</p>
				</div>
				<div>
					<s:iterator value="ItemList">
						<tr>
							<td><s:property value ="itemName"/></td>
							<td><s:property value ="itemPrice"/><span>円</span></td>
							<td><s:property value ="itemStock"/><span>個</span></td>
						</tr>
					</s:iterator>
					<s:form action="ItemListDeleteConfirmAction">
							<input type="hidden" name="deleteFlg" value="1">
							<s:submit value="削除"/>
					</s:form>


				</div>

		</div>
		<div id="footer">
		</div>
</body>
</html>