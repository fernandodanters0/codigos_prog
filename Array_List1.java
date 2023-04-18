import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Array_List1 {

    static Scanner sc = new Scanner (System.in);
    static Random rnd = new Random();
    static int n;
    static int num;

    public static void main(String[] args) {

        System.out.println("---------------------------ARRAY-LIST 1---------------------------------");

        ArrayList <Integer> Numeros = new ArrayList<Integer>();

        System.out.print("\nIngresa el tamanio del arreglo: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
        num = rnd.nextInt(101) + 100;
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

////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------------------------ARRAY-LIST 2---------------------------------");
        Array_List1.reemplazar(Numeros);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<String> Letras = new ArrayList<String>();
        ArrayList<String> minsculas = letras(Letras);
        System.out.println("ArrayList con letras minusculas: " + minsculas);
////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        Array_List1.Multiplosde8(multiplos);
        System.out.println("ArrayList con multiplos de 8: " + multiplos);
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nArreglo de 40 elementos con la secuencia *--*--, imprimelo");
        ArrayList<Character> Lista = new ArrayList<Character>();
        Array_List1.caracteres(Lista);
        System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> Numeros3 = new ArrayList<Integer>();
        ArrayList<Integer> dec = Decremento(Numeros3);
        System.out.println("Los 100 primeros multiplos de 3, en decremento: " + dec);

        System.out.println("------------------------------------------------------------------------");
      
        
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

      public static ArrayList<Integer> reemplazar (ArrayList<Integer> Numeros) {
        
        int index = Numeros.indexOf(150);
        if (index != -1) {
            Numeros.set(index, 500);
        }

        // Imprimir la lista después de la actualización
        System.out.println("Reemplazamos los 150 por 500: " + Numeros);
            return Numeros;
      }

      public static ArrayList<String> letras (ArrayList<String> Letras) {
          ArrayList<String> minsculas = new ArrayList<String>();

          for (char c = 'a'; c<= 'z'; c++){
            minsculas.add(String.valueOf(c));
          }

          return minsculas;
        }

      public static void Multiplosde8 (ArrayList<Integer> Ocho){
      // Encontrar los primeros 100 múltiplos de 8
      for (int i = 1; Ocho.size() < 100; i++) {
        if (i % 8 == 0) {
            Ocho.add(i);
        }
    }
      System.out.println();
    }

    public static ArrayList<Character> caracteres(ArrayList<Character>Lista){

      ArrayList<Character> list = new ArrayList<Character>();

        // Agregar elementos a la lista
        for (int i = 0; i < 40; i++) {
            if (i % 4 == 0 || i % 4 == 1) {
                list.add('*');
            } else {
                list.add('-');
            }
        }
        // Imprimir lista
        for (char c : list) {
            System.out.print(c);
        } System.out.println();

      return list;
    }

    public static ArrayList<Integer>Decremento(ArrayList<Integer> Numeros3) {
      ArrayList <Integer> dec = new ArrayList <Integer> ();

       // Agregar los primeros 100 múltiplos de 3 en orden decreciente
       for (int i = 300; i > 0 && Numeros3.size() < 100; i -= 3) {
        if (i % 3 == 0) {
            dec.add(i);
        }
    }
      dec.add(0);

      return dec;
      
    }

}

