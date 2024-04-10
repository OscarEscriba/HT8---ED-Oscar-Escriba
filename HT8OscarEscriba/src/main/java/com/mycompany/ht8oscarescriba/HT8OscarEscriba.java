/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ht8oscarescriba;

/**
 *
 * @author Oscar Escriba
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HT8OscarEscriba {
    public static void main(String[] args) {
        VectorHeap<Paciente> emergencyQueue = new VectorHeap<>();

        // Lectura del archivo pacientes.txt y agregando pacientes a la cola de prioridad
        try {
            File file = new File("C:\\Users\\Oscar Escriba\\Desktop\\7mo semestre UVG\\Algoritmos y estructura de datos\\HT8---ED-Oscar-Escriba\\HT8OscarEscriba\\src\\main\\java\\com\\mycompany\\ht8oscarescriba\\Pacientes.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String nombre = parts[0].trim();
                    String sintoma = parts[1].trim();
                    char codigoEmergencia = parts[2].trim().charAt(0);
                    Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                    emergencyQueue.add(paciente);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        // Atención de pacientes en orden de prioridad
        System.out.println("Orden de atención de pacientes:");
        while (!emergencyQueue.isEmpty()) {
            Paciente paciente = emergencyQueue.remove();
            System.out.println(paciente);
        }
    }
}
