<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <%@ include file="Parti/header.jsp" %>
        <div class="corpo">
    <%@ include file="Parti/loggatosideleft.jsp" %>
  <%@ include file="Parti/sidebarright.jsp" %>
        </div>
        <div class="contenuto">
        <c:choose>
            

            
            <c:when test="${incompletezzadati == true}">
                <h3>Inserire tutti i campi!</h3>
            </c:when>
                
                <c:when test="${aggiuntaoggetto == true}">
                                <div id="tab2">
            <h3> Riepilogo Inserimento </h3>
            <table>  
                <tr class="intestazione">
                    <th> CD </th>
                    <th> Foto </th>
                    <th> Descrizione </th>
                    <th> Pezzi disponibili </th>
                    <th> Prezzo </th>
                </tr>
                
                <tr class="dispari">
                    <td> ${newob.objname} </td>
                    <td> <img title="Foto" src="${newob.objurl}" 
                              width="120" height="140" alt="Foto ${newob.objname}"/> </td>
                    <td class="Descrizione"> ${newob.objdesc} </td>
                    <td> ${newob.objdisp} </td>
                    <td> ${newob.objprice} € </td>
                </tr>
            </table>
            </div>
                </c:when>
            
            <c:when test="${sellerlogged == true}">
              
           <h3> Benvenuto </h3>
     
            <div id="venditore">
      <form action="venditore.html" method="post">
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
            
                <input class="bottone" name="sellersubmit" type="submit" value="Submit" /> 
                <input class="bottone" type="reset" value="Reset" />
        </div>
        </form>
             </div> 
            </div>
            </c:when>
     
                        <c:when test="${loggedclient == true}">
                <h3> Questa è la sezione per un venditore! </h3>
            </c:when>
       
          </c:choose>
        
 <%@ include file="Parti/footer.jsp" %>
        </div>
        
    
    </body>
</html>

