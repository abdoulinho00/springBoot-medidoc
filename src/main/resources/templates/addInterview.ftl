<!DOCTYPE HTML>
<html >

<#include "/include/meta.ftl">
<body>
	<div class="container">
		<#include "/include/header.ftl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<b>Add interview for ${candidate.name} ${candidate.lastname}</b>
			</div>
			<div class="panel-body">
				<form action="/user/addInterview" method="post">
					<div class="form-group">
						<label>Job title</label>
						<input type="jobTitle" name="name" class="form-control" >
					</div>
					<div class="form-group">
						<label>jobUrl</label>
						<input type="text" name="jobUrl" class="form-control" >
					</div>
					<div class="form-group">
						<label>observations</label>
						<input type="jobTitle" name="observations" class="form-control" >
					</div>
					<div class="form-group">
						<label>Company</label>
						<select name="company_id" class="form-control">
							<#if companies??>
								<#list companies as company>
									<option value="${company.id}">${company.name}</option>
								</#list>
							</#if>
						</select>
					</div>
					
					<button type="submit" class="btn btn-default">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>