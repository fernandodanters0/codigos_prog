import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Array_List1 {

    static Scanner sc = new Scanner (System.in);
    static Random rnd = new Random();
    static int n;
    static int num;

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------------------ARRAY-LIST 1---------------------------------");

        ArrayList <Integer> Numeros = new ArrayList<Integer>();

        System.out.print("\nIngresa el tamanio del arreglo: ");
        n = sc.nextInt();
  
        Random rand = new Random();

        for (int i = 0; i <= n; i++) {
        num = rand.nextInt(101) + 100;
        Numeros.add(num);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("ArrayList de Numeros aleatorios: " + Numeros);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList <Integer> pares = obtenerPares(Numeros);
        //Imprimimos los numeros pares
        System.out.println("Numeros Pares: " + pares);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList <Integer> impares = obtenerImpares(Numeros);
        //Imprimimos los numeros impares
        System.out.println("Numeros Impares: " + impares);  
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList <Integer> multiplos4_7 = obtenerMultiplosde4y7(Numeros);
        System.out.println("Multiplos de 4 y 7 consecutivamente: " + multiplos4_7);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList <Integer> mde150_190 = imprime150_190(Numeros);
        System.out.println("Numeros entre 150 y 190: " + mde150_190);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        double promedio = promedio(Numeros);
        System.out.println("Promedio: " + promedio);

        int moda = calcularModa(Numeros);
        System.out.println("Moda: " + moda);
    }

    public static ArrayList<Integer> obtenerPares(ArrayList<Integer> Numeros) {
        ArrayList<Integer> pares = new ArrayList<Integer>();
    
        for (int i = 0; i < Numeros.size(); i++) {
        num = Numeros.get(i);
          if (num % 2 == 0) {
            pares.add(num);
          }
        }
        return pares;
      }
      
      public static ArrayList<Integer> obtenerImpares(ArrayList<Integer> Numeros) {
        ArrayList<Integer> impares = new ArrayList<Integer>();
    
        for (int i = 0; i < Numeros.size(); i++) {
        num = Numeros.get(i);
          if (num % 2 != 0) {
            impares.add(num);
          }
        }
        return impares;
      }

      public static ArrayList<Integer> obtenerMultiplosde4y7 (ArrayList<Integer> Numeros) {
        ArrayList<Integer> multiplos4_7 = new ArrayList<Integer>();
    
        for (int i = 0; i < Numeros.size(); i++) {
        num = Numeros.get(i);
          if (num % 4 == 0 && num % 7 == 0) {
            multiplos4_7.add(num);
          }
        }
        return multiplos4_7;
      }

      public static ArrayList<Integer> imprime150_190 (ArrayList<Integer> Numeros) {
        ArrayList<Integer> mde150_190 = new ArrayList<Integer>();
    
        for (int i = 0; i < Numeros.size(); i++) {
        num = Numeros.get(i);
          if (150 < num && num < 190) {
            mde150_190.add(num);
          }
        }
        return mde150_190;
      }

      public static double promedio (ArrayList<Integer> Numeros) {

        int suma = 0;

        for (int i = 0; i < Numeros.size(); i++) {
        suma += Numeros.get(i);
        }

        double promedio = (double) suma / Numeros.size();
        double resultado = Math.round(promedio * 100.0) / 100.0;
        promedio = resultado;

        return promedio;
        
        }

        public static int calcularModa(ArrayList<Integer> Numeros) {
            int moda = 0;
            int maximo = 0;
        
            for (int i = 0; i < Numeros.size(); i++) {
              int num = Numeros.get(i);
              int cantidad = 0;
        
              for (int j = 0; j < Numeros.size(); j++) {
                if (Numeros.get(j) == num) {
                  cantidad++;
                }
              }
        
              if (cantidad > maximo) {
                moda = num;
                maximo = cantidad;
              }
            }
        
            return moda;
          }
}

