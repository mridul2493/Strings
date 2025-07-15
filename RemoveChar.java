import java.util.*;
public class RemoveChar {
    public static void deletecharcustom(StringBuilder s, int pos){
        if(pos<0 || pos>=s.length()){
            System.out.println("Not Possible");
        }
        for(int i=0;i<s.length()-1;i++){
            s.setCharAt(i,s.charAt(i+1));
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder("Ramesh");
        int pos = 4;
        deletecharcustom(s,pos);// custom built
        // In built
        System.out.println(s.deleteCharAt(1));
    }
}