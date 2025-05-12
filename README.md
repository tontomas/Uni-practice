# Uni-practice

Proyectitos de práctica para mis clases de Ciencias de la Computación.

## 🌱 Sobre este repositorio

Aquí voy guardando los ejercicios que hago mientras aprendo programación en la universidad. Por ahora todo es básico, pero la idea es ir subiendo la dificultad conforme avance en el semestre.

## 🚀 Primer ejercicio

```java
// tabla-multiplicar.java
// Pide un número y muestra su tabla de multiplicar hasta n

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Porfavor, ingresa un número: ");
        int multiplos = sc.nextInt();
        System.out.print("Porfavor ingresa la cantidad de múltiplos: ");
        int multiplicando = sc.nextInt();
        int sumaTotal = 0;

        for (int i = 1; i <= multiplicando; i++) {
            int resultado = i * multiplos;
            sumaTotal += resultado;
            System.out.println(multiplos + " * " + i + " = " + resultado);
        }

        System.out.print("Suma total: " + sumaTotal);
    }
}

