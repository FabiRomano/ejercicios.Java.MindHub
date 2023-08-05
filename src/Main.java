import java.util.ArrayList;
import java.util.List;
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

        ejercicio7();
        System.out.println("---------------");


//ejercicio 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo o no: ");
        int numero = scanner.nextInt();
        if (ejercicio8(numero)) {
            System.out.println(numero + " Es un numero primo");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }

        System.out.println("---------------");


//ejercicio 9

        List<Integer> listaNumEnteros = new ArrayList<Integer>();
        System.out.println("Ingresa una serie de números separados por espacios o enteros (ingresa un valor no numérico para terminar):");

        while (scanner.hasNextInt()) {
            int numero1 = scanner.nextInt();
            listaNumEnteros.add(numero1);
        }

        int sumarImpares = ejercicio9((ArrayList<Integer>) listaNumEnteros);
        System.out.println("la suma de los numeros impares es: " + sumarImpares);


//ejercicio 10


        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese los números (escriba 'fin' para terminar):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numeros.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("fin")) {
                break;
            }
        }

        imprimirParesYSumaPrimosEjer10(numeros);

//ejercicio 11
        System.out.println("Menu calculadora");
        ejercicio11();
        Scanner myScanner = new Scanner(System.in);
        int opcion;
        opcion = myScanner.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Elijio sumar");
                    break;
                case 2:
                    System.out.println("Elijio restar");
                    break;
                case 3:
                    System.out.println("Elijio multiplicar");
                    break;
                case 4:
                    System.out.println("Elijio dividir");
                    break;
                default:
                    System.out.println("Opcion inexistente");
            }

            ejercicio11();
            opcion = myScanner.nextInt();
        }
        System.out.println("Operacion terinada");

//Ejercicio 12

        do {
            System.out.println("----------- CALCULADORA -----------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("-----------------------------------");
            System.out.print("Ingrese una opción: ");
            opcion = myScanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMulti();
                    break;
                case 4:
                    reaizarDivision();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }



        } while (opcion != 0);

        System.out.println("Hasta Luego!");





   //ejercicio 13
        Scanner scannerr = new Scanner(System.in);
        int capacidadMaxima = 500;
        int capacidadActual = 0;
        int dineroRecaudado = 0;

        while (true) {
            System.out.println("----- Menú de opciones -----");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("4. Salir del sistema");
            System.out.print("Ingrese una opción: ");
            int opcion2 = scannerr.nextInt();

            switch (opcion2) {
                case 1:
                    System.out.println("----- Ingreso de datos -----");
                    System.out.print("Nombre: ");
                    String nombre = scannerr.next();
                    System.out.print("Edad: ");
                    int edad = scannerr.nextInt();
                    System.out.print("DNI: ");
                    int dni = scannerr.nextInt();
                    System.out.print("Pase (normal/vip/descuento): ");
                    String pase = scannerr.next();

                    if (edad >= 21) {
                        int costoEntrada;
                        if (pase.equalsIgnoreCase("vip")) {
                            costoEntrada = 0;
                        } else if (pase.equalsIgnoreCase("descuento")) {
                            costoEntrada = 750; // Mitad del valor de entrada normal
                        } else {
                            System.out.print("Tipo de entrada (normal/vip): ");
                            String tipoEntrada = scannerr.next();
                            if (tipoEntrada.equalsIgnoreCase("vip")) {
                                costoEntrada = 2000;
                            } else {
                                costoEntrada = 1500;
                            }
                        }

                        if (capacidadActual < capacidadMaxima) {
                            capacidadActual++;
                            dineroRecaudado += costoEntrada;
                            System.out.println("¡Bienvenido(a) " + nombre + "!");
                        } else {
                            System.out.println("Lo siento, el boliche está lleno.");
                        }
                    } else {
                        System.out.println("Lo siento, solo se permite el ingreso a mayores de 21 años.");
                    }
                    break;

                case 2:
                    int capacidadDisponible = capacidadMaxima - capacidadActual;
                    System.out.println("Capacidad disponible: " + capacidadDisponible + " personas");
                    break;

                case 3:
                    System.out.println("Dinero recaudado: $" + dineroRecaudado);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    scannerr.close();
                    return;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

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
        System.out.println("Ingrese el número a verificar su paridad: ");
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


    public static void ejercicio7(){
        //7. Crear una función que reciba un número entero y devuelva si es
        //par o impar en forma de texto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es par o impar: ");
        int numero = scanner.nextInt();

        if (numero % 2 != 0){
            System.out.println("El numero ingresado es IMPAR");
        }else {
            System.out.println("El numero ingresado es PAR");
        }


    }


    public static boolean ejercicio8(int esPrimo) {
        //8. Crear una función que reciba un número y devuelva si el mismo
        //es primo o no.
        if (esPrimo <=1) {

            return false;
        }

        //verifico si un numero es divisible por algun numero entre 2 y su raiz cuadrada
        for (int i=2; i <= Math.sqrt(esPrimo); i++){
            if (esPrimo % i == 0){
                return false;
            }
        }
        return true;
    }



    public static int ejercicio9(ArrayList<Integer>listaNumEnteros){
       // 9. Crear una función que reciba una colección de números y devuelva la suma de los números impares.
        int suma = 0;
        for (int numero1 : listaNumEnteros){
            if (numero1 % 2 !=0){
                suma += numero1;
            }
        }
    return suma;

    }


    public static void imprimirParesYSumaPrimosEjer10(ArrayList<Integer> numeros) {
        // public static int ejercicio10(ArrayList<Integer>colecNumPar){
        //10. Crear una función que reciba una colección de números e
        //imprima los números pares y la suma de los números primos.
        int sumaPrimos = 0;

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }

            if (esPrimo(num)) {
                sumaPrimos += num;
            }
        }

        System.out.println("La Suma de los números primos: " + sumaPrimos);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void ejercicio11(){
     //   11. Crear una función que imprima por consola un pequeño
    //   menú con las opciones básicas de una calculadora agregando
    //   la opción 0 para salir del mismo.

        System.out.println("Ingrese la opcion que deca realizar");
        System.out.println("1 sumar");
        System.out.println("2 restar");
        System.out.println("3 multiplicar");
        System.out.println("4 dividir");
        System.out.println("0 salir");

    }

//Ejercicio 12
//12. Crear otra función que ocupe la del punto anterior para poder
//crear una pequeña calculadora usando switch. Tener en cuenta
//el caso de la división por 0.
    public static void realizarSuma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer Numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo Numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("el resultado de lla suma es: " + resultado);
    }

    public static void realizarResta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer Numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMulti(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }

 public static void reaizarDivision(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese el primer numero: ");
     double num1 = scanner.nextDouble();
     System.out.println("Ingrese el segundo numero: ");
     double num2 = scanner.nextDouble();

     if (num2 == 0){
         System.out.println("NO se puede divivir por 0");
     }else {
         double resultado = num1 / num2;
         System.out.println("El resultado de la division es: " + resultado);
     }
 }







}










