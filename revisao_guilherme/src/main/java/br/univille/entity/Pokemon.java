package br.univille.entity;

public class Pokemon {
    private String nome;
    private Cliente dono;

    public Pokemon(String nome){
        this.nome = nome;
    }
    
    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public String toString() {
        return nome;
    }


}