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
public class Methods {
    public static void main (String args[]){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int numOfTimes = Integer.valueOf(scanner.nextLine());
        
            for (int i = 1; i <= numOfTimes; i++){
                
            printText();
            
        
            
    }
       
}
    
    public static void printText(){
            System.out.println("In a hole in the ground there lived a method");
    }
    
}
