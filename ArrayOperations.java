import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayOperations(arr, n);
}

public static void ArrayOperations(int[] arr,int n){
    int sum=0;
    int max=arr[0];
    for(int i =0;i <arr.length;i++){
        sum=sum+arr[i];
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int avg =0;
    avg=sum/n;
    System.out.println(sum+" "+avg+" "+max);
}
}
[Day 4] Understanding 2D Array and problems
