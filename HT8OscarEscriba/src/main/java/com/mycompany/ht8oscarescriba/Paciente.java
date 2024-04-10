/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ht8oscarescriba;

/**
 *
 * @author Oscar Escriba
 */
import java.util.PriorityQueue;

public class Paciente implements Comparable<Paciente> {
        private String nombre;
    private String descripcionSintoma;
    private char codigoEmergencia;

    public Paciente(String nombre, String descripcionSintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.descripcionSintoma = descripcionSintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcionSintoma() {
        return descripcionSintoma;
    }

    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigoEmergencia, otro.codigoEmergencia);
    }

    @Override
    public String toString() {
        return nombre + ", " + descripcionSintoma + ", " + codigoEmergencia;
    }
}
