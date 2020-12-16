package module2;

import java.util.Scanner;

public class bt14 {
	public void execute()
	{
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
				System.out.println(s.charAt(i));
		}
	}
}
