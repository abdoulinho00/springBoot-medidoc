<!DOCTYPE HTML>
<html >
<#include "/include/meta.ftl">
<#assign editmode = RequestParameters["edit"]?? && RequestParameters["edit"] == "true" />
<body>
	<div class="container">
		<#include "/include/header.ftl">
		<form method="post">
			<input type="hidden" name="id" value="id"  />
			<div class="panel panel-default">
				<div class="panel-heading">
					<b>Candidate details</b>
				</div>
				<div class="panel-body">
					<div class="form-group">
						<label>Name</label>
						<input type="text" name="name" value="${candidate.name}" class="form-control" <#if !editmode>readonly</#if> >
					</div>    
					<div class="form-group">
						<label>Last Name</label>
						<input type="text" name="lastname" value="${candidate.lastname}" class="form-control" <#if !editmode>readonly</#if>>
					</div>    
					<div class="form-group">
						<label>Email</label>
						<input type="email" name="email"  value="${candidate.email}" class="form-control" <#if !editmode>readonly</#if>>
					</div>    
					<div class="form-group">
						<label>Phone</label>
						<input type="text" name="phoneNumber"  value="${candidate.phoneNumber}" class="form-control" <#if !editmode>readonly</#if>>
					</div>
					
					<#if editmode>
						<div>
						<button type="submit" class="btn btn-default">Edit</button>
						</div>
					</#if>
					
	           		<#if candidate.interviews??  && (candidate.interviews?size >= 1) >
	           		<div>
	           			<label>Interviews</label>
	           			<table class="table table-striped">
	           				<tr>
	           					<th>#</th>
	           					<th>Job title</th>
	           					<th>Job URL</th>
	           					<th>Observations</th>
	           				</tr>
		           			<#list candidate.interviews as interview>
		   						<tr>
		           					<td>${interview.id}</td>
		           					<td>${interview.jobTitle}</td>
		           					<td>${interview.jobUrl}</td>
		           					<td>${interview.observations}</td>
		           				</tr>
		           			</#list>
	           			</table>
	           		</div>
	           		<#else>
	           		<div class="text-center">
	           			<span class="text-center">you don't have any interview yet</span>
	           		</div>
	           		</#if>
	           		
	           		<a href="/user/addInterview?id=${candidate.id}" class="btn btn-default"><span class="glyphicon glyphicon-plus"> </span>Add interview</a>
	           	</div>
			</div>
			
		</form>
	</div>
				   

</body>
</html>