
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class test {
	static void checkMaSV(int ma) throws NumberFormatException {
		if ((int) Math.log10(ma) != 4) {
			throw new NumberFormatException("Mã SV khác 5 số");
		}
	}

	static void checkMaMonHoc(int ma) throws NumberFormatException {
		if ((int) Math.log10(ma) != 2) {
			throw new NumberFormatException("Mã môn học khác 3 số");
		}
	}

	static boolean sortName(String s1, String s2) {
		String[] c1 = s1.toUpperCase().split(" ");
		String[] c2 = s2.toUpperCase().split(" ");
		if ((int) c1[c1.length - 1].charAt(0) > (int) c2[c2.length - 1].charAt(0))
			return true;
		else {
			if ((int) c1[c1.length - 1].charAt(1) > (int) c2[c2.length - 1].charAt(1))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
		ArrayList<MonHoc> dsMonHoc = new ArrayList<>();
		ArrayList<BangDangKy> dsDangKy = new ArrayList<>();
		BangDangKy dk;
		SinhVien sv;
		MonHoc monhoc;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		// cau b
		while (check) {
			try {
				sv = new SinhVien();
				System.out.println("Nhập mã sinh viên");
				int ms = sc.nextInt();
				checkMaSV(ms);
				sv.setMasinhvien(ms);
				sc.nextLine();
				System.out.println("Nhập họ tên sinh viên");
				sv.setHoten(sc.nextLine());
				System.out.println("Nhập địa chỉ sinh viên");
				sv.setDiachi(sc.nextLine());
				System.out.println("Nhập sdt sinh viên");
				sv.setSdt(sc.nextInt());
				sc.nextLine();
				System.out.println("Sinh viên vừa nhập: ");
				System.out.println(sv);
				dsSinhVien.add(sv);
			} catch (NumberFormatException e1) {
				System.out.println(e1);
				// TODO: handle exception
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhap dữ liệu khong đúng định dạng");
			}
			System.out.println("Bạn muốn nhập tiếp không? (y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		// cau a
		while (check) {
			try {
				monhoc = new MonHoc();
				System.out.println("Nhập mã môn học");
				int mamon = sc.nextInt();
				checkMaMonHoc(mamon);
				monhoc.setMamonhoc(mamon);
				sc.nextLine();
				System.out.println("Nhập loại môn: ");
				monhoc.setLoaimon(sc.nextLine());
				if (!monhoc.getLoaimon().equals("")) {
					System.out.println("Nhập tên môn: ");
					monhoc.setTenmonhoc(sc.nextLine());
					System.out.println("Nhập số tiết");
					monhoc.setSotiet(sc.nextInt());
					sc.nextLine();
					System.out.println("Môn học vừa nhập: ");
					System.out.println(monhoc);
					dsMonHoc.add(monhoc);
				}
			} catch (NumberFormatException e1) {
				// TODO: handle exception
				System.out.println(e1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập sai định dạng kiểu dữ liệu");
			}
			System.out.println("Bạn muốn nhập tiếp không? (y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		// cau c
		int mssvdk;
		int count;
		int mondk;
		boolean checkdk;
		while (check) {
			dk = new BangDangKy();
			System.out.println("Nhập mã số sv muốn đăng ký: ");
			mssvdk = 0;
			mssvdk = sc.nextInt();
			count = 0;
			checkdk = false;
			for (BangDangKy dangky : dsDangKy) {
				if (dangky.getSvdangky().getMasinhvien() == mssvdk) {
					++count;
				}
			}
			if (count <= 7) {
				for (SinhVien sinhvien : dsSinhVien) {
					if (sinhvien.getMasinhvien() == mssvdk) {
						System.out.println("Nhập mã số môn muốn đăng ký: ");
						mondk = 0;
						mondk = sc.nextInt();
						for (MonHoc mon : dsMonHoc) {
							if (mon.getMamonhoc() == mondk) {
								dk.setSvdangky(sinhvien);
								dk.setMondangky(mon);
								dk.setThoigiandangky(Calendar.getInstance().getTime());
								sc.nextLine();
								dsDangKy.add(dk);
								checkdk = true;
							}
						}
					}
				}
			} else
				System.out.println("Sinh viên này đã đăng ký quá số môn quy định");
			if (checkdk == true) {
				System.out.println("Thêm thành công");
				System.out.println(dk);
			} else {
				System.out.println("Thêm thất bại");
				sc.nextLine();
			}
			System.out.println("Bạn muốn nhập tiếp không? (y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		// cau d
		for (int i = 0; i < dsDangKy.size() - 1; i++) {
			for (int j = i + 1; j < dsDangKy.size(); j++) {
				if (sortName(dsDangKy.get(i).getSvdangky().getHoten(), dsDangKy.get(j).getSvdangky().getHoten())) {
					BangDangKy dk1 = dsDangKy.get(i);
					dsDangKy.set(i, dsDangKy.get(j));
					dsDangKy.set(j, dk1);
				}
			}
		}
		for (BangDangKy bangdk : dsDangKy)
			System.out.println(bangdk);
		// cau e
		for (int i = 0; i < dsDangKy.size() - 1; i++) {
			for (int j = i + 1; j < dsDangKy.size(); j++) {
				if (dsDangKy.get(i).getThoigiandangky().compareTo(dsDangKy.get(j).getThoigiandangky()) == 1) {
					BangDangKy dk1 = dsDangKy.get(i);
					dsDangKy.set(i, dsDangKy.get(j));
					dsDangKy.set(j, dk1);
				}
			}
		}
		ArrayList<LopHoc> dsLop = new ArrayList<LopHoc>();
		LopHoc lop;
		for (MonHoc mon : dsMonHoc) {
			lop = new LopHoc();
			lop.setMon(mon);
			dsLop.add(lop);
		}
		ArrayList<SinhVien>dssv;
		for (LopHoc lop1 : dsLop) {
			dssv=new  ArrayList<>();
			for (int i = 0; i < dsDangKy.size(); i++) {
				if(dsDangKy.get(i).getMondangky()==lop1.getMon())
				{
					if(lop1.getDsSV().size()<30)
					{
						dssv.add(dsDangKy.get(i).getSvdangky());
					}
					else
					{
						break;
					}
				}
			}
			lop1.setDsSV(dssv);
		}
		System.out.println("****************************************");
		for(LopHoc lop1: dsLop)
		{
			System.out.println(lop1.getMon());
			System.out.println("Danh sách sinh viên gồm có: ");
			for(SinhVien sv2:lop1.getDsSV())
			{
				System.out.println(sv2);
			}
			System.out.println("-------------------------------------------");
		}
	}

}
