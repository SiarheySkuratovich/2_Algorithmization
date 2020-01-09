import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a size of a first array");
        Scanner scanner = new Scanner(System.in);
        int firstArrayLength = scanner.nextInt();
        System.out.println("Enter a size of a second array");
        int secondArrayLength = scanner.nextInt();
        int[] firstArray = new int[firstArrayLength + secondArrayLength];
        int[] secondArray = new int[secondArrayLength];
        System.out.println("Fill the first array:");
        for (int i = 0; i < firstArrayLength; i++) {
            System.out.print(i + ": ");
            firstArray[i] = scanner.nextInt();
        }
        System.out.println("Fill the second array:");
        for (int i = 0; i < secondArrayLength; i++) {
            System.out.print(i + ": ");
            secondArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the index in which you want to insert the second array into first array");
        int k = scanner.nextInt();
        if (k >= firstArrayLength) {
            throw new IllegalArgumentException();
        }
        for (int i = firstArrayLength - 1; i > k; i--) {
            firstArray[i + secondArrayLength] = firstArray[i];
        }

        for (int i = k + 1; i < k + secondArrayLength + 1; i++) {
            firstArray[i] = secondArray[i - k - 1];
        }
        System.out.println("new first array: " + Arrays.toString(firstArray));
    }
}
