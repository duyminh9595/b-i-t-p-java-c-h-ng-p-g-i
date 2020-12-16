package bt61;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0,b=0;
		Scanner sc =new Scanner(System.in);
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			try {
				double d=a/b;
				System.out.println("A/B="+(a*1.0/b));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Khong duoc chia cho 0");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Khong duoc nhap ky tu");
		}
		
	}
}
