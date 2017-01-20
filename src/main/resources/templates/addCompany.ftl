<html>
<#include "/include/meta.ftl">
<body>

<div class="container">
	<#include "/include/header.ftl">
	<div class="panel panel-default">
		<div class="panel-heading">
			<b>Add company</b>
		</div>
		<div class="panel-body">
			<form method="post">
				<div class="form-group">
					<label for="name">Name </label>
					<input id="name" type="text" name="name" class="form-control">
				</div>
				<div class="form-group">
					<label>website </label>
					<input type="text" name="companyWebsite" class="form-control"/>
				</div>
				<div class="form-group">
					<label>location </label>
					<input type="text" name="location" class="form-control"/>
				</div>
				<div class="form-group">
					<label>Size </label>
					<input type="text" name="size" class="form-control"/>
				</div>
				<div class="form-group">
					<label>Activity </label>
					<input type="text" name="activity" class="form-control"/>
				</div>
				
				<button type="submit" class="btn btn-default"> add company</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>