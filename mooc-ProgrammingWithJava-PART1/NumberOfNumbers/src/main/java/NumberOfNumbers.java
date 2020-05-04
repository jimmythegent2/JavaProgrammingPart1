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
public class NumberOfNumbers {
    
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (true){
            System.out.println("Give a number (end with 0)");
            int number = Integer.valueOf(scanner.nextLine());
            
            
            
            if (number == 0){
                break;
            }
            
            count = count + 1;
            
            
        }
            System.out.println("Number of numbers : " + count);
    }
    
}
