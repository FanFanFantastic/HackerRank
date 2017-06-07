

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        
          
      //Set<Character> longset = new HashMap();
      if(first.length()==0||second.length()==0) 
          return 0;
        
      String longest = (first.length()>second.length())? first:second;
      String shortest = (first.length()>second.length())? second:first;  
        
      char [] strLong = longest.toCharArray();  
      char [] strShort = shortest.toCharArray();   
        
      StringBuilder sb = new StringBuilder(longest);
      
      int same =0;
        
      for(int j=0;j<strShort.length;j++)
      {
          if(sb.toString().indexOf(strShort[j]) >=0 )
          {
             same++;
             sb.deleteCharAt(sb.toString().indexOf(strShort[j]));
          }
          
      }
      
      //System.out.println(same);
      
      return  (longest.length()-same)+(shortest.length()-same);
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

