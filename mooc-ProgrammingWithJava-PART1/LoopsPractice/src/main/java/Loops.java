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
public class Loops {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -4){
                break;
            }
        }
    
    }
}