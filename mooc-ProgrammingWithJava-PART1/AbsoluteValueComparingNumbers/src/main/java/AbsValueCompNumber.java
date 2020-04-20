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
public class AbsValueCompNumber {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Input an integer: ");
        int number1 = reader.nextInt();
        
        System.out.println("Input another integer: ");
        
        int number2 = reader.nextInt();
        
        if (number1 > number2){
            System.out.println(number1 + " is greather than " + number2);
        }else if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        }else{
            System.out.println(number1 +" is equal to " + number2 );
           
        }
       
    }
}
