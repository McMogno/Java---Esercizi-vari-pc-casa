package Esercizi3e4;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        int[] array= new int[10];
        double media=0.0;
        int somma = 0;
        int numMax=0;
        int numMin=1;

        Scanner input = new Scanner(System.in);
        System.out.print("inserire una sequenza di 10 numeri interi e positivi:  ");
        for(int i=0; i <= 9; i++)
            array[i] = input.nextInt();

        // media dei valori dell'array
        for ( int i=0; i<=9; i++)
            somma = somma+array[i];
            media = (double)somma/10;
            System.out.print("La media dei valori è: "+ media);

        // trova il maggiore tra i valori degli array
        for (int i=0; i <= 9; i++) {
            if (array[i] >= numMax)
                numMax = array[i];
            else
                numMin = array[i];
        }
        System.out.print("Il numero max è :" + numMax);
        System.out.print("Il numero min è :" + numMin);


    }








}
