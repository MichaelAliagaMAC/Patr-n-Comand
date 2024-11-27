package com.ejemplo.command;

public class EncenderTelevisionComando implements Comando {
    private Television television;

    public EncenderTelevisionComando(Television television) {
        this.television = television;
    }

    @Override
    public void ejecutar() {
        television.encender();
    }
}
