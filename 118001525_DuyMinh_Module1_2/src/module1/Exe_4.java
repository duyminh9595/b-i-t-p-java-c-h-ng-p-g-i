package module1;

import java.util.Scanner;

public class Exe_4 {
	public void print()
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
			s+=i;
		System.out.println("Tong tu 1 den n la: "+s);
	}
}
