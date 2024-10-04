package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /* int n;
       int m;
       int i;

        System.out.println("Ingrese el primer numero: ");  // el out es para imprimir en la pantalla
        n = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        m = scanner.nextInt();
        System.out.println("Ingrese el incremento de cuanto quiere hacer: ");
        i = scanner.nextInt();

        if(n>= 0 && m>= 0){
            for(int a=n; a<=m; a=a+i){
                System.out.print(a+" ");




            }*/
        //-----------------------EJERCICIO 2-----------------------------
        //2.- Implementar la impresión de su nombre n veces.

        String nombre;
        int n;

        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("cuantas veces desea repetir: ");
        n=sc.nextInt();

        for(int a=1 ; a<=n ; a++){
            System.out.print(nombre + " ");
        }
        System.out.println("Hola Mundo");
    }
}

// commit -- realiza los cambio cuando ya estoy seguro de los mismo
// push -->subo los cambios
