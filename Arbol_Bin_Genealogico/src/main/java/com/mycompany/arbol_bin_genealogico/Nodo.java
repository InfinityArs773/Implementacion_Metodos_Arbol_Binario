/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol_bin_genealogico;

/**
 *
 * @author Erick López
 */
public class Nodo<T> {

    private T dato;
    private Nodo<T> hijoIzquierdo;
    private Nodo<T> hijoDerecho;

    public Nodo(T dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public Nodo<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoIzquierdo(Nodo<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public void setHijoDerecho(Nodo<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
}
