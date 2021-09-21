import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultiDimensCreDecresc {

    public static void main(String[] args) {

        int[][] array = new int[3][5];
        int temp;
        int max=1500;
        int min=0;

        for (int b = 0; b <= 4; b++){
            for( int a = 0; a <=2; a++)
                array[a][b]= (int)(Math.random() * (max - min + 1) + min);
        }
                System.out.println("Array alla cdc"+Arrays.deepToString(array));

        //ordine crescente
        for(int riga=0; riga <=2; riga++) {
            for (int rip = 1; rip <= 4; rip++) {
                for (int colonna = 1; colonna <= 4; colonna++) {
                    if (array[riga][colonna] <= array[riga][colonna - 1]) {
                        temp = array[riga][colonna - 1];
                        array[riga][colonna - 1] = array[riga][colonna];
                        array[riga][colonna] = temp;
                    }
                }
            }
        }
        System.out.println("\nArray ordinato in modo CRESCENTE"+"\n"+Arrays.deepToString(array));

        //ordine decrescente
        for(int riga=0; riga <=2; riga++) {
            for (int rip = 1; rip <= 4; rip++) {
                for (int colonna = 1; colonna <= 4; colonna++) {
                    if (array[riga][colonna] >= array[riga][colonna - 1]) {
                        temp = array[riga][colonna - 1];
                        array[riga][colonna - 1] = array[riga][colonna];
                        array[riga][colonna] = temp;
                    }
                }
            }
        }
        System.out.println("\nArray ordinato in modo DECRESCENTE"+"\n"+Arrays.deepToString(array));







    }



}
