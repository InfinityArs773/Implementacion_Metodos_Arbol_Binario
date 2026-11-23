/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbol_bin_genealogico;

/**
 *
 * @author Erick López
 */
public class Arbol_Bin_Genealogico {

    public static void main(String[] args) {
        
        // ABUELOS PATERNOS
        Familiar abueloPaterno = new Familiar("Abuelo Gilberto", 68, "Mecanico", false, "Hermosillo");
        Familiar abuelaPaterna = new Familiar("Abuela Concepcion", 66, "Ama de casa", false, "Hermosillo");

        // ABUELOS MATERNOS
        Familiar abueloMaterno = new Familiar("Abuelo German", 36, "No especificada", true, "Navojoa");
        Familiar abuelaMaterna = new Familiar("Abuela Juana", 72, "Jubilada", false, "Navojoa");

        // PADRES
        Familiar padre = new Familiar("Adrian Lopez", 36, "Laboratorista", true, "Hermisillo");
        Familiar madre = new Familiar("Erika Flores", 40, "Cocinera", false, "Navojoa");

        // YO
        Familiar erick = new Familiar("Erick Gabriel Lopez Flores", 19, "Estudiante de Ingenieria en Software", true, "Hermosillo");
        
        // HERMANO
        Familiar hermano = new Familiar("Iker", 14, "Estudiante", false, "Hermosillo");
        
        // CREAR NODOS
        Nodo<Familiar> nodoAbueloPaterno = new Nodo<>(abueloPaterno);
        Nodo<Familiar> nodoAbuelaPaterna = new Nodo<>(abuelaPaterna);

        Nodo<Familiar> nodoAbueloMaterno = new Nodo<>(abueloMaterno);
        Nodo<Familiar> nodoAbuelaMaterna = new Nodo<>(abuelaMaterna);

        Nodo<Familiar> nodoPadre = new Nodo<>(padre);
        Nodo<Familiar> nodoMadre = new Nodo<>(madre);

        Nodo<Familiar> nodoErick = new Nodo<>(erick);
        Nodo<Familiar> nodoHermano = new Nodo<>(hermano);

        // CREAR ARBOL BINARIO
        Arbol_Binario<Familiar> arbol = new Arbol_Binario<>();

        // ESTABLECEMOS RAIZ
        arbol.setRaiz(abueloPaterno);

        // CONECTAMOS NODOS
        arbol.getRaiz().setHijoIzquierdo(nodoAbuelaPaterna);
        arbol.getRaiz().setHijoDerecho(nodoAbueloMaterno);

        nodoAbuelaPaterna.setHijoIzquierdo(nodoPadre);
        nodoAbuelaPaterna.setHijoDerecho(nodoMadre);

        nodoPadre.setHijoIzquierdo(nodoErick);
        nodoPadre.setHijoDerecho(nodoHermano);

        nodoAbueloMaterno.setHijoIzquierdo(nodoAbuelaMaterna);


        // RECORRIDO PREORDEN
        System.out.println("\n===== RECORRIDO PREORDEN =====");
        arbol.preorden();

        // RECORRIDO POSTORDEN
        System.out.println("\n===== RECORRIDO POSTORDEN =====");
        arbol.postorden();
    }
}

