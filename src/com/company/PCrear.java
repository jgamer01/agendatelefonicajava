package com.company;

public class PCrear {
    static void show() {
        Contacto contacto = new Contacto();
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        tipoDeTitulo.show("Creacion de contacto");
        campotxt ctxt = new campotxt();
        contacto.Nombre = ctxt.pedir("Nombre o Apodo", true);
        contacto.Apellido = ctxt.pedir("Primer apellido");
        contacto.Telefono = ctxt.pedir("Telefono", true);
        contacto.Correo = ctxt.pedir("correo electronico");
        Main.arrayagenda.array_contactos.add(contacto);
        Tipoerrores tipoerrores = new Tipoerrores();
        tipoerrores.Information("Contacto guardado, felicidades!");

    }
}
