package com.company;


/**
 * Created by bsanche on 3/15/2017.
 */
    public class User extends AbstractDao {
        String nombre;
        String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public User(String nombre, String direccion) {

        this.nombre = nombre;
        this.direccion = direccion;
    }

    public User(String nombre) {

        this.nombre = nombre;
    }

    public User() {

        }


}
