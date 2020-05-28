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
        
        divisibleByThreeInRange(2,10);
        
        
        
           
       
}
    
    public static void divisibleByThreeInRange(int beginning, double end){
            
          for (int i = beginning; i<=end; i++){
              if (i % 3 == 0){
                  
                  System.out.println(i);
              }
          }  
        
    }
    
}
