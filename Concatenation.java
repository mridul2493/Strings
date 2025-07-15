import java.util.*;
public class Concatenation {
    public static String concat(String s1, String s2){
        StringBuilder str = new StringBuilder();
        for(char c : s1.toCharArray()){
            str.append(c);
        }
        for(char c : s2.toCharArray()){
            str.append(c);
        }
        return str.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = "Mridul ";
        String s2 = "Yadav";
        // using + operator
        String res = s1+s2;
        System.out.println(res);
        System.out.println(s1+s2);
        // using custom method
        System.out.println(concat(s1,s2));
    }
}