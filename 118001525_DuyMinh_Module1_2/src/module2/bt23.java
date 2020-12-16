package module2;

import java.util.Scanner;

public class bt23 {
	public int countA(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A')
				++count;
		}
		return count;
	}
	public void execute()
	{
		String s="";
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		while(check)
		{
			System.out.println("Nhap chuoi: ");
			s=sc.nextLine();
			System.out.println("So lan xuat hien la: "+countA(s));
			s="";
		}
	}
}
