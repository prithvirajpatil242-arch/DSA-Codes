import java.util.*;
public class reversePalindrome {

    public static boolean isPalindrome(String str){
        int n=str.length();
        for (int i =0;i<n/2;i++){
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }

        }
        return true;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check weather it is palindrome");

        String str;
        str = sc.next();

        System.err.println(isPalindrome(str));

    }
    
}
