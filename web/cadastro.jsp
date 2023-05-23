
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Cliente</title>
    </head>
    <body>
        <h1>Cadastro do Cliente</h1>
        <hr>
        <form action="Informações Pessoais" method="post">
            <h3>Informações Pessoais</h3>
            <h3>Gênero</h3>
            <input type="checkbox" name="masculino" value="sim"> <label>Masculino</label>  
            <input type="checkbox" name="feminino" value="sim"> <label>Feminino</label>
            <input type="checkbox" name="outros" value="sim"> <label>Outros</label> <br><br>
            <input type="text" name="cliente" placeholder="Nome do Completo">
            <br><br>
            <input type="text" name="email do cliente" placeholder="Email@email.com">
            <br><br>
            <input type="text" name="senha do cliente" placeholder="Senha">
            <h3>Endereço</h3>
            <input type="text" name="endereço" placeholder="Endereço"><br><br>
            <input type="text" name="cidade" placeholder="Cidade"><br><br>
            <input type="text" name="bairro" placeholder="Bairro"><br><br>
            <input type="text" name="estado" placeholder="Estado"<br><br>
            <br><br>
            <input type="submit" value="Registrar" ><hr><br>
            
            
        </form>
        <a href="home.jsp" >Pagina inicial</a>
        
    </body>
</html>
