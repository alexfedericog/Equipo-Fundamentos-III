import java.util.Arrays;
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
            System.out.println("10. Suma de subconjuntos (Backtracking)");
            System.out.println("11. Salir");
            System.out.println("-------------------------------------");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño del arreglo:");
                    x = sc.nextInt();

                    int[] A = new int[x];

                    for (int i = 0; i < x; i++){
                        System.out.println("Inserte el valor " + (i + 1) + ":");
                        A[i] = sc.nextInt();
                    }

                    System.out.println("El resultado es: " + menorArreglo(A));
                    break;

                case 2:
                    System.out.println("Ingrese el tamaño del arreglo:");
                    x = sc.nextInt();

                    int[] B = new int[x];

                    for (int i = 0; i < x; i++){
                        System.out.println("Inserte el valor " + (i + 1) + ":");
                        B[i] = sc.nextInt();
                    }

                    System.out.println("El resultado es:");

                    for (int i = 0; i < x; i++) {
                        System.out.println(bubbleSort(B)[i]);
                    }
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
                    System.out.println("Ingrese n:");
                    x = sc.nextInt();

                    long [] fib = new long [x + 1];
                    Arrays.fill(fib,-1);

                    System.out.println("El resultado es: " + fiboRePD(x,fib));
                    System.out.println();
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
                    System.out.println("Ingrese el tamaño del arreglo:");
                    x = sc.nextInt();

                    int[] T = new int[x];

                    for(int i = 0; i < x; ++i) {
                        System.out.println("Inserte el valor " + (i + 1) + ":");
                        T[i] = sc.nextInt();
                    }

                    System.out.println("Ingresa el resultado que buscas:");
                    int k = sc.nextInt();

                    sumaConjuntos(T,0,0,k,"");
                    //conjutno solo las "" para que este vacio
                    break;

                case 11:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Inserte un número del 1 al 11");
                    break;
            }

        } while (opcion != 11);

    }

    private static int menorArreglo(int[] A) {
        int min = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min){
                min = A[i];
            }
        }
        return min;
    }

    private static int [] bubbleSort(int[] B) {
        int aux;

        for (int i = 0; i < B.length - 1; i++) {
            for (int j = 0; j < B.length - i - 1; j++) {
                if (B[j] > B[j+1]) {
                    aux = B[j];
                    B[j] = B[j+1];
                    B[j+1] = aux;
                }
            }
        }
        return B;
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
            return n;
        } else {
            return fiboRe(n-1) + fiboRe(n-2);
        }
    }

    private static long fiboRePD(int n, long fib[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            if (fib[n] != -1) {
                return fib[n];
            }
            else {
                fib[n] = fiboRePD(n - 1, fib) + fiboRePD(n-2, fib);
            }
            return fib[n];
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

    private static void sumaConjuntos(int[] T, int p, int suma, int k, String conjunto) {
        if (suma == k) {
            System.out.println("Subconjunto: " + conjunto);
            return;
        }

        if (p == T.length) {
            return;
        }

        // Tomar el elemento
        sumaConjuntos(T, p + 1,
                suma + T[p],
                k,
                conjunto + T[p] + " ");

        // No tomar el elemento
        sumaConjuntos(T, p + 1,
                suma,
                k,
                conjunto);
    }
}
