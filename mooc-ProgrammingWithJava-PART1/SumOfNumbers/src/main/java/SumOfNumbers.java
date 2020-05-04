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
public class SumOfNumbers {
    public static void main (String args []){
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0){
                break;
            }
            count = count + 1;
            sum += number;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
        
    }
}
