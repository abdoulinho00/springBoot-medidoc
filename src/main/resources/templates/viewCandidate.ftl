<!DOCTYPE HTML>
<html >
<#include "/include/meta.ftl">
<body>
	<div class="container">
		<#include "/include/header.ftl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<b>Candidate details</b>
			</div>
			<div class="panel-body">
				<div class="form-group">
					<label>Name</label>
					<input type="text" name="name" value="${candidate.name}" class="form-control" readonly >
				</div>    
				<div class="form-group">
					<label>Last Name</label>
					<input type="text" name="lastname" value="${candidate.lastname}" class="form-control" readonly>
				</div>    
				<div class="form-group">
					<label>Email</label>
					<input type="email" name="email"  value="${candidate.email}" class="form-control" readonly>
				</div>    
				<div class="form-group">
					<label>Phone</label>
					<input type="text" name="phoneNumber"  value="${candidate.phoneNumber}" class="form-control" readonly>
				</div>
				
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
           		
           		<a href="/user/addInterview?id=${candidate.id}">Click here to add an interview</a>
           	</div>
		</div>
	</div>
				   

</body>
</html>