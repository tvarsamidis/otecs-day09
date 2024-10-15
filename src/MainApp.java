import model.Player;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        String[] names = new String[2];

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < numbers.length; i++) {
            System.out.print("Give number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

    }
}
