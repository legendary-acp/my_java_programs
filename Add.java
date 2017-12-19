import java.util.Scanner;
public class Add
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number:");
		a= in.nextInt();
		System.out.println("Enter Second Number:");
		b= in.nextInt();
		c=a+b;
		System.out.printf("Their sum is %d",c);
	}
}
