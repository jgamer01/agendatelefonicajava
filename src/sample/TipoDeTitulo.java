package com.company;

public class TipoDeTitulo {
    static void show(String TipoDeTitulo){

        char[] Caracterarray = TipoDeTitulo.toCharArray();
        int caracteres = Caracterarray.length;

        for (int i = 1; i <= caracteres; i++) {
            if (i == 1){
                System.out.print("+--");
            } else if (i == caracteres) {
                System.out.println("--+");
            } else{
                System.out.print("-");
            }
        }


        for (int i = 1; i <= caracteres; i++) {
            if (i == 1){
                System.out.print("|");
                System.out.print(" " + TipoDeTitulo + " ");
            } else if (i == caracteres) {
                System.out.println("|");
            }
        }


        for (int i = 1; i <= caracteres; i++) {
            if (i == 1){
                System.out.print("+--");
            } else if (i == caracteres) {
                System.out.println("--+");
            } else{
                System.out.print("-");
            }
        }
    }
}