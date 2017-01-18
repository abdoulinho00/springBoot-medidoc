<!DOCTYPE HTML>
<html >
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
   from the list customers
   <#list customers as customer>
   	<p>${customer.name}</p>
   </#list>
</body>
</html>