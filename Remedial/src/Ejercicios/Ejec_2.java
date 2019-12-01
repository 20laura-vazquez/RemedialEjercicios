/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Ejec_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String s1 = JOptionPane.showInputDialog(null, "Ingresa un texto breve: ");
        String s2;
        // Cargamos el buffer con el contenido del archivo
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sergio\\Documents\\NetBeansProjects\\Estructura_Datos"
        // + "\\src\\Ejercicios_Estructura\\texto"));

        // Leemos la primera linea
        //s1 = br.readLine();
        // s2 = br.readLine();
        System.out.println("Texto ingresado: " + s1);
        // System.out.println("La Segunda linea del archivo es: " + s2);
        System.out.println("La linea tiene " + s1.length() + " caracteres");
        // System.out.println("La linea tiene " + s2.length() + " caracteres");
        System.out.println();
        System.out.println("Separando la linea en trozos tenemos las siguientes palabras:");

        int numTokens = 0;
        StringTokenizer st = new StringTokenizer(s1);

        // bucle por todas las palabras
        while (st.hasMoreTokens()) {
            s2 = st.nextToken();
            numTokens++;
            System.out.println("    Palabra " + numTokens + " es: " + s2);
        }
    }
}
