
package dating_app;
import java.util.Scanner;
import java.lang.*;


public class Person {
    
    private String first_name;
    private String last_name;
    private int age;
    private int gender;
    private int height;
    private int outlook;
    private int answer;
    
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First name?");
        String first_name=sc.nextLine();
        
        System.out.println("Enter Last name?");
        String last_name=sc.nextLine();
        
        System.out.println("Enter your Age?");
        int age=sc.nextInt();
        
        System.out.println("Choose your height?\n1|Tall 2|Medium 3|Short");
        int height=sc.nextInt();
        
        System.out.println("Choose your gender?\n1|Male\n2|Female");
        int gender=sc.nextInt();
        
        
        System.out.println("*******YOUR PROFILE********");
        System.out.println("NAME  |                 "+first_name  +last_name);
        System.out.println("AGE   |                 "+age);
        if(gender==1){
        System.out.println("GENDER|                 Male");
        }
        if(gender==2){
        System.out.println("HEIGHT|                 Female");
        }
        
        
        if(height==1){
        System.out.println("HEIGHT|                 Tall");
        }
        if(height==2){
        System.out.println("HEIGHT|                 Medium");
        }
        if(height==3){
        System.out.println("HEIGHT|                 Short");
        }
        
        System.out.println("Do you wish to continue\nChoose either 1|Yes   2|No");
        int answer=sc.nextInt();
        switch (answer){
            case 1:{
                continue1 go=new continue1();
                go.continue1();
                break;
            }
            
            case 2:{
                System.out.println("You've successifully exited the app");
                break;

            }
       
        }
   
    }
}

