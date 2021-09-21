package Esercizio23;

import java.util.Arrays;

public class Esercizio23 {

/*    Si scriva un programma Java che, sfruttando adeguatamente dei metodi statici, operi
    su due sequenze di numeri interi positivi in accordo a quanto descritto di seguito.
    Siano dette A e B due sequenze di numeri interi positivi terminate da un tappo
    negativo, e sia quindi detto x il numero di elementi PARI nella sequenza A. Si
    intende prima calcolare x, e quindi contare quante volte x è contenuto nella
    sequenza B.
*/
    int[] arrayA = new int [10];
    int[] arrayB = new int [10];
    int x=0;
    int y=0;

    public void generazioneArrayAB(){
        int max= 100;
        int min= 0;

        for( int a = 0; a <10; a++){
            arrayA[a]= (int)(Math.random() * (max - min + 1) + min);
            arrayB[a]= (int)(Math.random() * (max - min + 1) + min);
        }
        System.out.println("ArrayA"+Arrays.toString(arrayA));
        System.out.println("ArrayB"+Arrays.toString(arrayB));
    }

    public int controlloPariArrayA() {
        for (int i = 0; i < 10; i++) {
            if ((arrayA[i] % 2) == 0)
                x++;
        }
        return x;
    }

    public int controlloPariArrayB() {
        for (int i = 0; i < 10; i++) {
            if ((arrayB[i] % 2) == 0)
                y++;
        }
        return y;
    }

    public static void main(String[] args) {

        Esercizio23 prova1 = new Esercizio23();

        System.out.print(" I due array sono i seguenti:\n ");
        prova1.generazioneArrayAB();
        System.out.print(" I numeri pari nel primo array sono:" + prova1.controlloPariArrayA());
        System.out.print("\n I numeri pari nel secondo array sono:" + prova1.controlloPariArrayB());

    }





}
