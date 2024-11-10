import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] array = new int[size];
        boolean found = false;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir san jaz: ");
        int scan = scanner.nextInt();


        for (int i = 0; i < size; i++) {
            if (array[i] == scan) {
                System.out.println("San: " + scan + "\n" + "Jaigashkan indexsi: " + i + "\t");
                found = true;
                break;
            }

        }
        if (!found) {
            System.err.println("Myndai san massivdin ichinde jok");
        }

    }
}