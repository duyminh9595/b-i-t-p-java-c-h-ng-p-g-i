package bt52;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Random().nextInt(5)+1;
		DanhSachNhanVien ds=new DanhSachNhanVien();
		for(int i=0;i<=n;i++)
		{
			System.out.println("Nhap nv thu "+(i+1));
			ds.them1NV();
		}
		ds.xuatNV();
		ds.sapXepTangDanTheoMaSo();
		ds.xuatNV();
		System.out.println();
		ds.nvCaoNhatThapNhat();
		ds.nvKhongVuotChuanCoLuongCaoNhat();
	}

}
