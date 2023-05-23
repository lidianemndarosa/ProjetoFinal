package model;

public class Cliente {
    private int idCliente;
    private String cliente;
    private int genero;
    private String nacionalidade;
    private int solo;

    public Cliente(String cliente, int genero, String nacionalidade, int solo) {
        this.cliente = cliente;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.solo = solo;
    }
    
    public Cliente(){}

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getSolo() {
        return solo;
    }

    public void setSolo(int solo) {
        this.solo = solo;
    }
    
    
}
