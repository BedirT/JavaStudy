import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        int i, result = 0;
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        String S2 = "SOS";
        
        int sosCount = (S.length())/3;
        
        for (i = 0; i<sosCount-1; i++){
            S2 = S2.concat("SOS");        
        }
        System.out.println(S2);
        
        for(i=0; i<S.length(); i++){
            if (S.charAt(i) != S2.charAt(i))
                result++;
        }    
        
        System.out.println(result);
            
    }
}

