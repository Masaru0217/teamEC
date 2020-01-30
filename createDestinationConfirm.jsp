<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/inputForm.css">
<title>createDestinationConfirm画面</title>
</head>
<body>
	 <div id="header">
		<jsp:include page="header.jsp" />
	</div>
	<h1>宛先情報入力確認画面</h1>
	<s:form action="CreateDestinationCompleteAction">
		<div class="input_form">
			<table class="input_table" border="1">

				<tr>
					<th>姓</th>
					<td><s:property  value="family_name" escape="false" /></td>
				</tr>

				<tr>
					<th>名</th>
					<td><s:property value="first_name" escape="false" /></td>
				</tr>

				<tr>
					<th>姓ふりがな</th>
					<td><s:property value="family_name_kana" escape="false" /></td>
				</tr>

				<tr>
					<th>名ふりがな</th>
					<td><s:property value="first_name_kana" escape="false" /></td>
				</tr>

				<tr>
					<th>住所</th>
					<td><s:property value="user_address" escape="false" /></td>
				</tr>

				<tr>
					<th>電話番号</th>
					<td><s:property value="session.tel_number" escape="false" /></td>
				</tr>

				<tr>
					<th>メールアドレス</th>
					<td><s:property value="session.email" escape="false" /></td>
				</tr>
			</table>
		</div>
		<div class="submit_btn_box">
		<input class="submit_btn" type="submit" value="登録" />
		</div>

	</s:form>
	<div class="submit_btn_box">
		<s:form action="CreateDestinationAction">

			<input class="submit_btn" type="hidden" name="backFlag" value="true" />
			<input class="submit_btn"type="submit" value="戻る" />
		</s:form>
	</div>
</body>
</html>