package Esercizi24e25;

import java.util.Scanner;

public class Esercizio24 {

    public int numero;
    public int fatt;

/*    Si scriva un programma in Java che , letto da input un numero intero n ,
    stampi "errore" se il numero è minore di 0 altrimenti stampi il fattoriale di n .
    Creare un metodo RICORSIVO che riceve come parametro n e restituisce il
    fattoriale di n .
    Ti ricordo che la formula ricorsiva per ottenere il fattoriale di n è
           n=n*(n-1)! se n>1 altrimenti restituire 1
*/

    // metodo lettura numero
    public void letturaNumero(){
        System.out.print("Inserisci un numero intero");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
    }

    //metodo per controllare il numero
    public int controlloNumero(){
        fatt=numero;
        if(numero<0)
            System.out.print("ERRORE");
        else
            if( numero >1 ){
                for(int i=numero; i>=1; i--)
                    fatt = fatt*(i-1);
                return fatt;
            }
            else
                System.out.print("1");
            return fatt;
    }


    public static void main(String[] args) {

        Esercizio24 prova1 = new Esercizio24();
        prova1.letturaNumero();
        prova1.controlloNumero();

        System.out.print(" il fattoriale è:" + prova1.fatt);

    }







}
