import java.util.Scanner;

public class ArrayOrdineCreDecrescente {

    public static void main(String[] args) {

        int[] array = new int[3];
        int temp;

        Scanner input = new Scanner(System.in);
        System.out.print("inserire una sequenza di 3 numeri interi e positivi:  ");
        for (int i = 0; i <= 2; i++)
            array[i] = input.nextInt();

        //ordine crescente
        for (int a = 1; a <= 2; a++) {
            for (int i = 1; i <= 2; i++)
                if (array[i] <= array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
        }
        System.out.print("L'array in ordine crescente è: " + "  " + array[0] + "  " + array[1] + "  " + array[2]);

        //ordine decrescente
        for (int a = 1; a <= 2; a++) {
            for (int i = 1; i <= 2; i++)
                if (array[i] >= array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
        }
        System.out.print("\nL'array in ordine decrescente è: " + "  " + array[0] + "  " + array[1] + "  " + array[2]);


    }


}

