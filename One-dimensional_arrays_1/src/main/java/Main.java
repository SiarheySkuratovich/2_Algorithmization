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
        int k;
        System.out.print("Enter k: ");
        k = scanner.nextInt();
        System.out.println("Sum of multiples of K = " + getSumOfMultiplesK(array, k));
    }

    public static int getSumOfMultiplesK(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
