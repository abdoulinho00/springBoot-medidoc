<!DOCTYPE HTML>
<html >
<#include "/include/meta.ftl">
<body>
	<div class="container">
		<#include "/include/header.ftl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<b>Add candidate</b>
			</div>
			<div class="panel-body">
				<form method="post">
					<div class="form-group">
						<label>Name</label>
						<input type="text" name="name" class="form-control" >
					</div>    
					<div class="form-group">
						<label>Last Name</label>
						<input type="text" name="lastname" class="form-control" >
					</div>    
					<div class="form-group">
						<label>Email</label>
						<input type="email" name="email" class="form-control" >
					</div>    
					<div class="form-group">
						<label>Phone</label>
						<input type="text" name="phoneNumber" class="form-control" >
					</div> 
					<button type="submit" class="btn btn-default">Save</button>   
				</form>
			</div>
		</div>
	</div>
</body>
</html>