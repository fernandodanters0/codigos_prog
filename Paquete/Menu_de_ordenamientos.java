package Paquete;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Menu_de_ordenamientos {
    

    /*es una tarea que se usa frecuentemente para otras operaciones:
    Ordenamiento: consiste en dado un grupo de datos colocarlos de una manera especial
    basandose en un criterio especifico.

    Registro nodo: es un grupo de datos considerados como un elemento. pueden ser 
    atómicos o un grupo de ellos (Estructuras en C/C++), cada datos se conoce como CAMPO.

     Clave: Es la parte de un registro que sirve como base para el ordenamiento
     Se utiliza para comprobar dos registros o nodos, generalmente es un campo
     o combinaciones de ellos.

     Criterio de ordenamiento: Son las reglas que se utilizan para comprobar a 
     los registros con base en una o mas claves.

     Algoritmo de ordenamiento estable: Un algoritmo es estable si no cambia
     el orden de los registros con claves identicas.
     */
    

     public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        Random rnd = new Random();
        boolean salir = false;
        boolean encontrado = false;
        int n = 10; // Tamaño del arreglo
        int nbuscado, aux;
        int[] arreglo = new int[n]; // Arreglo a utilizar en diferentes casos del switch

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100); // Generar números aleatorios entre 0 y 99
        }
        
        while (!salir){
        int opcion;


            System.out.println("---------------------------------------------------------");  
            System.out.println("Bienvenido(a) al menu de Ordenamientos");
            System.out.println("1.- Obtener Datos");
            System.out.println("2.- Ordenamiento por Burbuja");
            System.out.println("3.- Ordenamiento por Insercion");
            System.out.println("4.- Ordenamiento por Seleccion");
            System.out.println("5.- Ordenamiento por Merge sort");
            System.out.println("6.- Ordenamiento por Quicksort");
            System.out.println("7.- Busqueda Secuencial");
            System.out.println("8.- Búsqueda Binaria");
            System.out.println("9.- Imprimir desordenamiento");
            System.out.println("10.- Salir");


            System.out.println("\nSelecciona una opcion");
            opcion = sc.nextInt();  
        
        
        switch (opcion){

        case 1:
        System.out.println("---------------------------------------------------------");  
        System.out.println("Datos aleatorios: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    
        /*for (int i = 0; i < array.length; i++){ //For para que recorra el arreglo
        array[i] = (int)(Math.random()*100); //Le decimos que dentro del arreglo se intriduzacn valores alatoriios
        System.out.print(array[i] + " ") } ;    // con la funcion random en un rango de 0 a 100
       System.out.println(); */                // Pedimos que imprima el arreglo aleatorio
      
        break;

        case 2:
        System.out.println("---------------------------------------------------------");
        System.out.println("Metodo de ordenamiento Burbuja ");
        System.out.println("\nNumeros aleatorios: ");
        //Comenzamos colocando los numeros aleatorios:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

        //Proceso de Ordenamiento:

        //Tomamos un auxiliar entero
        for (int i = 0; i < arreglo.length; i++){ //Con el for le decimos que recorra el largo del arreglo
            for( int j = 0; j < arreglo.length - 1; j++){ // Como es burbuja creamos un doble for con variable j y que inicie en posicion 0
                if (arreglo[j] > arreglo[j+1]){ // que sea menonr que el largo del arreglo -1 por la ultima posicion cuando fnaliza y que asu vez vaya incrementando
                aux = arreglo[j]; //Decimos que el auxiliar que compara los dos numeros sea igual al arreglo del for anterior
                arreglo[j] = arreglo[j+1]; //El arreglo se ira comprarando el de la izquerda con el de la derecha, este asu vez sera igual al arreglo [+1]
                arreglo[j+1] = aux; //Finalmente indicamos el que el arreglo [j+1] sea igual al auxiliar comparador
                }
            }
        }

        //Mostrar Datos
        System.out.println("\nElementos ordenados de forma ascendente");
        for (int i = 0; i < n; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
            break;

/////////////////////////////////////////////////////////////////////////////////////////
        case 3:
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Metodo de ordenamiento Insercion");
        System.out.println("\nNumeros aleatorios");
        //Comenzamos colocando los numeros aleatorios:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        
    //Proceso de Ordenamiento:
        for (int i = 0; i < arreglo.length; i++ ){
            int pos = i; // la posicion del arreglo (flechita)
            aux = arreglo[i]; //Numero actual

        while ((pos > 0) && (arreglo[pos-1] > aux)){ // la posicion debe de ser mayor a 0, y el arreglo el numero de la izquierda sea mayor al actual, aux = numero actual
            arreglo[pos] = arreglo[pos-1]; // Se cambia el numero actual igualandolo al de la izquierda
            pos--; // Para comprobar numeros a la izquierda hasta que llegue a la posicion 1
        }    
        arreglo[pos] = aux; //Asi se refresca el numero actual en cada iteracion
        }

        //Mostrar datos
        System.out.println("\nLos datos ordenados por insercion en forma ascendente");
            for (int i = 0; i < arreglo.length; i++){
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();

            System.out.println("\nLos datos ordenados por insercion en forma descendente");
            for (int i = (arreglo.length-1); i>=0 ; i--){
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        break;

/////////////////////////////////////////////////////////////////////////////////////////

        case 4:
        System.out.println("---------------------------------------------------------");
        System.out.println("Metodo de ordenamiento Seleccion");
        System.out.println("\nNumeros aleatorios: ");
        //Comenzamos colocando los numeros aleatorios:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

    //Proceso de Ordenamiento:
        for (int i = 0; i < arreglo.length; i++){ //For para recorrer el largo del arreglo
            int minimo = i; //valor que actualizara la posicion del numero mas pequeño
            for (int j = i + 1; j < arreglo.length; j++){ //For compara los valores del arreglo
                if (arreglo[j] < arreglo[minimo]){ //Si la posicion actual es menor a a del minimo
                    minimo = j; // si es asi entonces cambia de lugar
                }
            }
            if (i != minimo){ // si el 
                aux = arreglo[i]; //valor que se encuentra a la izquierda
                arreglo[i] = arreglo[minimo]; // cambia el valor a minimo
                arreglo[minimo] = aux; //cambia de posicion al elemento de la izquierda
            }
        }
        //Mostrar Datos
        /*System.out.println("\nLos datos ordenados por seleccion en forma ascendente");
            for (int i = 0; i < seleccion.length; i++){
                System.out.print(seleccion[i] + " "); 
            } */
            System.out.println("\nNumeros ordenados por el metodo de Seleccion");
            for (int i = 0; i < arreglo.length; i++){
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        break;

/////////////////////////////////////////////////////////////////////////////////////////
        case 5:
        System.out.println("---------------------------------------------------------");
        System.out.println("Metodo de ordenamiento Merge Sort");
         //Comenzamos colocando los numeros aleatorios:
         for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        
        //Ordenamiento
        System.out.println("");
        System.out.println("\nLos numeros ordenados son: ");

        mergeSort(arreglo, 0, arreglo.length - 1);
        System.out.println(Arrays.toString(arreglo));

        System.out.println();
        
        break;

/////////////////////////////////////////////////////////////////////////////////////////
        
        case 6:
        System.out.println("---------------------------------------------------------");
        System.out.println("Metodo de ordenamiento Quicksort");
       //Comenzamos colocando los numeros aleatorios:
       for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
        System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

        System.out.println("\nLos numeros ordenados son: ");

        quicksort(arreglo, 0, arreglo.length - 1);
        System.out.println(Arrays.toString(arreglo));

        //System.out.print(Arrays.toString(quick));
        System.out.println();
    
        break;

/////////////////////////////////////////////////////////////////////////////////////////

        case 7:
        System.out.println("---------------------------------------------------------");
        System.out.println("Búsqueda Secuencial");
        //Comenzamos colocando los numeros aleatorios:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

        encontrado = false;
        System.out.print("\nIngrese el número a buscar: ");
        nbuscado = sc.nextInt();
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == nbuscado){
                System.out.println("El numero " + nbuscado + " se encuentra en la posicion " + i + " del arreglo.");
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("El numero " + nbuscado + " no se encuentra en el arreglo.");
        
        }
         
        
        break;

 /////////////////////////////////////////////////////////////////////////////////////////
 
        case 8:
        System.out.println("---------------------------------------------------------");
        System.out.println("Búsqueda Binaria");
        //Comenzamos colocando los numeros aleatorios:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);// Generar números aleatorios entre 0 y 99
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

        //Proceso de Ordenamiento por Burbuja:
        for (int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length - 1; j++){
                if (arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        //Mostrar Datos
        System.out.println("");
        System.out.println("\nDatos Ordenados");
            for (int i = 0; i < arreglo.length; i++){
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        //Busqueda
        System.out.print("\nIngresa el numero a buscar: ");
        
        nbuscado = sc.nextInt();
        
        encontrado = false;
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int centro = (inicio + fin) / 2;
            if (arreglo[centro] == nbuscado) {
                System.out.println("El numero " + nbuscado + " se encontró en la posición " + centro + " del arreglo.");
                encontrado = true; 
                
            } else if (arreglo[centro] > nbuscado){
                fin = centro - 1;
            } else { 
                inicio = centro + 1;
            }
            
        }

        if (!encontrado){
            System.out.println("El elemento " + nbuscado + " no se encontró en el arreglo");
        }

       

       /*  int pos = Arrays.binarySearch(arreglo, nbuscado);
        
        
        if (pos >= 0) {
            System.out.println("El valor " + nbuscado + " se encuentra en la posición " + pos);
        } else {
            System.out.println("El valor " + nbuscado + " no se encontró en el arreglo.");
        } 

        */
        break;

/////////////////////////////////////////////////////////////////////////////////////////

        case 9:
        System.out.println("---------------------------------------------------------");
        System.out.println("Desordenamiento");
        System.out.println("\nNumeros aleatorios");
        
        Integer[] arreglo_d = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        System.out.println(Arrays.toString(arreglo_d));
      
        System.out.println("\nNumeros desordenados: ");

        Collections.shuffle(Arrays.asList(arreglo_d), new Random());
        System.out.println(Arrays.toString(arreglo_d));
        System.out.println();
        break; 

/////////////////////////////////////////////////////////////////////////////////////////        

        case 10:
        salir = true;
        System.out.println("Saliendo del programa...");
        break;

        default:
        System.out.println("---------------------------------------------------------");
        System.out.println("Numero incompatible con el menú, ingresa otra opcion: ");        
            
    }
}
}


/////////////////////////////////////////////////////////////////////////////////////////       
   //ORDENAMIENTO QUICKSORT CONSTRUCTORES-CODIGO
    public static void quicksort(int arreglo[], int prim, int ult){

        int i, j, pivote, aux;
        i = prim;
        j = ult;
        pivote = arreglo[(prim + ult) / 2];

        do{
            while (arreglo[i] <= pivote  && i < j){
                i++;
            }

            while (arreglo[j] > pivote){
                j--;
            }

            if (i<= j){
                aux = arreglo[i];
                arreglo[i] =  arreglo[j];
                arreglo[j] = aux;
                
            }
        }while (i < j);

        arreglo[prim] = arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (prim < j-1){
            quicksort(arreglo, prim, j-1);
        }
        if (j+1 < ult){
            quicksort(arreglo, j+1, ult);
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////       

        //ORDENAMIENTO MERGE-SORT CONSTRUCTORES-CODIGO
        public static void mergeSort(int [] arreglo, int prim, int ult){
            int cen;
            if (prim < ult){
                cen = (prim + ult)/2;
                mergeSort(arreglo, prim, cen);
                mergeSort(arreglo, cen + 1, ult);
                mezclando(arreglo, prim, cen, ult);
            }

        }
        public static void mezclando(int [] arreglo, int izq, int med, int der){
            int temp [] = new int [arreglo.length];
            int x,y,z;
            x = z = izq;

            y = med+1;
            while (x <= med && y <= der){
                if (arreglo[x] <= arreglo[y]){
                    temp[z++] = arreglo[x++];
                }
                else{
                    temp[z++] = arreglo[y++];
                }
            }

            while(x <= med){
                temp[z++] = arreglo[x++];
            }

            while(y <= der){
                temp[z++] = arreglo[y++];
            }
            System.arraycopy(temp, izq, arreglo, izq, der-izq+1);
        }
    

}




