<!DOCTYPE HTML>
<html >
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
   <h1>Welcome</h1>
   <#if candidates?? >
   		<table>
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
</body>
</html>