<html>

<body>

<h1>List of companies</h1>

<#if companies??>
	<table>
		<#list companies as company>
			<tr>
				<td>${company.id}</td>
				<td>${company.name}</td>
				<td>${company.companyWebsite}</td>
				<td>${company.location}</td>
			</tr>
		</#list>
	</table>
</#if>

<a href="/companies/add">add a company</a>
</body>
</html>