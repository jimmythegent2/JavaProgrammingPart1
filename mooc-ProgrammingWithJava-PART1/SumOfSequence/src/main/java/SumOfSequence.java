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
public class SumOfSequence {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int input2 = Integer.valueOf(scanner.nextLine());
        int result = 0;
        for (int i = input; i <= input2; i++){
            
            result += i;
        }
        
        System.out.println(result);
    }
}
