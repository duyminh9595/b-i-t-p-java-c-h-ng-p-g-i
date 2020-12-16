package module1;

import java.util.Scanner;

public class Exe_6 {
	public void print()
	{
		int n;
		System.out.println("Nhap so luong : ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu thu "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Gia tri lon nhat la "+max+" ,gia tri nho nhat la "+min);
	}
}
