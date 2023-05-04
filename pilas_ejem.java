package Paquete_Pilas;
import java.util.*;
public class pilas_ejem{

    // creacion de pilas
    public static int m;
    public Stack<Integer>Pila1 = new Stack<Integer>();
    public Stack<Integer>Pila2 = new Stack<Integer>();
    public Stack<Integer>Pila3 = new Stack<Integer>();

    public static void PedirDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de datos: ");
        m = sc.nextInt();
        sc.close();
    }

    public static void llenar_pila(Stack<Integer> p) {

        Random r = new Random();

        for (int i = 0; i < m; i ++){
            p.push(r.nextInt(100));
        }
        
    }

    public static Stack<Integer> sumaPilas(Stack<Integer> a, Stack<Integer> b) {
        Stack<Integer> m = new Stack<Integer>();
        while (!a.empty()){
            m.push( a.peek()+b.peek());
            a.pop();
            b.pop();
        }
        return m;
        
    }

    public static Stack<Integer> invertirPila(Stack<Integer> pila) {
        Stack<Integer> pilaInvertida = new Stack<>();
        while (!pila.isEmpty()) {
            pilaInvertida.push(pila.pop());
        }
        return pilaInvertida;
    }

    public static void main(String [] args) {

        pilas_ejem.PedirDatos();
        pilas_ejem obj = new pilas_ejem();
        pilas_ejem.llenar_pila(obj.Pila1);
        System.out.println("\nLa pila 1 es: " + obj.Pila1);

        pilas_ejem.llenar_pila(obj.Pila2);
        System.out.println("\nLa pila 2 es: " + obj.Pila2);

        obj.Pila3 = pilas_ejem.sumaPilas(obj.Pila1, obj.Pila2);
        System.out.println("\nLa pila 3 original es: " + obj.Pila3 + "\n");

        Stack<Integer> pilaInvertida = invertirPila(obj.Pila3);

        System.out.println("Pila invertida: " + pilaInvertida + "\n");

        
    }
}