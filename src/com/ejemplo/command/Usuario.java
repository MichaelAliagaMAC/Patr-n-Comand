package com.ejemplo.command;

public class Usuario {
    public static void main(String[] args) {
        Television television = new Television();
        Comando encenderTelevision = new EncenderTelevisionComando(television);

        ControlRemoto control = new ControlRemoto();

        // Encender la televisión
        control.setComando(encenderTelevision);
        control.presionarBoton();
    }
}
