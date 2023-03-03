import java.util.Scanner;
class Fabinico
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0,n,i;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("the sun of fabinico series"+c);
		}
		System.out.println("the total sum of fabinaico sreies="+c);
	}
}