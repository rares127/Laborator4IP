/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laborator4ip;

/**
 *
 * @author RACU RARES LIVIU
 */
public class Orar {
    private Clasa[] clase;

    public Orar(Clasa[] clase) {
        this.clase = clase;
    }

    public Clasa[] getClasedis(String dis) {
        for(Clasa clasec : clase)
            if(clasec.getDisciplina())
    }

    public void setClase(Clasa[] clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Orar{" + "clase=" + clase + '}';
    }
    
}
