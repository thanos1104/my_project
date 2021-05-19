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

<form method="post" action="/mvc/register" name="customer">
	<label>Email</label>
	<input type="text" name="email">
	<label>First Name</label>
	<input type="text" name="firstname">
	<label>Last Name</label>
	<input type="text" name="lastname">
	<input type="submit">
</form>
<#if registrationSuccessful??>
	<h1>You have been registered!</h1>
</#if>

<!-- Main body-->

<@siteTemplate.footer/>
</body>
</html>
