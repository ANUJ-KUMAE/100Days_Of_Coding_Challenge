import java.util.Scanner;
class Age
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
	}
}
		
  