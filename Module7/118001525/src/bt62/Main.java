package bt62;

import java.util.Scanner;

public class Main {
	static void checkNL(int n,int m) throws NumberFormatException{
		if(n<0 || m<0)
			throw new NumberFormatException("So am");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String so1=sc.nextLine();
		String so2=sc.nextLine();
		try {
			int a=Integer.parseInt(so1);
			int b=Integer.parseInt(so2);
			try {
				checkNL(a, b);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("So co ky tu");
		}
}
}
