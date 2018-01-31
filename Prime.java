

import java.util.Scanner;


class Prime {

	public static void main(String args[])
	{int n,i,c=0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		
		for(i=2;i<=n;i++)
		{  if(n%i==0)
			c++;
		}
		System.out.println(c);

					if(c==1)
					System.out.println("Number Entered is Prime ");
					else
					System.out.println("Number Entered is Not Prime ");
					
						
					
						
		}
		
		
	}

