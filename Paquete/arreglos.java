import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class arreglos{

    //Trbajo hecho por Fernando Dante Rodriguez Silva y Sunem

    static Scanner sc = new Scanner (System.in);
    static Random rnd = new Random();
    static int n;
    static boolean salir = false;

    public static void main(String [] args) {


        do {

        System.out.println("---------------------------------------------------------");
        System.out.println("-----------------------ARREGLOS--------------------------");
        System.out.println("1.- Obtener Datos aleatorios entre 100 y 200");
        System.out.println("2.- Agregar los indices Pares (valores)");
        System.out.println("3.- Agregar los indices Impares (valores)");
        System.out.println("4.- Imprimir los multiplos de 4 y 7");
        System.out.println("5.- Imprimir los numeros entre 150 Y 190");
        System.out.println("---------------------------------------------------------");
        System.out.println("6.- Imprimir arreglo con letras minusculas.");
        System.out.println("7.- Imprimir arreglo con los primeros 100 multiplos de 8.");
        System.out.println("8.- Imprimir arreglo con los 100 primeros multiplos de 3, en decremento");
        System.out.println("9.- Imprimir arreglo de 40 elementos con la secuencia *--*--, imprimelo");

        System.out.println("10.- Salir...");


        System.out.println("Selecciona una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion){

            case 1:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 1: Obtener Datos aleatorios entre 100 y 200 ");
            nDatos();
            break;

            case 2:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 2: Agregar los indices Pares (valores) ");
            nPares();
            break;

            case 3:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 3: Agregar los indices Impares (valores)");
            nImpares();
            break;

            case 4:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 4: Imprimir los multiplos de 4 y 7");
            multiplos_4y7();
            break;

            case 5:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 5: Imprimir los numeros entre 50 Y 90");
            n150y190();
            break;

            case 6:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 6: Imprimir el arreglo con letras minusculas");
            minusculas();
            break;

            case 7:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 7: Imprimir los primeros 100 multiplos de ocho");
            MultiplosdeOcho();
            break;

            case 8:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 8: Imprimir arreglo con los 100 primeros multiplos de 3, en decremento");
            decremento();
            break;

            case 9:
            System.out.println("---------------------------------------------------------");
            System.out.println("Usted ha seleccionado la opcion 9: Imprimir arreglo de 40 elementos con la secuencia *--*--, imprimelo");
            caracteres();

            break;

            case 10:
            salir = true;
            System.out.println("Saliendo del programa...");
            break;

            default:
            System.out.println("---------------------------------------------------------");
            System.out.println("Numero incompatible con el menú, ingresa otra opcion: ");  
        }
            
        } while (!salir);

    }


    public static void nDatos(){
        System.out.println("\nNumeros aleatorios entre 100 y 200.");
        System.out.println("\nIngrese el tamanio del arreglo:");

        int n = sc.nextInt(); 
        int [] array = new int [n];

        System.out.println("\nLos numero aleatorios son: ");

        for (int i = 0; i < n; i ++){

            array[i] = rnd.nextInt(101) + 100;

            System.out.print(array[i] + " ");
        }
         System.out.println();

    }

    public static void nPares() {
        System.out.println("\nLos numero aleatorios son: ");
        int n = 20;
        int [] array = new int [n];
        

        for (int i = 0; i < n; i++){

            array[i] = rnd.nextInt(101) + 100;

            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nNumeros pares");
        for (int i = 0; i < array.length; i++){

            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    
        
    }

    public static void nImpares(){
        System.out.println("\nLos numero aleatorios son: ");
        
        int n = 20;
        int [] array = new int [n];
        

        for (int i = 0; i < n; i++){
            array[i] = rnd.nextInt(101) + 100;
            System.out.print(array[i] + " ");
        }System.out.println();

        System.out.println("\nNumeros Impares");

        for (int i = 0; i < array.length; i++){

            if (array[i] % 2 !=0){

                System.out.print(array[i] + " ");

            }
        }System.out.println();


    }

    public static void multiplos_4y7() {

        System.out.println("\nLos numero aleatorios son: ");
        int n = 20;
        int [] array = new int [n];
        
        for (int i = 0; i < n; i++){
            array[i] = rnd.nextInt(101) + 100;
            System.out.print(array[i] + " ");
        }System.out.println();

        System.out.println("Múltiplos de 4 y 7: ");
        for (int i = 0; i < n; i++) {
        if (array[i] % 7 == 0 && array[i] % 4 == 0 ) {
            System.out.print(array[i] + " ");
        }
        } System.out.println();
  
        
    }

    public static void n150y190(){

        System.out.println("\nLos numero aleatorios son: ");
        n = 20;
        int [] array = new int [n];
        
        for (int i = 0; i < n; i++){
            array[i] = rnd.nextInt(151) + 40;
            System.out.print(array[i] + " ");
        }System.out.println();

    }

    public static void minusculas(){

        char [] letras = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.println(Arrays.toString(letras));
    }

    public static void MultiplosdeOcho(){

        int[] ocho = new int [100];

        for (int i = 0; i < ocho.length; i++) {
            ocho[i] = 8 * (i + 1);
          }
      
        System.out.println("Los primeros 100 múltiplos de 8 son:");
        for (int i = 0; i < ocho.length; i++) {
            System.out.print(ocho[i] + " ");
          } System.out.println();
    }

    public static void caracteres(){
    
        char[] arreglo = new char [40];

    for (int i = 0; i < 40; i += 4) {
        arreglo[i] = '*';
        arreglo[i + 1] = '-';
        arreglo[i + 2] = '-';
        arreglo[i + 3] = '*';
    }

    for (int i = 0; i < 40; i++) {
        System.out.print(arreglo[i] + " ");
    }
        System.out.println();

    }

    public static void decremento(){

        int[] arreglo = new int[101];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 300 - (i * 3);
          }
      
          System.out.println("Los 100 primeros múltiplos de 3 en decremento son:");
          for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
          } System.out.println();
    }

}