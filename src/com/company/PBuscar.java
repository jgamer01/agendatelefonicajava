package com.company;

public class PantallaBuscar {
    boolean show() {
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        com.company.TipoDeTitulo.show("BUSCAR CONTACTOS");

        System.out.println("Contacto a buscar");
        String Encontrar = Main.scanner.nextLine();
        boolean encontrado = false;
        Array_contactos encontrado = null;
        for (Array_contactos Array_contactos : Main.arrayagenda.Array_contactos){ = null;
            if (Array_contactos.nombre.equals(Encontrar)){
                System.out.println(array_contactos.nombre);
                if(array_contactos.SegundoApellido == null || array_contactos.SegundoApellido.equals(""))}
                else{
                System.out.println(array_contactos.SegundoApellido);}
                System.out.println(array_contactos.Telefono);

                if (array_contactos.correo == null || array_contactos.correo.equals("")){}
                else {
                System.out.println(array_contactos.eMail);}

            }
}