
package dating_app;

import java.util.Scanner;

public class female {
    
    int appearance;
    public void setOutlook(int newOutlook){
    this.appearance=newOutlook;
    }
    
    
    public void getFirst_name(int firstname){
    this.getFirst_name(firstname);
    }
    
    int age_b;
    public void setAge(int newAge){
    this.age_b=newAge;
    }
    
    int h_b;
    public void setHeight(int newHeight){
    this.h_b=newHeight;
    }

    public static void female(){
   
        
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Fill in your Beauty level\nPlease be honest\n\n");
        System.out.println("1:Very Beautiful\n2:Beautiful\n3:Neutral\n4:Ugly\n5:Very ugly");
        int appearance=sc.nextInt();
        
        System.out.println("Please choose qualities off your desired date");
        
        System.out.println("1:age 15 to 20\n2:age 20 to 25\n3:age 25 to 30 ");
        int age_b=sc.nextInt();
        
        
        System.out.println("1:Height Tall\n2:Height Medium\n3:Height Short");
        int h_girl=sc.nextInt();
        
        switch(age_b){
            case 1:{
                switch(h_girl){
                    case 1:{
                        boy a=new boy();
                        a.b();
                        boy b=new boy();
                        a.b_1();
                        boy c=new boy();
                        a.b_2();
                        boy d=new boy();
                        a.b_3();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 2:{
                       boy a=new boy();
                        a.b_4();
                        boy b=new boy();
                        a.b_5();
                        boy c=new boy();
                        a.b_6();
                        boy d=new boy();
                        a.b_7();
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                        boy a=new boy();
                        a.b_8();
                        boy b=new boy();
                        a.b_9();
                        boy c=new boy();
                        a.b_10();
                        boy d=new boy();
                        a.b_11();
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
            
            case 2:{
                switch(h_girl){
                    case 1:{
                        boy a=new boy();
                        a.b_12();
                        boy b=new boy();
                        a.b_13();
                        boy c=new boy();
                        a.b_14();
                        boy d=new boy();
                        a.b_15();
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 2:{
                        boy a=new boy();
                        a.b_16();
                        boy b=new boy();
                        a.b_17();
                        boy c=new boy();
                        a.b_18();
                        boy d=new boy();
                        a.b_19();
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                        boy a=new boy();
                        a.b_20();
                        boy b=new boy();
                        a.b_21();
                        boy c=new boy();
                        a.b_22();
                        boy d=new boy();
                        a.b_23();
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
            case 3:{
                switch(h_girl){
                    case 1:{
                       boy a=new boy();
                        a.b_24();
                        boy b=new boy();
                        a.b_25();
                        boy c=new boy();
                        a.b_26();
                        boy d=new boy();
                        a.b_27();
                        
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 2:{
                       boy a=new boy();
                        a.b_28();
                        boy b=new boy();
                        a.b_29();
                        boy c=new boy();
                        a.b_30();
                        boy d=new boy();
                        a.b_31();
                        
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                        case 3:{
                       boy a=new boy();
                        a.b_32();
                        boy b=new boy();
                        a.b_33();
                        boy c=new boy();
                        a.b_34();
                        boy d=new boy();
                        a.b_35();
                        
                        
                        
                        
                        System.out.println("Who do you prefer");
                        break;
                    }
                }
            break;
            }
        }
        
    }
}
