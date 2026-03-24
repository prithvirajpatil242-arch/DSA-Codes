import java.util.*;

public class numConversion{
    
    
    public static void binaryToDecimal(int binNum){
        int pow =0;
        int decNum = 0;

        while(binNum > 0){
        int lastdigit = binNum%10;

        decNum = decNum +(lastdigit * (int)Math.pow(2,pow));

        pow++;
        binNum = binNum / 10 ;
        }
        System.out.println(decNum) ;
    }
    

    public static void decToBin(int DecNum){
        int pow = 0;
        int binNum = 0 ;

        while(DecNum > 0){

            int reminder = DecNum % 2;

            binNum = binNum + (reminder *(int)Math.pow(10,pow));

            pow++;
            DecNum=DecNum/2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        int DecNum = sc.nextInt();
        
        decToBin(DecNum);
        binaryToDecimal(binNum);
    }    
}      

       