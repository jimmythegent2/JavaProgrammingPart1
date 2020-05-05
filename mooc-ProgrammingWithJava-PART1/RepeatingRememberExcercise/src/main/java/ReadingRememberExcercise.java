/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcham
 */
import java.util.*;
public class ReadingRememberExcercise {
    
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers");
        int numbers = 0;
        int sum = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                System.out.println("Thanks bye!");
                break;
            }
            if (input % 2 == 0){
                even++;
            }else odd ++;
            
            sum += input;
            numbers++;
            avg = (double) sum / numbers;
        }
        System.out.println(sum);
        System.out.println(numbers);
        System.out.println(avg);
        System.out.println(even);
        System.out.println(odd);
        
    }
}
