
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.println("Insert a number: ");
        int number = reader.nextInt();
        if (number > 0){
            System.out.println("Then number is positive");
        }else{
            System.out.println("The number is negative");
        }
    }
}
