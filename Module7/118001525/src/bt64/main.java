package bt64;

import java.util.Scanner;

public class main {
	public static class OutOfRangeException extends Exception
	{
		public OutOfRangeException()
		{
			System.out.println("Gia tri khong nam trong khoang[1,113]");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao n");
		int n=sc.nextInt();
		try {
			if(n<1 || n>113)
				throw new OutOfRangeException();
		} catch (OutOfRangeException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
