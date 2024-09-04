package DSAclass;

import java.util.Scanner;
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		num = scanner.nextInt();
		while(num!=0) {
		int digit = num%10;
		System.out.print(digit);
		num = num / 10;

	}
	}

}
