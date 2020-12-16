package module2;

import java.util.Scanner;

public class bt27 {
	public boolean isPanlyndrome(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
	public void execute()
	{
		Scanner sc= new Scanner(System.in);
		String s="";
		System.out.println("Nhap chuoi s: ");
		s=sc.nextLine();
		if(isPanlyndrome(s))
			System.out.println("La chuoi panlyndrome");
		else
			System.out.println("Khong la chuoi panlyndrome");
	}
}
