package com.company;

public class PListar {
    boolean show(){
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        TipoDeTitulo.show("Listar Contactos");

        for(Array_contactos array_contactos: Main.Array_agenda.arraycontactos){
            System.out.println(Array_contactos.nombre);
        }
        System.out.println();

        PMenu pMenu = new PMenu();
        String[] opcions = {"Crear, Buscar"};
        String opcion = OpcionesMenu.Pedir(opcions);
        if ("1".equals(opcion)) {
            PCrear pCrear = new PCrear();
            PCrear.show();
            else if ("2".equals(opcion)){
                PantallaBuscar pantallaBuscar = new PantallaBuscar();
                PantallaBuscar.show();
            }
        }
    }
}
