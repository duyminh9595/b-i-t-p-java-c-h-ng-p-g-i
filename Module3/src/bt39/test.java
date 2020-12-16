package bt39;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<NhanVien>lstNV= new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<=1;i++)
		{
			NhanVien nv =new NhanVien();
			System.out.println("Nhap ma");
			nv.setMaNV(sc.nextInt());
			sc.nextLine();
			System.out.println("Nhap ten");
			nv.setHoTen(sc.nextLine());
			System.out.println("Nhap dia chi");
			nv.setDiaChi(sc.nextLine());
			System.out.println("Nhap cbql");
			nv.setCBQL(sc.nextBoolean());
			lstNV.add(nv);
		}
		for(NhanVien nv : lstNV)
		{
			if(nv.isCBQL())
				System.out.println(nv);
		}
	}
}
