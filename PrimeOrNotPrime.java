package DSAclass;
import java.util.Scanner;
public class prime_notprime {
	public static void main(String[] args) {
		int num , count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number: ");
		num = scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");	
		}
		else
		{
			System.out.println("notprime");
		}
	}
}
