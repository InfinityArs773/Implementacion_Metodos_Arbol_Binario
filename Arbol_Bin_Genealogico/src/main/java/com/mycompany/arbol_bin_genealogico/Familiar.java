/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol_bin_genealogico;

/**
 *
 * @author Erick López
 */
public class Familiar {

    private String nombre;
    private int edad;
    private String ocupacion;
    private boolean finado;
    private String lugarNacimiento;

    public Familiar(String nombre, int edad, String ocupacion, boolean finado, String lugarNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.finado = finado;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public boolean isFinado() {
        return finado;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nOcupacion: " + ocupacion
                + "\nFinado: " + (finado ? "Si" : "No")
                + "\nLugar de nacimiento: " + lugarNacimiento;
    }
}