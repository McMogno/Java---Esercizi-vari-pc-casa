package Esercizio21e22;

import java.util.Scanner;

public class Esercizio22 {

//    Letti da input due interi n1 ed n2 ed un simbolo di operazione c ,
//    (uno tra i seguenti: '+', '-'; '*'; '/'; '^') implementare un programma
//    che esegua l'operazione prescelta con n1 ed n2 come operandi. Si può supporre
//    che l’utente non inserisca simboli diversi da quelli richiesti dalla traccia.

    public static int operazione(int n1, int n2, String c){

        switch (c) {
            case ("+") -> {
                return n1 + n2;
            }
            case ("-") -> {
                return n1 - n2;
            }
            case ("*") -> {
                return n1 * n2;
            }
            case ("/") -> {
                return n1 / n2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci un numero intero");
        int n1 = in.nextInt();

        System.out.print("Inserisci il secondo numero intero");
        int n2 = in.nextInt();

        System.out.print("Inserisci il tipo di operazione");
        String c = in.next();

//        if(c!= "+" || c!= "-"|| c!= "*" || c!= "/" ){
//            System.out.print("Hai inserito un'operazione non valida");
//            break;
//        }

        int risultato = operazione(n1,n2,c);

        System.out.print("Il risultato dell'operazione è: " + risultato);
    }

}
