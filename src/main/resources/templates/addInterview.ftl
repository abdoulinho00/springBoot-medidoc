<!DOCTYPE HTML>
<html >
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
   <h1>Add Interview</h1>
   <form  action="/user/addInterview" method="post">
   <h3>Candidate : ${candidate.name} ${candidate.lastname} </h3>
   <input type="hidden" value="${candidate.id}" name="id"/>
   <div>
	<label>jobTitle</label>
	
        <input type="text"
            name="jobTitle" 
            />
       </div>    
       <div> 
        <label>jobUrl</label>
	
        <input type="text"
            name="jobUrl" 
            />
           </div>
       <div> 
        <label>observations</label>
	
        <input type="text"
            name="observations" 
            />
           </div>
       <div> 
        <label>Company</label>
		<select name="company_id">
			<#if companies??>
			<#list companies as company>
				<option value="${company.id}">${company.name}</option>
			</#list>
			</#if>
		</select>
           </div>
       
           
            <button type="submit">Save</button>
   </form>
</body>
</html>