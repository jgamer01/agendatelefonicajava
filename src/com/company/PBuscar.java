package com.company;

public class PBuscar {
    static boolean show() {
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        com.company.TipoDeTitulo.show("BUSCAR CONTACTOS");

        System.out.println("Contacto a buscar");
        String Encontrar = Main.scanner.nextLine();
        boolean Encontrado = false;
        Contacto encontrado = null;
        for (Contacto contacto : Main.arrayagenda.array_contactos) {
            if (contacto.Nombre.equals(Encontrar)) {
                System.out.println(contacto.Nombre);
                if (contacto.Apellido == null || contacto.Apellido.equals("")) {
                } else {
                    System.out.println(contacto.Apellido);
                }
                System.out.println(contacto.Telefono);
                if (contacto.Correo == null || contacto.Correo.equals("")) {
                } else {
                    System.out.println(contacto.Correo);
                }
            }

        }
        return false;
    }
}