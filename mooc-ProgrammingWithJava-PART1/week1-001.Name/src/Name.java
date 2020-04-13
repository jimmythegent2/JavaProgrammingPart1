import static java.time.Clock.system;
import java.util.Scanner;
public class Name {
    
    public static void main(String[] args) {
        // Write your program here
        // Please answer to our survey http://oo-start.mooc.fi/english_mooc_participants/new
        // It will take less than 5 minutes!
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your name?: ");
        
        String message = sc.nextLine();
        
        System.out.println("Hi " + message);
    }

}
