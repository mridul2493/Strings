import java.util.*;
public class InsertChar {
    public static String insertchar(String s, char c, int pos){ // Custom built method
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==pos){
                res.append(c);
            }
            res.append(s.charAt(i));
        }
        if(pos>=s.length()){
            res.append(c);
        }
        return res.toString();
    }
    public static String insertcharinbuilt(StringBuilder sb, char c, int pos){
        sb.insert(pos,c);
        return sb.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "Mridul";
        char c = 'B';
        int pos = 2;
        System.out.println(insertchar(s,c,pos));
        // The above was using custome built methid , now we will try using in built method
        // In built  methods
        StringBuilder sb = new StringBuilder("Yadav");
        System.out.println(insertcharinbuilt(sb,c,pos));// But in case of in built methods may result in index
        // out of bounds exception
    }
}