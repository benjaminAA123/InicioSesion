package com.iesam.InicioSesion.Domain;

public class User {

    private String nombre;
    private boolean inicioSesion;

    public User(String nombre, boolean inicioSesion) {
        this.nombre = nombre;
        this.inicioSesion = inicioSesion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(boolean inicioSesion) {
        this.inicioSesion = inicioSesion;
    }
}
