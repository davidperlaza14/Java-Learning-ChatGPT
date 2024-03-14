package Nivel_Inicial;

import java.util.Scanner;

/**
 * Ejercicio 2: Operadores aritméticos, lógicos y de comparación.
 *
 * Escribe un programa Java que tome dos números como entrada
 * del usuario, realice operaciones aritméticas básicas
 * (suma, resta, multiplicación, división) y
 * luego imprima los resultados.
 *
 */
public class Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.println("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        // Realizar operaciones aritméticas
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}
