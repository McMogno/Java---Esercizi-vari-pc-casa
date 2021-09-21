package Esercizi1e2;

import java.util.Scanner;

public class Esercizio1 {

        public int LetturaDati(){
            Scanner input = new Scanner(System.in);
            int in = input.nextInt();
            return in;
        }


        public static void main(String[] args) {
            Esercizio1 operazDoppio = new Esercizio1();

            System.out.print(" Inserisci il valore che vuoi moltiplicare per 2: " );
            int input = operazDoppio.LetturaDati();
            System.out.print(" Il doppio del numero da te inserito è: " + input*2);
        }




}
