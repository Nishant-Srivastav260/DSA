package SlidingWindow;

import java.util.*;
public class MaximumOfSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= {1,3,-1,-3,5,3,6,7};
        List<Integer> l = maxOfSubArrays(a, 3);
        System.out.println(l);
        
    } 
    public static List<Integer> maxOfSubArrays(int[] a, int k) {
      int length = a.length;
      Queue<Integer> q =new LinkedList<>();
      int i=0, j=0;
      List<Integer> ans =new ArrayList<>();
       
      while(j < length){
        
        if(j==0){
          q.add(a[j]);
        }
        else if(j!=0 && a[j] >= q.peek()){
          q.clear();
          q.add(a[j]);
        }
        else if(j!=0 && a[j] < q.peek()){
          q.add(a[j]);
        }
        
        if(j-i+1 < k){
          j++;
        }
        
        else if(j-i+1 == k){
          ans.add(q.peek());
          if(a[i] == q.peek()){
            q.remove();
          }
          i++;
          j++;
        }
        
      }
      return ans;
    }
    
}