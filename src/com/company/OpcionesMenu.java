package com.company;

public class OpcionesMenu {
    String Eleccion(String[] opcions){

        boolean Pedir = true;
        String opcion = "";
        while(Pedir) {
            for (int i = 0; i < opcions.length; i++) {
                System.out.println((i + 1) + ". " + opcions[i]);
            }

            System.out.println("\nOpcion:");

            opcion = Main.scanner.nextLine();

            if (Integer.parseInt(opcion) > opcions.length) {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("Esa opcion no existe");
            } else {
                Pedir = false;
            }
        }

        return opcion;
    }
}