package bt59;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap do dai");
		int n=new Scanner(System.in).nextInt();
		HinhVuong data = new HinhVuong(n);
		data.CV();
		data.DT();
	}

}
