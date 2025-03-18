package br.univille;

import br.univille.entity.Cliente;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Carlos");

        Cliente carlos = new Cliente("carluxo");
        Cliente lolo = new Cliente("lorenzo");

        System.out.println(carlos.getNome() + " " + lolo.getNome());
        System.out.println(carlos.toString());
        System.out.println(lolo.hashCode());
        System.out.println(carlos.getNome().equals(lolo.getNome()));
    }
}
package br.univille;

import br.univille.entity.Cliente;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Carlos");

        Cliente carlos = new Cliente("carluxo");
        Cliente lolo = new Cliente("lorenzo");

        System.out.println(carlos.getNome() + " " + lolo.getNome());
        System.out.println(carlos.toString());
        System.out.println(lolo.hashCode());
        System.out.println(carlos.getNome().equals(lolo.getNome()));
    }
}
