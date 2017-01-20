<html>
<#include "/include/meta.ftl">
<body>

<div class="container">
	<#include "/include/header.ftl">
	<div class="panel panel-default">
		<div class="panel-heading">
			<b>List of companies</b>
		</div>
		<div class="panel-body">
			<#if companies??>
				<table class="table table-striped">
					<thead>
						<tr class="strong">
							<th>#</th>
							<th>Company name</th>
							<th>Website</td>
							<th>Location</td>
							<th>Activity</th>
						</tr>
					</thead>
					<#list companies as company>
						<tr>
							<td>${company.id}</td>
							<td>${company.name}</td>
							<td><a href="${company.companyWebsite}" target="_blank" >${company.companyWebsite}</a></td>
							<td>${company.location}</td>
							<td>${company.activity}</td>
						</tr>
					</#list>
				</table>
			<#else>
				<span class="text-center">There are no companies registered.</span>
			</#if>
		</div>
	</div>
	<a href="/companies/add">add a company</a>
</div>
</body>
</html>