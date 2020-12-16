package module2;

import java.util.Scanner;

public class bt25 {
	public void multiConcat(String s,int n)
	{
		if(n<2)
			System.out.println(s);
		else
		{
			String output="";
			for(int i=1;i<=n;i++)
				output+=s;
		}
	}
	public void execute()
	{
		Scanner sc= new Scanner(System.in);
		String s="";
		int n;
		boolean check=true;
		while(check)
		{
			System.out.println("Nhap so lan: ");
			n=sc.nextInt();
			System.out.println("Nhap chuoi: ");
			s=sc.nextLine();
			multiConcat(s, n);
			s="";
		}
	}
}
