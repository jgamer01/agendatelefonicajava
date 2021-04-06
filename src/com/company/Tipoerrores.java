package com.company;

public class Tipoerrores {
    void Failed (String txt){
        printAnterior();
        System.out.println("\033[31m" + txt "033[0m");
        printAfter();
    }
    void Warning (String txt){
        printAnterior();
        System.out.println("\033[33m" + txt "033[0m");
    }
    static void Information(String txt){
        printAnterior();
        System.out.println("\033[36m" + txt "033[0m");
    }

    void printAnterior({
        System.out.println();
    })

    void printAfter({
        System.out.println();
        System.out.println();
        System.out.println();
    })
}
