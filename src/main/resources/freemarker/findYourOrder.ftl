<!DOCTYPE html>
<#import "partial/siteTemplate.ftl" as siteTemplate/>
<html>

<head>
	<title>Find your order</title>
	<@siteTemplate.bootstrapLibraries/>
</head>
<body>
<@siteTemplate.navbar currentPage="order"/>

<!-- Main body -->

<form method="get" action="/mvc/find">
	<label>ID</label>
	<input type="text" name="id">
	<input type="submit">
</form>

<!-- Main body-->

<@siteTemplate.footer/>
</body>
</html>
