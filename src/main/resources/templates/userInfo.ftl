<!DOCTYPE HTML>
<html >
<#include "/include/meta.ftl">
<body>
	<div class="container">
		<#include "/include/header.ftl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<b>Candidates</b>
			</div>
			<div class="panel-body">
				<#if candidates?? >
					<table class="table table-striped">
						<tr>
							<th>#</th>
							<th>Name</th>
							<th>Last name</th>
							<th>Email</th>
							<th>Phone number</th>
							<th>Actions</th>
						</tr>
						<#list candidates as candidate>
							<tr>
								<td>${candidate.id}</td>
								<td>${candidate.name}</td>
								<td>${candidate.lastname}</td>
								<td>${candidate.email}</td>
								<td>${candidate.phoneNumber}</td>
								<td><a href="/user/view?id=${candidate.id}">view</a></td>
							</tr>
						</#list>
					</table>
				</#if>   
			<a href="/user/add">Add candidate</a>
			</div>
		</div>

	</div>
</body>
</html>