import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Arreglos_1 {

    static Scanner sc = new Scanner (System.in);
    static Random rnd = new Random();
    static int n;
    static boolean salir = false;

    public static void Datos1() {

        System.out.print("\nIngresa el tamanio del arreglo: ");
        n = sc.nextInt();
        //TipoDato[] identf = new TipodeDato[tam];
        int[] arreglo = new int [n];

        for (int i = 0; i < n; i++){
            //arr1[i] = (int)(Math.random()*(200-100+1)+100);
            arreglo[i] = rnd.nextInt(101) + 100;
            System.out.print(" " + arreglo[i]);

        } System.out.println();

        imprimePares(arreglo);
        imprimeImpares(arreglo);
        Multiplos4y7(arreglo);
        imprime150_190(arreglo);
        Promedioymoda(arreglo);
        reemplazar(arreglo);
        
    }

    public static void imprimePares(int[] a){
        System.out.println("\nAreglo - datos pares: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                System.out.print(" " + a[i]);
            }
        } System.out.println();

    }

    public static void imprimeImpares(int[] a) {
        System.out.println("\nAreglo - datos pares: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 != 0){
                System.out.print(" " + a[i]);
            }
        } System.out.println();
    }

    public static void Multiplos4y7(int[] a){
        System.out.println("\n Arreglo - multiplos de 4 y 7: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 4 == 0 && a[i] % 7 == 0){
                System.out.print(" " + a[i]);
            } 
        } System.out.println();
    }

    public static void imprime150_190(int[] a) {
        System.out.println("\n Arreglo - numeros de entre 150 y 190: ");
        for (int i = 0; i < a.length; i++){
            if (150 < a[i] && a[i] < 190){
                System.out.print(" " + a[i]);
            }
        } System.out.println();
    }

    public static void Promedioymoda(int[] a) {
        int suma = 0;
        double promedio;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        promedio = (double) suma / a.length;
        System.out.println("El promedio del arreglo es: " + promedio);

        // Moda
        int maxima = 0;
        int moda = 0;
 
        for (int i = 0; i < a.length; i++){
            int Repite = 0;
            for (int j = 0; j < a.length; j++){
                 if (a[i] == a[j])
                Repite++;
            }
            if (Repite > maxima){
                moda = a[i];
                maxima = Repite;
            }
        }

        System.out.println("La moda es " + moda + " y se repitió " + maxima + " veces.");
        
    }

    public static void reemplazar(int[] a){

        System.out.println("\nReemplazamos los 150 por 500 en el arreglo: ");

        for (int i = 0; i < a.length; i++){
            if (a[i] == 150){
                a[i] = 500;
            }
        }
        System.out.println();
        System.out.println("Arreglo modificado: " + Arrays.toString(a));
        System.out.println();

    }

    public static void minusculas(){

        System.out.println("\nArreglo con letras minusculas: ");

        char [] letras = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.println(Arrays.toString(letras));
    }

    public static void MultiplosdeOcho(){
        System.out.println("\nLos primeros 100 multiplos de 8 son: ");
        int[] ocho = new int [100];

        for (int i = 0; i < ocho.length; i++) {
            ocho[i] = 8 * (i + 1);
          }
          
        for (int i = 0; i < ocho.length; i++) {
            System.out.print(ocho[i] + " ");
          } System.out.println();
    }

    public static void caracteres(){
        System.out.println("\nArreglo de 40 elementos con la secuencia *--*--, imprimelo");

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

       /*  // Asignar valores al arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 4 == 0 || i % 4 == 1) {
                arreglo[i] = '*';
            } else {
                arreglo[i] = '-';
            }
        }

        // Imprimir arreglo
        System.out.println(arreglo); */

    }

    public static void decremento(){
        System.out.println("\nArreglo con los 100 primeros multiplos de 3, en decremento");

        int[] arreglo = new int[101];
        int contador = 0;

        for (int i = 300; i > 0 && contador < 101; i -= 3) {
            if (i % 3 == 0) {
                arreglo[contador] = i;
                contador++;
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }


////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String [] args) {

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Los datos del Primer arreglo: ");
        Arreglos_1.Datos1();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Los datos del Segundo arreglo: ");
        Arreglos_1.minusculas();
        Arreglos_1.MultiplosdeOcho();
        Arreglos_1.decremento();
        Arreglos_1.caracteres();
        System.out.println("------------------------------------------------------------------------");

        
    }
}


    
