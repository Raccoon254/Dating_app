
package dating_app;
import java.util.Scanner;

public class continue1 {
    int choice_b;
    public static void continue1(){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Choose Choose the gender of the person you wish to be hooked up with?\n1|Male\n 2|Female");
        int choice_b=sc.nextInt();
        switch(choice_b){
            case 1:{
                female female=new female();
                female.female();  
                break;
                
            }
            case 2:{
                male raccoon=new male();
                male.male();
                break;
    
            }
    
    }
}
}
