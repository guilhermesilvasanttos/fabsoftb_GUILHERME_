package br.univille.entity;

public class Cliente {
    private long id;
    private String nome;
    private String endereço;
    

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    //CONSTRUTOR COM PARAMETRO
    public Cliente(String nome) {
        this.nome = nome;
    }
    //CONSTRUTOR SEM PARAMETRO
    // public Cliente() {
    // }
    //VARIAVEL OU ATRIBUTO
    // private String nome;
    //METODO TRANSFORMADOR
    public String toString(){
        return getNome();
    }
    //MÉTODOS GETTER E SETTER 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
