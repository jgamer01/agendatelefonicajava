package com.company;

public class PantallaBuscar {
    boolean show() {
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        com.company.TipoDeTitulo.show("BUSCAR CONTACTOS");

        System.out.println("Contacto a buscar");
        String Encontrar = Main.scanner.nextLine();
        boolean Encontrado = false;
        Array_contactos encontrado = null;
        for (Array_contactos Array_contactos : Main.arrayagenda.array_contactos){ = null;
            if (Array_contactos.nombre.equals(Encontrar)){
                System.out.println(Array_contactos.nombre);
                if(Array_contactos.SegundoApellido == null || Array_contactos.SegundoApellido.equals(""))}
                else{
                System.out.println(Array_contactos.SegundoApellido);}
                System.out.println(Array_contactos.Telefono);

                if (Array_contactos.correo == null || Array_contactos.correo.equals("")){}
                else {
                System.out.println(Array_contactos.correo);}

            }
}