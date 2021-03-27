package sample;

import com.company.TipoDeTitulo;

public class PCrear {
    void show() {
        TipoDeTitulo tipoDeTitulo = new TipoDeTitulo();
        TipoDeTitulo.show("Creacion de contacto");
        Array_contactos.nombre = campotxt.recibir("Nombre o Apodo");
        Array_contactos.apellido = campotxt.recibir("Primer apellido");
        Array_contactos.telefono = campotxt.recibir ("Telefono");
        Array_contactos.correo = campotxt.recibir("correo electronico");
        Tipoerrores tipoerrores = new Tipoerrores();
        Tipoerrores.Information("Contacto guardado, felicidades!");
6
    }
}
