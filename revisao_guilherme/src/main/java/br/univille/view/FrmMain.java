package br.univille.view;

import javax.swing.JFrame; //importa a classe JFrame do pacote javax.swing
import javax.swing.JLabel;

public class FrmMain extends JFrame{ //Desenha uma tela em java
    public FrmMain(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setTitle("meu primeiro swing");
        var texto = new JLabel( "Meu Texto");
        getContentPane().add(texto);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FrmMain();
    }
}
