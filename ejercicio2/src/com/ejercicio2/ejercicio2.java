package com.ejercicio2;

public class ejercicio2 {
 
	public static void main(String[] args) {
        // Cadena sin espacios
        String cadena = "EstaEsUnaCadenaSinEspacios";

        // Nombre del archivo
        String nombreArchivo = "franciscojaviermarroquin.txt";

        // Crear el archivo y escribir la cadena en él
        try {
            java.io.PrintWriter escritor = new java.io.PrintWriter(nombreArchivo);
            escritor.println(cadena);
            escritor.close();
            System.out.println("Se ha creado el archivo '" + nombreArchivo + "' correctamente.");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al crear el archivo: " + e.getMessage());
        }
    }
}