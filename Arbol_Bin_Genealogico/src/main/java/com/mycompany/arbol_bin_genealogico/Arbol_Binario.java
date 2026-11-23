/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to change this template
 */
package com.mycompany.arbol_bin_genealogico;

/**
 *
 * @author Erick López
 */
public class Arbol_Binario<T> {

    private Nodo<T> raiz;

    public Arbol_Binario() {
        raiz = null;
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(T dato) {
        raiz = new Nodo<>(dato);
    }

    // Recorrido en preorden: Raiz, Izquierda, Derecha
    public void preorden() {
        preorden(raiz);
    }

    private void preorden(Nodo<T> nodo) {
        if (nodo != null) {
            System.out.println(nodo.getDato() + "\n");
            preorden(nodo.getHijoIzquierdo());
            preorden(nodo.getHijoDerecho());
        }
    }

    // Recorrido en postorden: Izquierda, Derecha, Raiz
    public void postorden() {
        postorden(raiz);
    }

    private void postorden(Nodo<T> nodo) {
        if (nodo != null) {
            postorden(nodo.getHijoIzquierdo());
            postorden(nodo.getHijoDerecho());
            System.out.println(nodo.getDato() + "\n");
        }
    }
}