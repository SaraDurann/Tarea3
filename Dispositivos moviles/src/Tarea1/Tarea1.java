package Tarea1;
import java.util.Scanner;

public class Tarea1<mes> {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int tamNombre;
    private int mes;
    String letrasMes;
    private int resultado;

    public static void main(String[] args) {

//Ejercicio 1
    Tarea1 objeto = new Tarea1();
    objeto.solicitar();
    objeto.tamanio();
    objeto.crearArray();
    objeto.PreguntarMes();
    objeto.Calcula();

    }
    private void solicitar(){
        System.out.println("Ejercicio 1:");
        System.out.println("Introduce el nombre:");
        nombre = sc.next();
        System.out.println("El nombre es: " + nombre);
    }

    public void tamanio() {
        tamNombre = nombre.length();
        System.out.println("El tamaño en caracteres del nombre es: " + tamNombre);
        tamNombre = tamNombre - 1;
    }

    public void crearArray(){

        char[] stringAChar = nombre.toCharArray();
        System.out.println("El nombre al revés: ");
        for (int i = tamNombre; i>=0 ; i--){

            System.out.printf(""+stringAChar[i]);
        }
        System.out.println();

    }
//Ejercicio 2

private void PreguntarMes() {
    System.out.println("Ejercicio 2:");
    System.out.println("Introduce el número del mes: ");
    mes = sc.nextInt();

    switch (mes) {
        case 1:
            char[] enero = {'e', 'n', 'e', 'r', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(enero);
            break;
        case 2:
            char[] febrero = {'f', 'e', 'b', 'r', 'e', 'r', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(febrero);
            break;
        case 3:
             char[] marzo= {'m', 'a', 'r', 'z', 'o'};
            System.out.println("El mes correspondiente es: ");
             System.out.println(marzo);
            break;
        case 4:
            char[] abril = {'a', 'b', 'r', 'i', 'l'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(abril);
            break;
        case 5:
            char[] mayo = {'m', 'a', 'y', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(mayo);
            break;
        case 6:
            char[] junio = {'j', 'u', 'n', 'i', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(junio);
            break;
        case 7:
            char[] julio = {'j', 'u', 'l', 'i', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(julio);
            break;
        case 8:
            char[] agosto = {'a', 'g', 'o', 's', 't', 'o'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(agosto);
            break;
        case 9:
            char[] septiembre = {'s', 'e', 'p', 't', 'i', 'e', 'm', 'b', 'r', 'e'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(septiembre);
            break;
        case 10:
            char[] octubre = {'o', 'c', 't', 'u', 'b', 'r', 'e'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(octubre);
            break;
        case 11:
            char[] noviembre = {'n', 'o', 'v', 'i', 'e', 'm', 'b', 'r', 'e'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(noviembre);
            break;
        case 12:
            char[] diciembre = {'d', 'i', 'c', 'i', 'e', 'm', 'b', 'r', 'e'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(diciembre);
            break;
        default:
            char[] error = {'e', 'r', 'r', 'o', 'r', 'm', 'b', 'r', 'e'};
            System.out.println("El mes correspondiente es: ");
            System.out.println(error);

    }

}

//Ejercicio 3
public void Calcula(){
    System.out.println("Ejercicio 3");
    System.out.println("Dame la variable a:");
    int a = sc.nextInt();
    System.out.println("Dame la variable b:");
    int b = sc.nextInt();
    System.out.println("Dame la variable c:");
    int c = sc.nextInt();

    int resultado = (b*b)-(4*a*c);

    System.out.println("Resultado: " + resultado);

    if (resultado == 0) {
        System.out.println("Es igual a 0, por lo tanto es una SOLUCIÓN ÚNICA");
    }

    if (resultado < 0) {
        System.out.println("Es menor a 0, por lo tanto es una SOLUCIÓN IMAGINARIA");
    }

    if (resultado >0) {
        System.out.println("Es mayor a 0, por lo tanto tiene DOS SOLUCIONES");
    }

}
}
