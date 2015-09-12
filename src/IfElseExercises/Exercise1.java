
package IfElseExercises;

import java.util.Scanner;


public class Exercise1 {
    
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your Age: ");
        
        int age = scan.nextInt();
        
        if(age >= 18){
            System.out.println("You are eligable!");
        } else {
            System.out.println("You are not eligable!");
        }
    }
}
