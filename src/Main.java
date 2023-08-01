import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cadena de texto");

ejercicio1();
        System.out.println("---------------");
        System.out.println("¿Cual es el mayor?");
ejercicio2();
        System.out.println("---------------");
        System.out.println("¿Par o Impar?");

ejercicio3();
        System.out.println("---------------");
        System.out.println("¿texto igual o desigual?");

ejercicio4();
        System.out.println("---------------");
        System.out.println("lista de numeros, cortar con el numero 0");

ejercicio5();
        System.out.println("---------------");
        System.out.println("mensaje de bienvenida");

ejercicio6();
        System.out.println("---------------");

    }

    public static void ejercicio1(){
        //1. Crear las variables correspondientes para leer tu nombre,
        //apellido y edad e imprimirlos por consola en una oración.
        //declaro las variables y las concateno

       String nombre = "Fabiola";
       String apellido ="Romano";
       int edad = 36;
        System.out.print("Mi nombre es" + " " + nombre + " " + apellido + " y tengo "
                + edad + " años");
        System.out.println("             ");

    }

    public static void ejercicio2(){

        //2. Realizar un pequeño programa que permita ingresar 3 números
        //e imprimir por consola cuál es el mayor.
//declaro scanner para ingresar los numeros por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();


//en el primer if consulto cual es mayor y sigo consultando.
        if (num1>num2){
            if (num1>num3){
                System.out.println("el numero mayor es:" + num1 );
            }else if (num2>num3) {
                System.out.println("el numero mayor es:" + num2 );
            }else System.out.println("el mayor es el: " + num3);

        } else if (num2>num3) {
            System.out.println("el numero mayor es:" + num2 );
        }else System.out.println("el mayor es el: " + num3);
        System.out.println("             ");
    }

    public static void ejercicio3 (){

        //3 Realizar un pequeño programa que permita el ingreso de un
        //número e imprimir por consola su paridad.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número a verificar: ");
        int numero = scanner.nextInt();

        //con este if verifico si el numero ingresado es par, de lo contrario ingresa al else
        if (numero % 2 == 0){
            System.out.println("el " + numero + " " + "es un numero PAR");
        }else {
            System.out.println("el numero ingresado NO ES UN NUMERO PAR");
        }
        System.out.println("             ");
    }

    public static void ejercicio4(){
        // 4 Crear el código correspondiente que permita ingresar 2 cadenas
        //de caracteres e imprima por consola si son iguales o no.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primer texto: ");
        String texto1 = scanner.nextLine();
        System.out.println("Ingrese segundo texto: ");
        String texto2 = scanner.nextLine();


        if (texto1.equals(texto2)) {
            System.out.println("el texto ingresado es el mismo");
        } else {
            System.out.println("el texto ingresado no es igual");
        }

        System.out.println("             ");
    }

    public static void ejercicio5(){
        // resuelto con un array y ciclo for
        //5. Realizar un pequeño programa que permita el ingreso de
        //números, almacenarlos en una colección hasta ingresar un 0

        Scanner scanner = new Scanner(System.in);
        // Tamaño del arreglo para almacenar los números
        int arrayNumeros = 5;
        int[] numeros = new int[arrayNumeros];
        int indice = 0;

        // Ciclo para ingresar los números y almacenarlos en el arreglo
        for (int i = 0; i < arrayNumeros; i++) {
            System.out.print("Ingrese un número (o 0 para terminar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            numeros[indice] = numero;
            indice++;
        }

        // Mostrar los numeros ingresados
        System.out.println("Nnmeros ingresados:");
        for (int i = 0; i < indice; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("             ");
    }


    public static void ejercicio6 () {

            //6. Crear una función que imprima un mensaje de bienvenida en la consola.

            System.out.println("Bienvenidos a MindHub!! :)");
        System.out.println("             ");

    }
}