package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n;
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
            }
        }

    }
}

