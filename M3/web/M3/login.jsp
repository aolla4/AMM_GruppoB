<%-- 
    Document   : login
    Created on : 3-mag-2016, 11.05.16
    Author     : mariabernadetta
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <%@ include file="BlocchiDinamici/header.jsp" %>
        <div class="corpo">
          <c:choose>
            <c:when test="${sellerlogg|| clientlogg}">
                <%@ include file="BlocchiDinamici/leftlogged.jsp" %>
            </c:when>
            
            <c:when test="${!sellerlogg && !clientlogg}">
                <%@ include file="BlocchiDinamici/sidebarleft.jsp" %>
            </c:when>
        </c:choose>
        </div>
        <<%@ include file="BlocchiDinamici/siderbarright.jsp" %>
        <div class="contenuto">
            <div id="login">
        <form>
             <div> <label for='usr' id="username"> Username </label>
                <input type='text' name='usr' id='usr'/> </div>
                    <div> <label for='psw' id="password"> Password </label>
                        <input type="password" name="psw" id="psw" value="ponteponent" /> </div>
        <div> <div id="bottonelogin">
                <input class="bottone" id="pulsantesubmit" type="submit" value="Submit" /> </div>
        </div>
        
        </form>
        </div>
        </div>
           
        
<%@ include file="BlocchiDinamici/footer.jsp" %>
        </div>
    </body>
</html>


