package br.univille;

import br.univille.entity.Cidade;
import br.univille.entity.Cliente;
import br.univille.entity.Pokemon;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        
        Cidade joinville = new Cidade();
        joinville.setNome("Joinville");
        joinville.setEstado("SC");

        Pokemon jigglypuff = new Pokemon("Jigglypuff");
        Pokemon articuno = new Pokemon("articuno");
        

        Cliente zezinho = new Cliente("Zezinho");//new cria uma instância, ou seja, aloca os atributos da variavel tipo Cliente na memória
        zezinho.setNome("Zezinho da silva Sauro");// o sinal de = cria uma referência, relaciona a variavel zezinho com o objeto cliente, ambos em memória
        zezinho.setCidade(joinville);

        zezinho.getListaPokemon().add(jigglypuff);
        zezinho.getListaPokemon().add(articuno);
        
        for(int i=0;i<zezinho.getListaPokemon().size();i++){
            var umPokemon = zezinho.getListaPokemon().get(i);
            System.out.println(umPokemon);
        }
        for(var umPokemon : zezinho.getListaPokemon()){
            System.out.println(umPokemon);
        }

        //gere um codigo para listar os pokemons utilizando o metodo stream
        zezinho.getListaPokemon().stream().forEach(System.out::println); //codigo mais atualizado



        Cliente mariazinha = new Cliente();
        mariazinha.setNome("Mariazinha");
        System.out.println(zezinho);
        System.out.println(mariazinha);
    }
}