
package dating_app;
import java.util.Scanner;


public class male {

    private int appearance;
    public void setOutlook(int newOutlook){
    this.appearance=newOutlook;
    }
    
    
    public void getFirst_name(int firstname){
    this.getFirst_name(firstname);
    }
    
    private int age_girl;
    public void setAge(int newAge){
    this.age_girl=newAge;
    }
    
    private int h_girl;
    public void setHeight(int newHeight){
    this.h_girl=newHeight;
    }
    private int choice_b;

    
    public static void male(){
        
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Fill in your handsomeness level\nPlease be honest\n\n");
        System.out.println("1:Very Handsome\n2:Handsome\n3:Neutral\n4:Ugly\n5:Very ugly");
        int appearance=sc.nextInt();
        
        System.out.println("Please choose qualities off your desired date");
        
        System.out.println("1:age 15 to 20\n2:age 20 to 25\n3:age 25 to 30 ");
        int age_girl=sc.nextInt();
        
        
        System.out.println("1:Height Tall\n2:Height Medium\n3:Height Short");
        int h_girl=sc.nextInt();
        
        switch(age_girl){
            case 1:{
                switch(h_girl){
                    case 1:{
                        
                        System.out.println("Choose one of the girls below");
                        System.out.println("NB|ALL OF THEM MEET YOUR DESIRED REQUIREMENTS|");
                        
                        System.out.println("1|Lucy\n2|Becky\n3|Winnie\n4|Everlyn\n");
                        
                        System.out.println("Choose one of the names above");
                        int choice_b=sc.nextInt();
                        switch(choice_b){
                            case 1:{
                                girl a=new girl();
                                a.girl();
                                break;
                            }
                            case 2:{
                                girl b=new girl();
                                b.girl_1();
                                break;
                            }
                            case 3:{
                                girl a=new girl();
                                a.girl_2();
                                break;
                            }
                            case 4:{
                                girl d=new girl();
                                d.girl_3();
                                break;
                            }
                            
                        }
                        break;
                    }
                        case 2:{
                        girl a=new girl();
                        a.girl_4();
                        girl b=new girl();
                        a.girl_5();
                        girl c=new girl();
                        a.girl_6();
                        girl d=new girl();
                        a.girl_7();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                        girl a=new girl();
                        a.girl_8();
                        girl b=new girl();
                        a.girl_9();
                        girl c=new girl();
                        a.girl_10();
                        girl d=new girl();
                        a.girl_11();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
            
            case 2:{
                switch(h_girl){
                    case 1:{
                        girl a=new girl();
                        a.girl_12();
                        girl b=new girl();
                        a.girl_13();
                        girl c=new girl();
                        a.girl_14();
                        girl d=new girl();
                        a.girl_15();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 2:{
                        girl a=new girl();
                        a.girl_16();
                        girl b=new girl();
                        a.girl_17();
                        girl c=new girl();
                        a.girl_18();
                        girl d=new girl();
                        a.girl_19();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                        girl a=new girl();
                        a.girl_20();
                        girl b=new girl();
                        a.girl_21();
                        girl c=new girl();
                        a.girl_22();
                        girl d=new girl();
                        a.girl_23();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
            case 3:{
                switch(h_girl){
                    case 1:{
                        girl a=new girl();
                        a.girl_24();
                        girl b=new girl();
                        a.girl_25();
                        girl c=new girl();
                        a.girl_26();
                        girl d=new girl();
                        a.girl_27();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 2:{
                        girl a=new girl();
                        a.girl_28();
                        girl b=new girl();
                        a.girl_29();
                        girl c=new girl();
                        a.girl_30();
                        girl d=new girl();
                        a.girl_31();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                        girl a=new girl();
                        a.girl_32();
                        girl b=new girl();
                        a.girl_33();
                        girl c=new girl();
                        a.girl_34();
                        girl d=new girl();
                        a.girl_35();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
        }
        
    }
}
