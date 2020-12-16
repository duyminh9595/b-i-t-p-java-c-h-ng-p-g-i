package module2;

import java.util.Arrays;
import java.util.Scanner;

public class bt17 {
	public void execute()
	{
		String s="";
		System.out.println("Nhap chuoi: ");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		String[]arrS=s.split(" ");
		for(int i=0;i<arrS.length;i++)
			System.out.println(arrS[i]);
	}
}
