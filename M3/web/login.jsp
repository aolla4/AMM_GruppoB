<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title> FeltrinOlla </title>
     <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name='author' content="Alberto Olla">
        <meta name="keywords" content="FeltrinOlla,FeltrinOlla login">
    <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    
    </head>
    <body>
        <div class="page">
         <%@ include file="Parti/header.jsp" %>
        <div class="corpo">
                <%@ include file="Parti/sidebarleft.jsp" %>
        </div>
        <%@ include file="Parti/sidebarright.jsp" %>
     
        <div class="contenuto">
     
            <div id="login">
        <form method="post" action="login.html">
             <div> <label for='usr' id="username"> Username </label>
                <input type='text' name='usr' id='usr'/> </div>
                    <div> <label for='psw' id="password"> Password </label>
                        <input type="password" name="psw" id="psw" value="ponteponent" /> </div>
        <div id="bottonelogin">
                <c:if test="${login_fallito != null}">
                    <div class="loginfallito"> <p id="fallito"> Login fallito! <p> </div>
               </c:if>
                <input class="bottone" id="pulsantesubmit" name="submit"  type="submit" value="Submit" /> 
            
            </div>
            
        
        
        </form>
        </div>
        
             
          
        </div>
           
         <%@ include file="Parti/footer.jsp" %>
    </body>
</html>


