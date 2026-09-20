import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int x = 0;

        System.out.println("Bienvenido al sistema de algortimos!");
        System.out.println("Seleccione el algoritmo que desee ejecutar");

        do {

            System.out.println("-------- LISTA DE ALGORITMOS --------");
            System.out.println("1. Encontrar un número menor en un arreglo");
            System.out.println("2. Ordenar un arreglo (Bubble Sort)");
            System.out.println("3. Suma de N enteros - Iterativo");
            System.out.println("4. Suma de N enteros - Recursivo");
            System.out.println("5. Fibonacci - Iterativo");
            System.out.println("6. Fibonacci - Recursivo (Sin programación dinámica)");
            System.out.println("7. Fibonacci - Recursivo (Con programación dinámica)");
            System.out.println("8. Factorial - Iterativo");
            System.out.println("9. Factorial - Recursivo");
            System.out.println("10. Backtracking");
            System.out.println("11. Salir");
            System.out.println("-------------------------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + sumaEntIt(x));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + sumaEntRe(x));
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + fiboIt(x));
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + fiboRe(x));
                    System.out.println();
                    break;
                case 7:

                    break;

                case 8:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + factoIt(x));
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    System.out.println("El resultado es: " + factoRe(x));
                    System.out.println();
                    break;

                case 10:
                    break;

                case 11:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        } while (opcion != 11);

    }

    private static int sumaEntIt(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    private static int sumaEntRe(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaEntRe(n-1);
        }
    }

    private static int fiboIt(int n) {
        int fibInf = 0;
        int fibSup = 1;
        if (n == 0 || n ==1)
            return n;

        for (int i = 2; i <= n; i++) {
            int x;
            x = fibInf;
            fibInf = fibSup;
            fibSup = x + fibInf;
        }
        return fibSup;
    }

    private static int fiboRe(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fiboRe(n) + fiboRe(n-1);
        }
    }

    private static int factoIt(int n) {
        int factorial = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                factorial = 1;
            } else {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    private static int factoRe(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factoRe(n-1);
        }
    }
}
