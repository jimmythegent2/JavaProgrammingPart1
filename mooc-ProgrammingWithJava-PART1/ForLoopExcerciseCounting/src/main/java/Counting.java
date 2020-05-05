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
public class Counting {
    
    public static void main (String args []){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());
        for (int i = input2; i <= input; i++){
            System.out.println(i);
        }
        
        
    }
    
}
