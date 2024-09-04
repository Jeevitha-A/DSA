package DSAclass;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		int temp=num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		int sum =0;
			while(num>0)
			{
				int digit =num%10;
				sum = (int) (sum + Math.pow(digit,count));
				num=num/10;
			}
		if(sum==temp)
		{
			System.out.println("It is Armstrong");
		}
		else
		{
			System.out.println("It is not Armstrong");
		}
	}
}
