import java.util.*;
public class Searchingchar {
    public static int searchchar(String s, char item){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==item){
                System.out.println("The index of item "+item+" is = "+i);
                return i;
            }
        }
        System.out.println("Nothing Matched = ");
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "I study Engineering";
        char item = 'y';
        searchchar(s,item);
    }
}