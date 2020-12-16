package module2;

import java.util.Scanner;

public class bt12 {
	public void execute()
	{
		String s ="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(i));
	}
}
