<%-- 
    Document   : descrizione
    Created on : 2-mag-2016, 18.45.52
    Author     : mariabernadetta
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
    <title>FeltrinOlla</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name='author' content="Alberto Olla">
        <meta name="keywords" content="FeltrinOlla,FeltrinOlla descrizione">
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
            <%@ include file="BlocchiDinamici/siderbarright.jsp" %>

        </div>
            <div class="contenuto">
    <h2> Descrizione </h2>
    <div id="indice">
    <ul> 
        <li> <a href='#primo'>Chi Siamo </a> </li>
        <li> <a href='#secondo'>Venditori</a> </li>
        <li> <a href='#terzo'>Acquirenti </a> </li>
    </ul>
    </div>
    <div id="description">
    <h3 id='primo'> Chi Siamo? </h3>
    <p> Siamo un'azienda e-commerce che si occupa della vendita e dell'acquisto di cd musicali,la nostra raccolta comprende pi&ugrave; di 3000 cd,copriamo ogni tipo di genere musicale,dagli anni '50 fino ai giorni d'oggi.<p>
    <h3 id='secondo'> Venditori </h3>
    <p> Potranno controllare il proprio saldo, inserire e rimuovere propri oggetti in vendita </p>
    <h3 id='terzo'> Acquirenti </h3>
    <p> Potranno ricaricare il proprio saldo e procedere all'acquisto di uno o pi&ugrave; dei nostri oggetti <p> 
     </div>
    </div>
    
           

                 
  <%@ include file="BlocchiDinamici/footer.jsp" %>
</div>
    </body>
</html>

