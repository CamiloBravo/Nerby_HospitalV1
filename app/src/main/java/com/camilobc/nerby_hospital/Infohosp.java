package com.camilobc.nerby_hospital;

/**
 * Created by Camilo on 22/05/2017.
 */

public class Infohosp {
    String direccion, horario, nombre, telefono;

    public Infohosp(){

    }

    public Infohosp(String direccion, String horario, String nombre, String telefono) {
        this.direccion = direccion;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
