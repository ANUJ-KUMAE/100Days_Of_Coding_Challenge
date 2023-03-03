import java.util.Scanner;
class Harmonic
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=1;
		double sum=0.0f;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
			System.out.println("the value of harmonic sreies"+sum);
		}
		System.out.println("the output sreies"+sum);
	}
}