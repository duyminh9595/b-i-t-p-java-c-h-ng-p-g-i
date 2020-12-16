package module2;

import java.util.Scanner;

public class bt13 {
	public void execute()
	{
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isSpace(s.charAt(i)))
				++count;
		}
		System.out.println("So khoang trang trong chuoi la: "+count);
	}
}
