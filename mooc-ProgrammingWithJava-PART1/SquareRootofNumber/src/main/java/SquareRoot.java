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
public class SquareRoot {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give an integer:");
        
        int number1 = Integer.valueOf(reader.nextLine());
       
        System.out.println("Give another integer:");
        
        int number2 = Integer.valueOf(reader.nextLine());
        
        int sum = number2 + number1;
        
        double result = Math.sqrt(sum);
        
        System.out.println("The square root of the two numbers combined is: " + result);
        
        
    }
    
}
