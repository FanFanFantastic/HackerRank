
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        int shortest = (m<n)? m:n;
        
        //Set<String> magazineSet = new HashMap<String>(Arrays.asList(magazine));
        List<String> magazineSet = new ArrayList(Arrays.asList(magazine));
        int count =0;
        for(int i =0;i<shortest;i++)
        {
            if(magazineSet.remove(ransom[i]))
            {
                count++;
            }
        }
        
        if(count == ransom.length)
        {
            System.out.println("Yes");    
        }
        else
        {
            System.out.println("No");    
 
        }
        
    }
}


