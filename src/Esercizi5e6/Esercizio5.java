package Esercizi5e6;

import java.util.Scanner;

public class Esercizio5 {

    public static void main(String[] args) {

        int[] array = new int[150];

        Scanner input = new Scanner(System.in);
        System.out.print("inserire una sequenza di x numeri interi e positivi (premi -1 per finire):  ");
        for (int i = 0; i <= 149; i++){
            array[i] = input.nextInt();
            if( array[i] == -1)
                break;
        }

        for (int i=0; i<=array[array.length-1]; i++)
            if(array[i] <= array[i+1] && array[i+1] <= array[i+2])
                System.out.println("La serie è crescente");
            else{
                if(array[i] >= array[i+1] && array[i+1] >= array[i+2] )
                    System.out.println("La serie è decrescente");
                else
                    System.out.println("La serie è mista");
            }


    }




}
