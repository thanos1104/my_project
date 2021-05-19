<!DOCTYPE html>
<#import "partial/siteTemplate.ftl" as siteTemplate/>
<html>

<head>
	<title>Home</title>
	<@siteTemplate.bootstrapLibraries/>
</head>
<body>
<@siteTemplate.navbar currentPage="home"/>

<!-- Main body -->

${test}

<!-- Main body-->

<@siteTemplate.footer/>
</body>
</html>
