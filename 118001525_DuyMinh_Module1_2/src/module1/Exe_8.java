package module1;

import java.util.Scanner;

public class Exe_8 {
	public void execute()
	{
		System.out.println("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==0)
			System.out.println("So do la zero");
		else
		{
			if(a%2==0)
				System.out.println("So do la so chan");
			else
				System.out.println("So do la so len");
		}
	}
}
