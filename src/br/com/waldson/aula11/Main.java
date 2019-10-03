package br.com.waldson.aula11;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        for (int i = 0; i < 10; i++) {
            arvore.insert(
              new Node(i)
            );
        }
        arvore.print();
        System.out.println(arvore.ehBalanceada());

        ArvoreBinariaBusca abalanceada = new ArvoreBinariaBusca();
        abalanceada.insert(5);
        abalanceada.insert(3);
        abalanceada.insert(7);
        abalanceada.insert(2);
        abalanceada.insert(4);
        abalanceada.insert(1);
        abalanceada.insert(6);
        abalanceada.insert(8);
        abalanceada.insert(9);

        abalanceada.print();
        System.out.println(abalanceada.ehBalanceada());
        /*

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arvore.insert(
                new Node(i)
            );


        arvore.insert(new Node(10));
        arvore.insert(new Node(8));
        arvore.insert(new Node(11));
        arvore.insert(new Node(9));
        arvore.insert(new Node(5));
        arvore.insert(new Node(7));
        arvore.insert(new Node(1));

        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);

        frame.setVisible(true);

         */
    }
}
