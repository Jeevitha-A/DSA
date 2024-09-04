import java.util.*;

class Solution{
    public void duplicates(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("true");
                return;
            }
        }
    }
    System.out.println("false");
    }
}
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
         Solution Obj = new Solution();
         Obj.duplicates(arr);
         sc.close();
    
    }
    
}
