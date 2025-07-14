import java.util.*;
public class samestring {
    public static void compare(String s1, String s2){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }
            else{
                System.out.println("Not Same !");
                break;
            }
        }
        System.out.println("Same !");
    }
    public static boolean inbuilt(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = "Mridul";
        String s2 = "Mridul";
        compare(s1,s2);
        // The above method was using my own built function and iteration, now using in built boolean function
        // Using in built function
        if(inbuilt(s1,s2)){
            System.out.println("Yes match");
        }
        else{
            System.out.println("No");
        }
        System.out.println(s2.equals(s1));// s1.equals(s2) returns a b00lean value , true or false
    }
}