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
							<th>Actions</th>
						</tr>
					</thead>
					<#list companies as company>
						<tr>
							<td>${company.id}</td>
							<td>${company.name}</td>
							<td><a href="${company.companyWebsite}" target="_blank" >${company.companyWebsite}</a></td>
							<td>${company.location}</td>
							<td>${company.activity}</td>
							<td>
								<a href="/companies/view?id=${company.id}" class="actionLinks"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
								<a href="/companies/view?id=${company.id}?edit=true" class="actionLinks"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
								<a href="/companies/delete?id=${company.id}" class="actionLinks"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
							</td>
						</tr>
					</#list>
				</table>
			<#else>
				<span class="text-center">There are no companies registered.</span>
			</#if>
		</div>
	</div>
	<a href="/companies/add" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span>  Add a company</a>
</div>
</body>
</html>