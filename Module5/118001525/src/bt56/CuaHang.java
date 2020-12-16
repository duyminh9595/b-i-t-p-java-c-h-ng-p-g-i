package bt56;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuaHang implements Serializable {
	private List<DanhMuc> ds;

	public CuaHang() {
		ds = new ArrayList<DanhMuc>();
	}

	public void nhapThongTinDanhMucVaSP() {
		DanhMuc dm = new DanhMuc();
		System.out.println("Nhap ten danh muc");
		Scanner sc = new Scanner(System.in);
		dm.setTendanhmuc(sc.nextLine());
		System.out.println("Nhap ma danh muc");
		dm.setMadanhmuc(sc.nextInt());
		boolean check = true;
		while (check) {
			sc.nextLine();
			SanPham sp = new SanPham();
			System.out.println("Nhap ten sp:");
			sp.setTensp(sc.nextLine());
			System.out.println("Nhap ma sp:");
			sp.setMasp(sc.nextInt());
			sc.nextLine();
			System.out.println("Nhap xuat xu");
			sp.setXuatxu(sc.nextLine());
			System.out.println("Nhap gia ca");
			sp.setGiaca(sc.nextDouble());
			System.out.println("Tiep khong?y/n");
			dm.getDsList().add(sp);
			sc.nextLine();
			String s=sc.nextLine();
			if (!s.equalsIgnoreCase("y"))
				break;
		}

		ds.add(dm);

	}
	public void xuatSP(int ma)
	{
		int j=-1;
		for(int i=0;i<ds.size();i++)
		{
			if(ds.get(i).getMadanhmuc()==ma)
			{
				j=i;
				break;
			}
		}
		if(j!=-1)
		{
			for(SanPham data: ds.get(j).getDsList())
			{
				System.out.println(data);
			}
		}
	}
	public void lietKeHangTQ()
	{
		for(DanhMuc dataDM:ds)
		{
			for(SanPham sp :dataDM.getDsList())
			{
				if(sp.getXuatxu().contains("Trung quoc"))
					System.out.println(sp);
			}
		}
	}
	public void xoaSP(int masp)
	{
		for(DanhMuc dataDM:ds)
		{
			for(SanPham sp :dataDM.getDsList())
			{
				if(sp.getMasp()==masp)
				{
					dataDM.getDsList().remove(sp);
				}
			}
		}
	}
	public double thongKe()
	{
		double s=0;
		for(DanhMuc dataDM:ds)
		{
			for(SanPham sp :dataDM.getDsList())
			{
				s+=sp.getGiaca();
			}
		}
		return s;
	}
}
