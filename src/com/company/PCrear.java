package com.company;

public class PCrear {
    void show() {
        Array_contactos array_contactos = new Array_contactos();
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        TipoDeTitulo.show("Creacion de contacto");
        array_contactos.nombre = campotxt.recibir("Nombre o Apodo");
        array_contactos.apellido = campotxt.recibir("Primer apellido");
        array_contactos.telefono = campotxt.recibir ("Telefono");
        array_contactos.correo = campotxt.recibir("correo electronico");
        Tipoerrores tipoerrores = new Tipoerrores();
        Tipoerrores.Information("Contacto guardado, felicidades!");

    }
}
