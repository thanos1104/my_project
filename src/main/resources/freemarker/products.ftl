<!DOCTYPE html>
<html>
<#import "partial/siteTemplate.ftl" as siteTemplate/>
<head>
	<title>Home</title>
	<@siteTemplate.bootstrapLibraries/>
</head>
<body>
<@siteTemplate.navbar currentPage="products"/>
<!-- Main body -->
<table>
	<#list products as product>
		<tr>
			<td>
				${product?counter}
			</td>
			<td>
				${product.getSerial()}
			</td>
			<td>
				${product.name}
			</td>
		</tr>
	</#list>
</table>

<!-- Main body-->

<@siteTemplate.footer/>
</body>
</html>
