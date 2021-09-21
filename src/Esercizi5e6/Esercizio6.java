package Esercizi5e6;

import java.util.Scanner;

public class Esercizio6 {

    public static void main(String[] args) {
        int numero=0;

        Scanner input = new Scanner(System.in);
        System.out.print("inserire un numero:  ");
        numero = input.nextInt();

        for( int i=1; i<=15000; i++)
            if( numero/i != 1 && numero/1 == 1){
                System.out.print(" " + numero + " è un numero primo");
                break;
            }
            else{
                System.out.print(" " + numero + " NON è un numero primo");
                break;
            }

    }





}
