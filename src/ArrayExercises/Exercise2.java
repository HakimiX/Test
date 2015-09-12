
package ArrayExercises;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise2 {
   
    public static void main(String[] args) {
        
     
        ArrayList liste = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Do you want to add to list? (y/n)");
            
            if(scan.next().startsWith("y")){
                System.out.print("Enter nr: ");
                liste.add(scan.nextInt());
            } else {
                break;
            }
        } 
        while(true);
        
        System.out.println("The List contains : " + liste);
        System.out.println("");
        arrayMethod();
    }
    
    public static void arrayMethod(){
        
        String[] person = new String[4];
        
        person[0] = "Hans (m)";
        person[1] = "Emma (f)";
        person[2] = "Johnny (m)";
        person[3] = "Bums (f)";
        
        int male = 0;
        int female = 0;
        
        for(int i = 0; i < person.length; i++){
            
            if(person[i].contains("(m)")){
                male++;
            } else if(person[i].contains("(f)")){
                female++;
            }
        }
        System.out.println("Male: " + male
        + "\nFemale: " + female);
    }
    
}
