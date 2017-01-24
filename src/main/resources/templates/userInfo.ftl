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
								<td>
									<a href="/user/view?id=${candidate.id}" class="actionLinks"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
									<a href="/user/view?id=${candidate.id}&edit=true" class="actionLinks"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
									<a href="/user/delete?id=${candidate.id}" class="actionLinks" onclick="return confirm('Are you sure you want to delete?');"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
								</td>
							</tr>
						</#list>
					</table>
				</#if>   
			<a href="/user/add" class="btn btn-default"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add candidate</a>
			</div>
		</div>

	</div>
<script>
	$('#removeDialog').click(function(){
    return confirm("Are you sure you want to delete?");
})
</script>
</body>

</html>