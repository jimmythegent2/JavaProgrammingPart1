
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Give Speed: ");
        int biggerNumber = reader.nextInt();
        if (biggerNumber > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}
