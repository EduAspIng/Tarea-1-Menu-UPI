//@author Eduardo José Espinoza Rodríguez *UPI*
package tarea.pkg1.ciclos_y_condiciones;

import java.util.Scanner;

public class Tarea1Ciclos_Y_Condiciones {

    public static void main(String[] args) {
        Menú();
    }

    public static void Menú() {
        Scanner scan = new Scanner(System.in);
        byte opción = 0;
        do {
            System.out.println("Selecciona una opción para realizar una operación matematica");
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: /");
            System.out.println("5: Salir");
            opción = scan.nextByte();
            switch (opción) {
                case 1:
                    Suma();
                    break;
                case 2:
                    Resta();
                    break;
                case 3:
                    Multiplicación();
                    break;
                case 4:
                    División();
                    break;
            }
            if ((opción < 0) || (opción > 5)) {
                System.out.println("Numero invalido");
            }
        } while (opción != 5);

        System.out.println("Saliste del menu, gracias por probar :D");

    }

    public static void Suma() {
        System.out.println("Bienvenido a suma");
        Scanner scan = new Scanner(System.in);
        double n, resultado;
        n = 0;
        resultado = 0;
        do {

            System.out.println("Digita un 0 si quieres ver el resultado");
            System.out.println("Introduce un numero, por favor");
            n = scan.nextDouble();
            resultado = n + resultado;
        } while (n != 0);
        System.out.println("El resultado es: " + resultado);
    }

    public static void Resta() {
        System.out.println("Bienvenido a resta");
        Scanner scan = new Scanner(System.in);
        double n, resultado;
        n = 0;
        resultado = 0;
        do {

            System.out.println("Digita un 0 si quieres ver el resultado");
            System.out.println("Introduce un numero, por favor");
            n = scan.nextDouble();
            resultado = n - resultado;
        } while (n != 0);
        System.out.println("El resultado es: " + resultado);
    }

    public static void Multiplicación() {
        System.out.println("Bienvenido a multiplicación");
        Scanner scan = new Scanner(System.in);
        double n, resultado;
        n = 0;
        resultado = 1;
        do {

            System.out.println("Digita un 1 si quieres ver el resultado");
            System.out.println("Introduce un numero, por favor");
            n = scan.nextDouble();
            resultado = n * resultado;
        } while (n != 1);
        System.out.println("El resultado es: " + resultado);
    }

    public static void División() {
        System.out.println("Bienvenido a división");
        Scanner scan = new Scanner(System.in);
        double n, resultado;
        n = 0;
        resultado = 1;
        do {

            System.out.println("Digita un 1 si quieres ver el resultado");
            System.out.println("Introduce un numero, por favor");
            n = scan.nextDouble();
            resultado = n / resultado;
        } while (n != 1);
        System.out.println("El resultado es: " + resultado);
    }

    public static void Condición_if() {
        byte Num1, Num2, Num3;
        Num1 = 69;
        Num2 = 69;
        Num3 = 69;

        if ((Num1 > Num2) && (Num1 > Num3)) {
            System.out.println(Num1 + " ES EL MAYOR");
        } else if ((Num2 > Num1) && (Num2 > Num3)) {
            System.out.println(Num2 + " ES EL MAYOR");
        } else if ((Num3 > Num1) && (Num3 > Num2)) {
            System.out.println(Num3 + " ES EL MAYOR");
        } else if ((Num3 == Num1) && (Num3 == Num2)) {
            System.out.println(" TODOS SON " + Num3);
        }
    }

    public static void Condición_while() {
        int x = 0;
        while (x < 20) {
            if ((x > 5) || (x < 10)) {
                System.out.println(x);
            }
            x = x + 1;
        }

    }

    public static void Condición_switch() {
        Scanner scan = new Scanner(System.in);
        byte estudiante = 0;
        System.out.println("elije a un estudiante --> (1)Roberto y (2)Laura");
        estudiante = scan.nextByte();

        switch (estudiante) {
            case 1:
                System.out.println("elejiste a Roberto");
                break;
            case 2:
                System.out.println("elejiste a Laura");
                break;
            default:
                System.out.println("No escogiste a ningun estudiante");
        }

    }
}
