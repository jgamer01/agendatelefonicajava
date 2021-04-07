package com.company;

public class PListar {
    boolean show(){
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        TipoDeTitulo.show("Listar Contactos");

        for(Array_contactos array_contactos: Main.arrayagenda.array_contactos){
            System.out.println(array_contactos.Nombre);
        }
        System.out.println();

        PMenu pMenu = new PMenu();
        String[] opcions = {"Crear, Buscar"};
        String opcion = OpcionesMenu
        if ("1".equals(opcion)) {
            PCrear pCrear = new PCrear();
            PCrear.show();

        }
            else if ("2".equals(opcion)){
                PBuscar pantallaBuscar = new PBuscar();
                PBuscar.show();
            }
            return true;
    }
}

