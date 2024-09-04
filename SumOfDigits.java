package DSAclass;

import java.util.Scanner;

public class sum_of_digit {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num= scanner.nextInt();
	        int sum = 0;
	        while (num != 0) {
	        	int digit = num % 10; 
	            sum =sum + digit;  
	            num = num / 10;         
	        }
	        System.out.println( + sum);
	    }
	}
