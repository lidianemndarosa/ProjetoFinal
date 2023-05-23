<%-- 
    Document   : boletim
    Created on : 22 de mai. de 2023, 18:53:46
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atendimento</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <hr>
        <form action="Boletim de Atendimento" method="post">
            <h3>Boletim de Atendimento</h3>
            <input type="text" name="cliente" placeholder="Nome do Cliente">
            <br><br>
            <select name="genero" required>
                <option value="">Selecione o Equipamento</option>
                <option value="1">Brother</option>
                <option value="2">HP</option>
                <option value="3">Ricoh</option>
                <option value="4">Epson</option>
                <option value="5">Canon</option>
            </select>
            <br><br>
            <input type="text" name="regiao/cidade" placeholder="Região/Cidade">
            <br><br>
            <h3>Avaliação do Atendimento</h3>
            <input type="checkbox" name="muito bom" value="sim"> <label>Muito Bom ;)</label>  
            <input type="checkbox" name="bom" value="sim"> <label>Bom :/</label>  
            <input type="checkbox" name="ruim" value="sim"> <label>Ruim :(</label>  
            <br><br>
            <input type="submit" value="Registrar" ><hr><br>
            
            
        </form>
        <a href="home.jsp" >Pagina inicial</a>
        
    </body>
</html>
