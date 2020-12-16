package module2;

import java.util.Scanner;

public class bt26 {
	int Fibonacci(int k)
	{
		if(k==3)
			return 2;
		if(k==1)
			return 1;
		if(k==2)
			return 1;
		return Fibonacci(k-1)+Fibonacci(k-2);
	}
	public void execute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		int n=sc.nextInt();
		System.out.println("Nhap so k(k<n): ");
		int k=sc.nextInt();
		int[]arrFibo=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			arrFibo[i]=Fibonacci(i);
		}
		for(int i=1;i<=n;i++)
			System.out.print(arrFibo[i]+"   ");
		System.out.println();
		System.out.println("So fibo tai vi tri "+k+" la: "+Fibonacci(k));
	}
}
