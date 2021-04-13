package com.company;

public class PMenu {
    boolean show(){
        com.company.TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        com.company.TipoDeTitulo.show("Agenda Telefonica");

        OpcionesMenu opcionesMenu = new OpcionesMenu();
        String[] opciones = {"Crear Contacto", "Listar Contactos", "Pantalla Buscar"};
        String opcion = opcionesMenu.Eleccion(opciones);

        if ("1".equals(opcion)) {
            PCrear pcrear = new PCrear();
            pcrear.show();
        } else if ("2".equals(opcion)) {
            PListar pListar = new PListar();
            pListar.show();
        }else if ("3".equals(opcion)) {
            PBuscar pBuscar = new PBuscar();
            pBuscar.show();
        }else {
            return false;
        }
        return true;
    }
}
