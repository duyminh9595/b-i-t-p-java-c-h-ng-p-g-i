package module1;

import java.util.Scanner;

public class Exe_5 {
	public void print()
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		if(n%2==0)
		{
			for(int i=2;i<=n;i=i+2)
				s+=i;
		}
		else
		{
			for(int i=1;i<=n;i=i+2)
				s+=i;
		}

		System.out.println("Tong cac so la: "+s);
	}
}
