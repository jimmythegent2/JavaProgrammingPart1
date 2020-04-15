
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = reader.nextInt();
        reader.close();
        boolean isLeap = false;
        if (year % 4 == 0){
            if (year % 100 == 0)
            {
               if (year % 400 == 0)
               
                   isLeap = true;
               else
                   isLeap = false;
            }
            else isLeap = true;
        }
        else {
            isLeap = false;
        }
        
        if(isLeap == true){
            System.out.println("This is a leap year");
        }else System.out.println("Not a leap year");
    }
}