package Esercizi3e4;

import java.util.Scanner;

public class Esercizio3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("inserire un anno: ");
        int annoInput = input.nextInt();

        if( annoInput%4 == 0 || annoInput%100 == 0)
            System.out.print("L'anno è bisestile");
        else
            System.out.print("L'anno NON è bisestile");

    }

}
