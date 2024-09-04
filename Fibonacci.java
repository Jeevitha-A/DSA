package DSAclass;

import java.util.Scanner;
public class fibonacci {
	static int fibonacci(int num)
	{
		if (num==0)
		{
			return 0;
		}
		else if (num==1)
		{
			return 1;
		}
		else
		{
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner (System.in);
		System.out.print("enter the number:");
		num=scanner.nextInt();
		for(int i=0;i<=num;i++) {
			System.out.println(fibonacci(i));
		}
	}
}
