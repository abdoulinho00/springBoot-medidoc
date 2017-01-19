<!DOCTYPE HTML>
<html >
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
   <h1>Add candidate</h1>
   <div>
	<label>Name</label>
	
        <input type="text"
            name="name"  value="${candidate.name}"  readonly
            />
       </div>    
       <div> 
        <label>Last Name</label>
	
        <input type="text"
            name="lastname" value="${candidate.lastname}"  readonly
            />
           </div>
       <div> 
        <label>email</label>
	
        <input type="text"
            name="email"  value="${candidate.email!"default"}"  readonly
            />
           </div>
       <div> 
        <label>Phone</label>
	
        <input type="text"
            name="phoneNumber"  value="${candidate.phoneNumber!""}"  readonly
            />
           </div>
           
           <div>
           		<#if candidate.interviews??  && (candidate.interviews?size >= 1) >
           			<table>
           			<#list candidate.interviews as interview>
           				<tr>
           					<td>${interview.id}</td>
           					<td>${interview.jobTitle}</td>
           					<td>${interview.jobUrl}</td>
           					<td>${interview.observations}</td>
           				</tr>
           			</#list>
           			</table>
           		<#else>
           			you don't have any interview yet
           		</#if>
           </div>
           
           <a href="/user/addInterview?id=${candidate.id}">Click here to add an interview</a>
   

</body>
</html>