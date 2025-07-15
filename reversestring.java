import java.util.*;
public class reversestring {
    public static String reversebt(String s){
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "India";
        // Using backward traversal
        System.out.println(reversebt(s));
    }
}