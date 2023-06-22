<%-- 
    Document   : index
    Created on : 11/04/2022, 21:13:37
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="Controller">
            <div>
                <label id="lblCodigo" name="lblCodigo">Código</label>
                <input type="text" id="txtCodigo" name="txtCodigo" value="<c:out value="${codigo}"/>"/>
                <label id="lblNome" name="lblNome">Nome</label>
                <input type="text" id="txtNome" name="txtNome" value="<c:out value="${nome}"/>"/>
                <!--<button name="btnEnviar">Enviar</button>-->
                <button name="botao" value="i">Inserir</button>
                <button name="botao" value="a">Alterar</button>
                <button name="botao" value="r">Remover</button>
                <button name="botao" value="c">Consultar</button>
            </div>
            <div>
                <table border="1">
                    <tr><th>Código</th><th>Nome</th></tr>
                            <c:forEach items="${lista}" var="linha">
                        <tr>
                            <td><c:out value="${linha.codigo}"/></td>
                            <td><c:out value="${linha.nome}"/></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </form>
    </body>
</html>
