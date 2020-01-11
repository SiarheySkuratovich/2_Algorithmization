import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        System.out.println("Fill the array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Count of transpositions: " + sortBySwaps(array));
        System.out.println("Sorted array: " +  Arrays.toString(array));
    }


    //returns CommonCountOfTranspositions
    public static int sortBySwaps(int[] array) {
        int countOfTranspositions = 0;
        int temp;
        for (int out = array.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                    countOfTranspositions++;
                }
            }
        }
        return countOfTranspositions;
    }
}
