package Esercizio21e22;

import java.util.Scanner;

public class Esercizio21 {

        //Letto da input un numero ed un esponente (entrambi numeri interi) , stampare il
        //numero elevato all’esponente ( si può supporre che l’esponente è sempre un
         //numero >= 0 )



        public static int calcoloEsponenziale(int esponente, int numero){
            int risultato=1;
            for( int i=0; i<esponente; i++){
                risultato=risultato*numero ;
            }
            return risultato;
        }


        public static void main(String[] args) {

            System.out.print("Inserisci un numero intero");
            Scanner in = new Scanner(System.in);
            int numero = in.nextInt();

            System.out.print("Inserisci l'esponente");
            int esponente = in.nextInt();

            System.out.print("il risultato è"+calcoloEsponenziale(esponente, numero));
        }






}
