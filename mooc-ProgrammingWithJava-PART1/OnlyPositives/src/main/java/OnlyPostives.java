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
import java.lang.Math;

public class OnlyPostives {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        while (true){
            System.out.println("Give a number: ");
            int input = reader.nextInt();
                if (input > 0){
                
                System.out.println(input * input);
                continue;
                }
                if (input < 0){
                    System.out.println("Unsuitable number");
                    continue;
                }
                if (input == 0){
                    break;
                }
        }
        
        
        
    }
    
}
