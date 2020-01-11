import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        array = new int [scanner.nextInt()];
        System.out.println("fill the array with integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
        }
        sortByInsertion(array);
        System.out.println("Sorted array: " + Arrays.toString(array));


    }

    
    public static void sortByInsertion(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i;
            int temp;
            temp = array[i + 1];
            while (true) {
                if (j >= 0 && temp < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                } else {
                    array[j + 1] = temp;
                    break;
                }
            }
        }
    }
}
