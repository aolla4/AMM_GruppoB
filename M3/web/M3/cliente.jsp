<%-- 
    Document   : cliente
    Created on : 2-mag-2016, 19.59.34
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
        <meta name="keywords" content="FeltrinOlla,FeltrinOlla cliente">
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
                <div class="contenuto">
       <div id="tab">
        <table>
            
            <tr class="intestazione">
                <th> CD </th>
                <th> Foto </th>
                <th> Pezzi Disponibili </th>
                <th> Prezzo </th>
                <th> Acquista </th>
            </tr>
            <tr class="dispari">
                <td> Adele - 25 </td>
                <td> <img title='adele' alt="foto di Adele 25" src="img/adele.jpg" width="150" height="150"></td>
                <td> 8 </td>
                <td> 15,99 €   </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr class="pari">
                <td>  Marco Mengoni - Parole in Circolo </td>
                <td> <img title='mengoni' alt="foto di Mengoni" src="img/mengoni.jpg" width="150" height="150"> </td>
                <td> 14 </td>
                <td> 12,50 € </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr class="dispari">
                <td> Salmo - Hellvisback </td>
                <td> <img title='salmo' alt="foto di salmo" src="img/salmo.jpg" width="150" height="150"> </td>
                <td> 3 </td>
                <td>16 € </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr class="pari">
                <td> Vasco Rossi - Sono Innocente </td>
                <td> <img title='vasco' alt="foto di vasco" src="img/vasco.jpg" width="150" height="150"> </td>
                <td> 18 </td>
                <td> 21,99 € </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
            <tr class="dispari">
                <td> Nirvana - Never Mind </td>
                <td> <img title='nirvana' alt="foto nirvana" src="img/nirvana.jpg" width="150" height="150"> </td>
                <td> 28 </td>
                <td> 10,95 € </td>
                <td> <a href="cliente.html"> Aggiungi al carrello </a> </td>
            </tr>
        </table>
</div>
                </div>
        
            <%@ include file="BlocchiDinamici/footer.jsp" %>
        </div> 
        </div>
    </body>
</html>



