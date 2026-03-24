import java.util.*;

public class conditions {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter date :");
        int date = sc.nextInt();

        if(date>31){
            System.out.println("Invalid date in month");
        }
        else if (date%7==1){
            System.out.println("monday");    
        }
        else if (date%7==2){
            System.out.println("tuesday");
        }
        else if (date%7==3){
         System.out.println("wednesday");
        }
        else if (date%7==4){
            System.out.println("thursday");
        }
        else if (date%7==5){
            System.out.println("friday");
        }
        else if (date%7==6){
            System.out.println("saturday");
        }
        else if (date%7==0){
            System.out.println("sunday");
 
        }
       
        
        

        

        

    }
}