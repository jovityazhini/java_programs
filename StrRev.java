import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        
        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        
        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    
    }
}



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        
        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        
        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    
    }
}



