package com.company;

public class PListar {
    boolean show(){
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        tipoDeTitulo.show("Listar Contactos");

        for(Contacto contacto : Main.arrayagenda.array_contactos){
            System.out.println(contacto.Nombre);
        }
        System.out.println();

        OpcionesMenu opcionesMenu = new OpcionesMenu();
        String[] opcions = {"Crear", "Buscar"};
        String opcion = opcionesMenu.Eleccion(opcions);
        if ("1".equals(opcion)) {
            PCrear pCrear = new PCrear();
            pCrear.show();

        }
            else if ("2".equals(opcion)){
                PBuscar pantallaBuscar = new PBuscar();
                pantallaBuscar.show();
            }
            return true;
    }
}

