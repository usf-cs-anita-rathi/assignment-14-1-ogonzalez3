import java.util.Scanner;


public class HandShake
{
	public static int handshake(int num)
	{
		if (num < 2)
			return num - 1;
		else
			return num - 1 + handshake(num - 1);
	}
	public static void main(String[] args)
	{
		int n;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of hands:");
		n=scn.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println("Person("+i+")="+handshake(i));
	}
}