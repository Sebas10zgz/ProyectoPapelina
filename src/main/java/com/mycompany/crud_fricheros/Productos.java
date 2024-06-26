/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_fricheros;

/**
 *
 * @author jorge
 */
public class Productos {
    private int id;
    private String nombre;
    private double precio;

    @Override
    public String toString() {

        return "\nID: " +this.id+
                "\nNombre: " +this.nombre+
                "\nPrecio: " +this.precio+
                "\n===========";
    }

    public Productos(int id, String nombre, double precio){
        this.setId(id);
        this.setNombre(nombre);
        this.setPrecio(precio);
    }
    public Productos(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
