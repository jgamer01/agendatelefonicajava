package com.company;

public class PMenu {
    boolean show(){
        com.company.TipoDeTitulo tipoDeTitulo = new com.company.TipoDeTitulo();
        com.company.TipoDeTitulo.show("Agenda Telefonica");

        OpcionesMenu  opcionesMenu();
        String[] opcions = {"1.Crear Contacto 2.Listar Contactos 3. Salir"};
        String opcion = opcionesMenu.Eleccion(opcions);

        if ("1".equals(opcion)) {
            Pcrear pcrear = new Pcrear();
            pcrear.show();
        } else if ("2".equals(opcion)) {
            PListar pListar = new Plistar();
            pListar.show();
        }else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}
