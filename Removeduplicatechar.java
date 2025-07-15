import java.util.*;
public class Removeduplicatechar {
    public static String removecustom(String s, char c){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==c){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "MEET ELIZABETH";
        char c = 'E';
        System.out.println(removecustom(s,c));
    }
}