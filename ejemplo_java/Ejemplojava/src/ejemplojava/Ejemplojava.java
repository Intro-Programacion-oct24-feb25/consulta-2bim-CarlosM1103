/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplojava;

/**
 *
 * @author CDML
 */
public class Ejemplojava {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int numero = 5; // Número para calcular el factorial
        int resultado = factorial(numero); // Llamada al método recursivo
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

}
