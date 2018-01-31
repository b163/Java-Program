
import java.util.Scanner;


class Fibonacci {

	public static void main(String args[])
	{int n,i;
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		System.out.println("0\n1");
		int a=0,b=1,c=0;
		for(i=1;i<n-1;i++)
		{ c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println("\n\nDone");
		
	}
}
