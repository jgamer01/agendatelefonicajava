package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayAgenda arrayagenda = new ArrayAgenda();

    public static void main(String[] args) {
        PMenu pmenu = new PMenu();
        while (pmenu.show()) {  }
    }
}