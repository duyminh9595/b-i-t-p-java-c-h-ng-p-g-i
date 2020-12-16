package module2;

import java.util.Scanner;

public class bt15 {
	public void execute()
	{
		String s1="";
		String s2="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chuoi s1:");
		s1=sc.nextLine();
		s2=sc.nextLine();
		s1.toUpperCase();
		s2.toUpperCase();
		if(s1.equals(s2))
			System.out.println("2 chuoi bang nhau");
		else
			System.out.println("2 chuoi khong bang nhau");
	}
}
