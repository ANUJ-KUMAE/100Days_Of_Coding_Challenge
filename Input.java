
import java.util.Scanner;
class input
{

	public static void main(String arg[])
	{
		Scanner obj =new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = obj.nextInt();
		System.out.println("enter 2nd number");
		int b = obj.nextInt();
		int c = a+b;
		System.out.println("sum of two number ="+c);
	}
}
		