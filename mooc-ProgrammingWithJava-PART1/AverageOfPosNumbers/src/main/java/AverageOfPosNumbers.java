/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcham
 */
import java.util.Scanner;
public class AverageOfPosNumbers {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        
        double avg = 0;
        int count = 0;
        int count1 = 0;
        int sum = 0;
        
        
        while (true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0 && count1 == 1){
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if (number > 0){
                sum += number;
                count += 1;
                avg = (double) sum / count;
                
            }
            
            if (number == 0){
                break;
            }
            
            
        }
        System.out.println(count);
        System.out.println(avg);
    }
    
}
