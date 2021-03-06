<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<title>ログイン画面</title>
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.js"></script>
<style>
.main.container {
	padding-top: 7em;
}

.ui.form .error.message {
	display: block !important;
}
</style>
</head>
<body>
	<div class="ui fixed inverted menu">
		<div class="ui container">
			<p class="header item">掲示板サンプル</p>
		</div>
	</div>
	<div class="ui main text container">
		<h2 class="ui header">
			<i class="lock open icon"></i>
			<div class="content">ログイン画面</div>
		</h2>
		<div class="ui segment">
			<form:form modelAttribute="loginForm" class="ui form">
				<form:errors path="*" class="ui error message" />
				<div class="seven wide field">
					<form:label path="loginId">ログインID</form:label>
					<div class="ui left icon input">
						<i class="user icon"></i>
						<form:input path="loginId" />
					</div>
				</div>
				<div class="seven wide field">
					<form:label path="password">パスワード</form:label>
					<div class="ui left icon input">
						<i class="key icon"></i>
						<form:password path="password" />
					</div>
				</div>
				<button type="submit" class="ui primary labeled icon button">
					<i class="sign-in icon"></i>ログイン
				</button>
			</form:form>
		</div>
	</div>
</body>
</html>
