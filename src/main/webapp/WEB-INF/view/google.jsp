<html>
<head>
<title>Hello Google</title>
</head>
<body>
	<h3>
		Hello, <span th:text="${googleProfile.givenName}"></span>
			<span th:text="${googleProfile.familyName}"></span>
	</h3>
	<h4>
		<span th:text="${googleProfile.id}"></span>
	</h4>
	<div th:each="post:${googleProfile.emailAddresses}">
		Email : <b th:text="${post}"></b>
		<hr />
	</div>
</body>
</html>