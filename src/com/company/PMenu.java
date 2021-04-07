package com.company;

public class PMenu {
    boolean show(){
        com.company.TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        com.company.TipoDeTitulo.show("Agenda Telefonica");

        OpcionesMenu opcionesMenu = new OpcionesMenu();
        String[] opcions = {"1.Crear Contacto 2.Listar Contactos 3. Salir"};
        String opcion = opcionesMenu.Eleccion(opcions);

        if ("1".equals(opcion)) {
            PCrear pcrear = new PCrear();
            pcrear.show();
        } else if ("2".equals(opcion)) {
            PListar pListar = new PListar();
            pListar.show();
        }else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}
