import java.util.*;
public class string1 {
    public static int length(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new  Scanner(System.in);
        /*
        In Java, Strings are immutable, which means once a String object is created, its content cannot be
        changed. Any operation that seems to modify a string actually returns a new String object.
        Immutable: After creation, the object's internal state can't be altered.
        Calling methods like concat(), replace(), or toUpperCase() create new strings without affecting the original.
        In Python, Java and JavaScript, strings characters are stored at contiguous locations (like arrays).
         */
        // Declaring a string
        String s = "This is Me";
        System.out.println(s);
        // Declaring string using new operator
        String s1 = new String("hello guys this is me");
        System.out.println(s1);
        // Taking string input from user
        /*
        If we use sc.next(); then in that case the string will only store a word or phrase without a spacebar
        as soon as it encounters a space then it will not store after that spacebar
        But in case of sc.nextLine(); the string will store the entire sentence no matter how many spaces are there
        it will just store the entire thing.
         */
        /*String s3 = sc.next();
        String s2 = sc.nextLine();
        System.out.println(s2);
        System.out.println(s3);*/
        // Length of a string
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(length(s));// length using iteration
        // List of methods in strings
        /*
        .charAt()
        .length()
        .toCharArray()
        .equals()

         */
    }
}