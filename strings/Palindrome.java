package strings;
import java.util.*;
public class Palindrome {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        String s= sc.next().trim();
        s.toCharArray();
        boolean isPalindrome= true;
        int start=0;
        int end =s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(start) != s.charAt(end)){
                isPalindrome=false;
            }

        }
        System.out.println(isPalindrome);

    }

}
