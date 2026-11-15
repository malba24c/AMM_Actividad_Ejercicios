package clase0;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicios_Clase {
    public static void menuEjercicios() {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("MENU DE EJERCICIOS");
            System.out.println("------------------");
            System.out.println("1 Mostrar mensaje N veces");
            System.out.println("2 Suma de los n primeros impares");
            System.out.println("3 Maximo de dos numeros");
            System.out.println("4 Numeros entre dos enteros");
            System.out.println("5 Doble de un numero");
            System.out.println("6 Mensaje de error segun codigo");
            System.out.println("7 Potencia x elevado a n");
            System.out.println("8 Area o volumen de un cilindro");
            System.out.println("0 Salir");
            System.out.println("Dime el ejercicio:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1(teclado);
                    break;
                case 2:
                    ejercicio2(teclado);
                    break;
                case 3:
                    ejercicio3(teclado);
                    break;
                case 4:
                    ejercicio4(teclado);
                    break;
                case 5:
                    ejercicio5(teclado);
                    break;
                case 6:
                    ejercicio6(teclado);
                    break;
                case 7:
                    ejercicio7(teclado);
                    break;
                case 8:
                    ejercicio8(teclado);
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Ejercicio no valido");
            }
        } while (opcion != 0);
    }

    //Ejercicio 1
    public static void ejercicio1(Scanner teclado) {
        int n = 0;

        System.out.println("Dime N:");
        n = teclado.nextInt();
        mostrarMensaje(n);
    }

    public static void mostrarMensaje(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }

    //Ejercicio 2
    public static void ejercicio2(Scanner teclado) {
        int n = 0;

        System.out.println("Dime n:");
        n = teclado.nextInt();
        System.out.println("La suma de los " + n + " primeros impares es: " + sumaImpares(n));
    }

    public static int sumaImpares(int n) {
        int suma = 0;
        int impar = 1;

        for (int i = 1; i <= n; i++) {
            suma = suma + impar;
            impar = impar + 2;
        }
        return suma;
    }

    //Ejercicio 3
    public static void ejercicio3(Scanner teclado) {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Dime el primer numero:");
        num1 = teclado.nextInt();
        System.out.println("Dime el segundo numero:");
        num2 = teclado.nextInt();
        System.out.println("El maximo es: " + maximo(num1, num2));
    }

    public static int maximo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    //Ejercicio 4
    public static void ejercicio4(Scanner teclado) {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Dime el primer numero:");
        num1 = teclado.nextInt();
        System.out.println("Dime el segundo numero:");
        num2 = teclado.nextInt();
        numerosEntreDos(num1, num2);
    }

    public static void numerosEntreDos(int a, int b) {
        int menor = 0;
        int mayor = 0;

        if (a < b) {
            menor = a;
            mayor = b;
        }
        else {
            menor = b;
            mayor = a;
        }

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

    //Ejercicio 5
    public static void ejercicio5(Scanner teclado) {
        int num = 0;

        System.out.println("Dime un numero:");
        num = teclado.nextInt();
        mostrarDoble(num);
    }

    public static void mostrarDoble(int num) {
        System.out.println("El doble de " + num + " es " + (num * 2));
    }

    //Ejercicio 6
    public static void ejercicio6(Scanner teclado) {
        int codigo = 0;

        System.out.println("Dime el codigo de error:");
        codigo = teclado.nextInt();
        mostrarError(codigo);
    }

    public static void mostrarError(int codigo) {
        switch (codigo) {
            case 1:
                System.out.println("Error en memoria.");
                break;
            case 2:
                System.out.println("Papel atascado en impresora.");
                break;
            case 3:
                System.out.println("Disco defectuoso.");
                break;
            default:
                System.out.println("Error indefinido.");
        }
    }

    //Ejercicio 7
    public static void ejercicio7(Scanner teclado) {
        int x = 0;
        int n = 0;

        do {
            System.out.println("Dime x (menor que 50):");
            x = teclado.nextInt();
        } while (x >= 50);

        do {
            System.out.println("Dime n (menor que 10):");
            n = teclado.nextInt();
        } while (n >= 10);

        System.out.println(x + " elevado a " + n + " es " + potencia(x, n));
    }

    public static long potencia(int x, int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * x;
        }
        return resultado;
    }

    //Ejercicio 8
    public static void ejercicio8(Scanner teclado) {
        string tipo = ' ';
        double radio = 0;
        double altura = 0;

        System.out.println("Dime 'a' para area o 'v' para volumen:");
        tipo = teclado.next().println(0);
        System.out.println("Dime el radio:");
        radio = teclado.nextDouble();
        System.out.println("Dime la altura:");
        altura = teclado.nextDouble();
        cilindro(tipo, radio, altura);
    }

    public static void cilindro(char tipo, double radio, double altura) {
        double pi = 3.14159;

        if (tipo == 'a') {
            double area = 2 * pi * radio * (radio + altura);
            System.out.println("El área del cilindro es: " + area);
        }
        else {
            if (tipo == 'v') {
                double volumen = pi * radio * radio * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
            }
            else {
                System.out.println("Error: el tipo debe ser 'a' o 'v'");
            }
        }
    }

    public static void main(String[] args) {
        menuEjercicios();
    }
}

