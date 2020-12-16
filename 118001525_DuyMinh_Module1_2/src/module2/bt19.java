package module2;

import java.util.Scanner;

public class bt19 {
	public boolean checkNum(int n)
	{
		return n%2==0;
	}
	public void execute()
	{
		boolean check=true;
		Scanner sc=new Scanner(System.in);
		int n;
		while(check)
		{
			System.out.println("Nhap n: ");
			n=sc.nextInt();
			if(checkNum(n))
				System.out.println(n+" la so chan");
			else
				System.out.println(n+" la so le");
		}
	}
}
