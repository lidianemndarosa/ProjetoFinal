package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    private static Connection conn;
    
    public ClienteDAO() throws ClassNotFoundException, SQLException {
        conn = MyDatabase.getDatabase();
    }
    
    //****Métodos do CRUD****
    //INSERT (Create)
    public void insertCliente(Cliente a) throws SQLException{
        //Criando a query para inserir o registro
        String query = "INSERT INTO artistas(nome, cod_genero, nacionalidade, solo)"
                + "VALUES(?,?,?,?)";
        
        //Preparar a query para ser executada no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        prep.setString(1, a.getCliente());
        prep.setInt(2, a.getGenero());
        prep.setString(3, a.getNacionalidade());
        prep.setInt(4, a.getSolo());
        
        //Executando a query pronta
        prep.execute();
        prep.close();
    }
    
    
    //SELECT
    public ArrayList<Cliente> listAll() throws SQLException {
        //Criar lista vazia
        ArrayList<Cliente> list = new ArrayList<>();
        
        //Criar query para pesquisa no BD
        String query = "SELECT * FROM artistas";
        
        //Preparar query para executar no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        //Pegar o resultado da pesquina no BD
        ResultSet res = prep.executeQuery();
        
        //Varrer "res" mapeando os registros do BD
        //Para objetos da classe "Artista"
        while(res.next()) {
            //Criar objeto Artista vazio
            Cliente art = new Cliente();
            
            //Inserir os valores nos atributos com
            //os dados vindos das colunas do BD
            art.setIdCliente(res.getInt("cod_artista"));
            art.setCliente(res.getString("nome"));
            art.setGenero(res.getInt("cod_genero"));
            art.setNacionalidade(res.getString("nacionalidade"));
            art.setSolo(res.getInt("solo"));
            
            //Inserir o objeto completo na lista
            list.add(art);
        }
        
        //Retornar lista cheia
        return list;
    }
    
    
    //SELECT
    public Cliente listById(int i) throws SQLException {
        String query = "SELECT * FROM artistas "
                + "WHERE cod_artista = " + i;
        
        PreparedStatement prep = conn.prepareStatement(query);
        ResultSet res = prep.executeQuery();
        
        Cliente art = new Cliente();
        
        if(res.next()) {
            art.setIdCliente(res.getInt("cod_artista"));
            art.setCliente(res.getString("nome"));
            art.setGenero(res.getInt("cod_genero"));
            art.setNacionalidade(res.getString("nacionalidade"));
            art.setSolo(res.getInt("solo"));
        }
        
        return art;
    }
    
    
    //UPDATE
    public void updateArtista(Cliente art) throws SQLException {
        String query = "UPDATE artistas SET nome = ?,"
                + "cod_genero = ?, nacionalidade = ?,"
                + "solo = ? WHERE cod_artista = ?";
        
        PreparedStatement prep = conn.prepareStatement(query);
        prep.setString(1, art.getCliente());
        prep.setInt(2, art.getGenero());
        prep.setString(3, art.getNacionalidade());
        prep.setInt(4, art.getSolo());
        prep.setInt(5, art.getIdCliente());
        
        prep.execute();
        prep.close();
    }

    public void insertCliente(String cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}//Fim da classe
