package Esercizi1e2;

import java.security.spec.EdDSAParameterSpec;
import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nInserisci la prima variabile: ");
        int a = input.nextInt();

        System.out.println("\nInserisci la prima variabile: ");
        int b = input.nextInt();

        System.out.println("\nInserisci la prima variabile: ");
        int c = input.nextInt();

        int d = ((b*b)-(4*a*c));

        if( d >= 0 )
            System.out.print("Il discriminante è: " + d + "quindi è positivo");
        else
            System.out.print("Il discriminante è: " + d + "quindi è negativo");

    }


}
