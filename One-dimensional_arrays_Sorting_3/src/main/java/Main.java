import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner= new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        System.out.println("Fill the array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Sorted array:" + Arrays.toString(sortBySelection(array)));
    }

    public static int[] sortBySelection(int[] array) {
        int tempMaxIndex = 0;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            tempMaxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[tempMaxIndex]) {
                    tempMaxIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[tempMaxIndex];
            array[tempMaxIndex] = temp;
        }
        return array;
    }
}
