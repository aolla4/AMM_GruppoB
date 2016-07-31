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
        <%@ include file="Parti/header.jsp" %>
        <div class="corpo">
         <%@ include file="Parti/loggatosideleft.jsp" %>
            
                
<%@ include file="Parti/sidebarright.jsp" %>
                <div class="contenuto">
                    <c:choose> 
                        <c:when test="${loggedclient == true}">
                            
                            
       <div id="tab">
        <table>
            
            <tr class="intestazione">
                <th> CD </th>
                <th> Foto </th>
                <th> Pezzi Disponibili </th>
                <th> Prezzo </th>
                <th> Acquista </th>
            </tr>
            <c:forEach var="i" items="${ObjectList}">
            <tr class="dispari">
                <td> ${i.objname}</td>
                <td> <img  src="${i.objurl}" width="150" height="150"> </td>
                <td> ${i.objdisp} </td>
                <td> ${i.objprice} </td>
                <td> <a href="cliente.html?objId=${i.objid}"> Aggiungi al carrello </a> </td>
            </tr>
            </c:forEach>
        </table>
</div>
                        </c:when>
       <c:when test="${sellerlogged == true}">
           <h3> Area Clienti,non puoi accedere! </h3>
       </c:when>
                    </c:choose>
                </div>
        
            <%@ include file="Parti/footer.jsp" %>
        </div> 
        </div>
    </body>
</html>

