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
public class Factorial {
    public static void main (String args []){
        long fact = 1;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= input; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    
}
