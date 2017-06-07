//This program is an update of the original ransom Algorithm, with a hashmap for better running time complexity in exchange of the space complexity. it runs in big O(n) 
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
        //String magazine[] = new String[m];
        boolean yes = true;
        Map <String,Integer> magazineSet = new HashMap<String,Integer>();

        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String temp = in.next();
            Integer i = magazineSet.get(temp);
            
            if(i!=null)
            {
               magazineSet.put(temp,i+1);
            }
            else
               magazineSet.put(temp,1);
 
        }
        //String ransom[] = new String[n];
        
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String temp = in.next();
            if(magazineSet.get(temp)>0)
            {
                magazineSet.put(temp,magazineSet.get(temp)-1);
            }
            else
            {
                yes = false;
                break;
            }
        }
        
        if(yes==true)
        {
            System.out.println("Yes");    
        }
        else
        {
            System.out.println("No");    

        }
        
        
        
        
        
    }
}

