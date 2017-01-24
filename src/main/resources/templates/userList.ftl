<!DOCTYPE html>  
  
<html lang="en">  
  
<body>  
    name: ${name}  
    <br>  
    password: ${password}  
    <br>  
    login_time: ${login_time?datetime}  
    <br>  
    user_name: ${user.name}  
    <br>  
    user_age: ${user.age} 
    <br>s
    user_sex: ${user.sex} 
    <br>
    ===============================================
    <br>	
    <#list users as user>
    	<span>user_name: ${user.name}</span>
    	<span>user_age: ${user.age}</span>
    	<span>user_sex: ${user.sex}</span>
    	<br>
    </#list>
    
</body>  
  
</html>  