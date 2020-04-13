
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "Caput Draconis"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("Password?");
        String input = reader.nextLine();
        
        if (input.equals(password)){
            System.out.println("Welcome!");
        }else System.out.println("Off with you!");
    }
}
