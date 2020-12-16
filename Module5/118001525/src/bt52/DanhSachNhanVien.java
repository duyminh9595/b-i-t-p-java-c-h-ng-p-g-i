package bt52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhanVien {
	ArrayList<NhanVien> ds;
	Scanner sc;

	public DanhSachNhanVien() {
		ds = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public void them1NV() {
		NhanVien nv = new NhanVien();
		System.out.println("Nhap ma:");
		nv.setMaNV(sc.nextLine());
		System.out.println("Nhap so sp");
		nv.setSoSP(sc.nextInt());
		ds.add(nv);
		sc.nextLine();
	}

	public int tongSoNV() {
		return ds.size();
	}

	public void thongTinAllNV() {
		ds.get(0).XuatTieuDe();
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
	}

	public void thongTinNVVuotChuan() {
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).coVuotChuan() == true)
				System.out.println(ds.get(i));
		}
	}

	public int tongSoNVKhongVuotChuan() {
		int count = 0;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).coVuotChuan() == false)
				++count;
		}
		return count;
	}

	public void nvCaoNhatThapNhat() {
		NhanVien nvcao = ds.get(0);
		NhanVien nvthap = ds.get(0);
		for (int i = 1; i < ds.size(); i++) {
			if (ds.get(i).getLuong() > nvcao.getLuong())
				nvcao = ds.get(i);
			if (ds.get(i).getSoSP() < nvthap.getSoSP())
				nvthap = ds.get(i);
		}
		System.out.println("Nhan vien luong cao nhat: " + nvcao);
		System.out.println("Nhan vien co so sp thap nhat: " + nvthap);
	}

	public void nvKhongVuotChuanCoLuongCaoNhat() {
		NhanVien nv;
		int j = 0;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).coVuotChuan() == false) {
				j = i;
				break;
			}
		}
		nv = ds.get(j);
		for (int i = j + 1; i < ds.size(); i++) {
			if (ds.get(i).coVuotChuan() == false) {
				if (ds.get(i).getLuong() > nv.getLuong())
					nv = ds.get(i);
			}
		}
		System.out.println("Nhan vien khong vuot chuan co luong cao nhat: " + nv);
	}

	public void timKiemNVTheoMaNhapVao(String ma) {
		int j = -1;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getMaNV().equals(ma)) {
				j = i;
				break;
			}
		}
		if (j != -1)
			System.out.println(ds.get(j));
		else
			System.out.println("Khong tim thay");
	}

	public void sapXepTangDanTheoMaSo() {
		Collections.sort(ds);
	}

	public void xuatNV() {
		for (NhanVien data : ds)
			System.out.println(data);
	}

	public void xoaNV(int n) {
		if (n >= 0 && n < ds.size())
			ds.remove(n);
	}
}
