package module2;

import java.util.Scanner;

public class bt16 {
	public void  execute()
	{
		String s="";
		System.out.println("Nhap chuoi: ");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		int n;
		System.out.println("Nhap n: ");
		n=sc.nextInt();
		if(n<2)
			System.out.println(s);
		else
		{
			String outPut=s;
			for(int i=2;i<=n;i++)
				outPut+=s;
			System.out.println(outPut);
		}
	}
}
