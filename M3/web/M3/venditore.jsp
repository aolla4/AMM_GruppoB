<%-- 
    Document   : venditore
    Created on : 3-mag-2016, 11.02.44
    Author     : mariabernadetta
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>FeltrinOlla</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name='author' content="Alberto Olla">
        <meta name="keywords" content="FeltrinOlla,FeltrinOlla venditore">
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
            <div id="venditore">
        <form method="get"> 
            <div> <label for='nome'> Nome Dell'Oggetto </label>
                <input type='text' name='nome' id='nome'/> </div>
                <div> <label for='url'> Url di descrizione dell'oggetto </label>
                    <input type='url' name='usr' id='url'/> </div>
                    <div> <label for='lungo'> Descrizione oggetto </label>
                        <textarea  rows='4' cols='21' name='lungo' id='lungo'>Inserisci un commento... </textarea> </div>
                        <div> <label for='prz'> Prezzo </label>
                            <input type='number' name='prz' id='prz'/> </div>
                            <div><label for='qta'> Pezzi Disponibili dell'Oggetto </label>
                                <input type='number' name='qta' id='qta'/> </div>
        <div id="bottons">
            
                <input class="bottone" type="submit" value="Submit" /> 
                <input class="bottone" type="reset" value="Reset" />
        </div>
        </form>
        </div>
        </div>
        <%@ include file="BlocchiDinamici/footer.jsp" %>
        </div>
        
    
    </body>
</html>

