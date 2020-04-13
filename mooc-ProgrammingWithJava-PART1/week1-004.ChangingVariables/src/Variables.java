import java.util.Scanner; 
public class Variables {

    public static void main(String[] args) {
        // CHANGE THESE:

        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string : ");
        String message = sc.nextLine();
        System.out.println(message);
        System.out.println("Give an integer : ");
        int value = sc.nextInt();
        System.out.println(value);
        System.out.println("Give a double : ");
        double dvalue = sc.nextDouble();
        System.out.println(dvalue);
        System.out.println("Give a boolean");
        boolean tf = sc.hasNextBoolean();
        System.out.println(tf);
        
      
    }

}
