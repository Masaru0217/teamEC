<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/inputForm.css">
<title>createDestination画面</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp" />
	</div>

	<h1>宛先情報入力画面</h1>

	<!--     confirmActionでErrorがあったとき、メッセージを出力する -->
	<s:if test="Message_family_name.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_family_name">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_first_name.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_first_name">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_family_name_kana.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_family_name_kana">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_first_name_kana.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_first_name_kana">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_user_address.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_user_address">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_tel_number.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_tel_number">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="Message_Email.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="Message_Email">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if test="errorMessage !=''">

		<!--     入力された情報を出力する -->
		<s:property value="errorMessage" escape="false" />
	</s:if>

	<!-- 情報を飛ばさす先のアクションを指定 -->
	<s:form action="CreateDestinationConfirmAction">
		<div class="input_form">
			<table border="1" class="input_table">
				<tr>
					<th>姓</th>
					<td><s:textfield cssClass="input_text" name="family_name"
							placeholder="姓" value="%{#session.family_name}" /></td>
				</tr>
				<tr>

					<th>名</th>
					<td><s:textfield cssClass="input_text" name="first_name"
							placeholder="名" value="%{#session.first_name}" /></td>
				</tr>

				<tr>
					<th>姓ふりがな</th>
					<td><s:textfield cssClass="input_text" name="family_name_kana"
							placeholder="姓ふりがな" value="%{#session.family_name_kana}" /></td>
				</tr>

				<tr>
					<th>名ふりがな</th>
					<td><s:textfield cssClass="input_text" name="first_name_kana"
							placeholder="名ふりがな" value="%{#session.first_name_kana}" /></td>
				</tr>

				<tr>
					<th>住所</th>
					<td><s:textfield cssClass="input_text" name="user_address"
							placeholder="住所" value="%{#session.user_address}" /></td>
				</tr>

				<tr>
					<th>電話番号</th>
					<td><s:textfield cssClass="input_text" name="tel_number"
							placeholder="電話番号" value="%{#session.tel_number}" /></td>
				</tr>

				<tr>
					<th>メールアドレス</th>
					<td><s:textfield cssClass="input_text" name="email"
							placeholder="メールアドレス" value="%{#session.email}" /></td>
				</tr>
			</table>
		</div>
		<div class="submit_btn_box">
			<s:submit cssClass="submit_btn" value="確認" />
		</div>
	</s:form>
</body>
</html>