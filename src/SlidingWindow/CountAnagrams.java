package SlidingWindow;

import java.util.*;
public class CountAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s ="forxxorfxdofr";
       String a ="for";
        countAnagram(s,a.length(),a);
        
    } 
    public static void countAnagram(String s, int k, String ana) {
     int length = s.length(); int anagramCount =0; 
     int i=0,j=0, z=0;
     Map<Character, Integer> hm = new HashMap<>();
     while(z< ana.length()){
       char ch = ana.charAt(z);
       if(hm.containsKey(ch)){
         int val = hm.get(ch) +1 ;
         hm.put(ch,val);
       }
       else{
         hm.put(ch, 1);
       }
       z++;
     }
     
     int count = hm.size();
     
     while(j<length){
       char ch = s.charAt(j);
       if(hm.containsKey(ch)){
         int val = hm.get(ch) - 1 ;
         hm.put(ch,val);
         if(val ==0)
         count--;
       }
       
       if(j-i+1 < k){
         j++;
       }
      
       else if(j-i+1 == k){
         if(count ==0){
           anagramCount++;
         }
         char ith = s.charAt(i);
         if(hm.containsKey(ith)){
           int iVal = hm.get(ith) +1;
           hm.put(ith, iVal);
           if(iVal ==1){
             count++;
           }
         }
         i++;
         j++;
       }
     }
     System.out.println(anagramCount);
    } 
    
}