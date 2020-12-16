package module2;

import java.util.Random;
import java.util.Scanner;

public class bt29 {
	public void execute()
	{
		Random rd = new Random();
		int k;
		int input;

		int diem=5;
		Scanner sc =new Scanner(System.in);
		while(diem>0 && diem<10)
		{
			k=rd.nextInt(5);
			System.out.println("Moi ng choi doan: ");
			input=sc.nextInt();
			if(input==k)
			{
				System.out.println("Dung roi. So do la "+k);
				++diem;
				
			}
			else
			{
				System.out.println("Sai roi. So do la: "+k);
				--diem;
			}
			System.out.println(diem);
		}
	}
}
