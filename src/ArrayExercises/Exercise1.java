
package ArrayExercises;


public class Exercise1 {
    
    public static void main(String[] args) {
        
        
        String[] person = new String[6];
        
        person[0] = "Ronaldo (m)";
        person[1] = "Rihanna (f)";
        person[2] = "Obama (m)";
        person[3] = "Obama (m)";
        person[4] = "Obama (m)";
        person[5] = "Obama (m)";
        
        
        int male = 0;
        int female= 0;
        
        for(int i = 0; i < person.length; i++){
            
            if(person[i].contains("(m)")){
                male++;
            } else if(person[i].contains("(f)")){
                female++;
            }
        }
        System.out.println("Male : " + male + " and Female : " + female);
    }
}
