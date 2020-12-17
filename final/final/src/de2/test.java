package de2;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	static int sohieu = 10004;

	static void checkMaPhong(int ma) throws NumberFormatException {
		if ((int) Math.log10(ma) != 5)
			throw new NumberFormatException("Khong phải số có 5 chữ số");
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
		ArrayList<MayTinh> lstMT = new ArrayList<>();
		//
		MayTinh mt = new MayTinh();
		mt.setSohieu(10000);
		mt.setCauhinh("A");
		mt.setNamnhap(2020);
		mt.setTen("Asus");
		mt.setTenxuatxu("Nhập khẩu");
		lstMT.add(mt);

		mt = new MayTinh();
		mt.setSohieu(10001);
		mt.setCauhinh("B");
		mt.setNamnhap(2019);
		mt.setTen("HP");
		mt.setTenxuatxu("Nội địa");
		lstMT.add(mt);

		mt = new MayTinh();
		mt.setSohieu(10002);
		mt.setCauhinh("Acer");
		mt.setNamnhap(20180);
		mt.setTenxuatxu("Liên doanh");
		lstMT.add(mt);

		mt = new MayTinh();
		mt.setSohieu(10003);
		mt.setCauhinh("MSI");
		mt.setNamnhap(2016);
		mt.setTen("Asus");
		mt.setTenxuatxu("Nhập khẩu");
		lstMT.add(mt);

		mt = new MayTinh();
		mt.setSohieu(10004);
		mt.setCauhinh("E");
		mt.setNamnhap(2017);
		mt.setTen("Dell");
		mt.setTenxuatxu("Nhập khẩu");
		lstMT.add(mt);

		// phong thuc hanh
		ArrayList<PhongThucHanh> dsPTH = new ArrayList<>();
		PhongThucHanh phong1 = new PhongThucHanh();
		phong1.setMaphong(12345);
		phong1.setTenphong("Phòng 12345");
		phong1.setSomay(10);
		dsPTH.add(phong1);

		PhongThucHanh phong2 = new PhongThucHanh();
		phong2.setMaphong(23456);
		phong2.setTenphong("Phòng 23456");
		phong2.setSomay(15);
		dsPTH.add(phong2);

		boolean checkLoop = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------");
		while (checkLoop) {
			try {
				mt = new MayTinh();
				mt.setSohieu(++sohieu);
				System.out.println("Nhập tên xuất xứ (Nhập khẩu,Nội địa,Liên doanh): ");
				mt.setTenxuatxu(sc.nextLine());
				if (!mt.getTenxuatxu().equals("")) {
					System.out.println("Nhập năm nhập: ");
					mt.setNamnhap(sc.nextInt());
					sc.nextLine();
					System.out.println("Nhập cấu hình máy: ");
					mt.setCauhinh(sc.nextLine());
					lstMT.add(mt);
				} else
					System.out.println("Xuất xứ không đúng định dạng");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập dữ liệu khong đúng định dạng");
				sc.nextLine();
			}
			System.out.println("Bạn có muốn tiếp tục không(y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		System.out.println("Danh sách loại máy tính co trong hệ thống");
		for (MayTinh mt1 : lstMT)
			System.out.println(mt1);
		int maphongthuchanh;
		PhongThucHanh pth;

		System.out.println("----------------------------------------");
		while (checkLoop) {
			try {
				pth = new PhongThucHanh();
				System.out.println("Nhập mã phòng thực hành(5 chữ số)");
				maphongthuchanh = sc.nextInt();
				sc.nextLine();
				checkMaPhong(maphongthuchanh);
				pth.setMaphong(maphongthuchanh);
				System.out.println("Nhập tên phòng thực hành");
				pth.setTenphong(sc.nextLine());
				System.out.println("Nhập số máy phòng thực hành");
				pth.setSomay(sc.nextInt());
				sc.nextLine();
				dsPTH.add(pth);

			} catch (NumberFormatException e1) {
				// TODO: handle exception
				System.out.println(e1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập dữ liệu không đúng định dạng");
				sc.nextLine();
			}
			System.out.println("Bạn có muốn tiếp tục không(y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		System.out.println("Danh sách phòng thực hành có trong hệ thống");
		for (PhongThucHanh data : dsPTH)
			System.out.println(data);
		System.out.println("----------------------------------------");
		// phan amy tinh
		ArrayList<DanhSachMayTinh> phanmt = new ArrayList<>();
		DanhSachMayTinh pmt;
		int count = 0;
		int mp;
		int mm;
		int slln;
		int soluongthem;
		boolean checkTrung = false;
		while (checkLoop) {
			try {
				pmt = new DanhSachMayTinh();
				count = 0;
				soluongthem = 0;
				slln = 0;
				checkTrung = false;
				System.out.println("Nhập mã phòng muốn phân máy: ");
				mp = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập mã máy tính muốn phân: ");
				mm = sc.nextInt();
				sc.nextLine();
				for (DanhSachMayTinh danhSachMayTinh : phanmt) {
					if (danhSachMayTinh.getPhong().getMaphong() == mp) {
						if (danhSachMayTinh.getMay().getSohieu() == mm) {
							checkTrung = true;
							break;
						} else
							count += danhSachMayTinh.getSl();
					}
				}
				if (checkTrung == true) {
					System.out.println("Mã máy tính này đã được phân cho máy");
				} else {
					for (PhongThucHanh data : dsPTH) {
						if (data.getMaphong() == mp) {
							slln = data.getSomay();
							break;
						}
					}
					if (count < slln) {
						for (MayTinh data : lstMT) {
							if (data.getSohieu() == mm) {
								System.out.println("Nhập số lượng muốn thếm: ");
								soluongthem = sc.nextInt();
								sc.nextLine();
								if (soluongthem > (slln - count)) {
									System.out.println("Không thể phân. Vượt quá sl máy cần của phòng");
								} else {
									for (PhongThucHanh dataphong : dsPTH) {
										if (dataphong.getMaphong() == mp) {
											pmt.setPhong(dataphong);
											pmt.setMay(data);
											pmt.setSl(soluongthem);
											System.out.println("Tình trạng: ");
											pmt.setTinhtranng(sc.nextLine());
											phanmt.add(pmt);
											System.out.println("Thêm thành công");
											break;
										}
									}
								}

							}
						}
					} else
						System.out.println("Phòng đã đủ số máy");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Dữ liệu nhập không đúng định dạng");
				sc.nextLine();
			}
			System.out.println("Bạn có muốn tiếp tục không(y/n)");
			if (!sc.nextLine().equals("y"))
				break;
		}
		for (DanhSachMayTinh data : phanmt)
			System.out.println(data);

		//
		System.out.println("Theo ten phòng");
		for (int i = 0; i < phanmt.size() - 1; i++) {
			for (int j = i + 1; j < phanmt.size(); j++) {
				if (sortName(phanmt.get(i).getPhong().getTenphong(), phanmt.get(j).getPhong().getTenphong())) {
					DanhSachMayTinh temp = phanmt.get(i);
					phanmt.set(i, phanmt.get(j));
					phanmt.set(j, temp);
				}
			}
		}
		for (DanhSachMayTinh data : phanmt)
			System.out.println(data);
		System.out.println("Theo số lượng");
		for (int i = 0; i < phanmt.size() - 1; i++) {
			for (int j = i + 1; j < phanmt.size(); j++) {
				if (phanmt.get(i).getSl() < phanmt.get(j).getSl()) {
					DanhSachMayTinh temp = phanmt.get(i);
					phanmt.set(i, phanmt.get(j));
					phanmt.set(j, temp);
				}
			}
		}
		for (DanhSachMayTinh data : phanmt)
			System.out.println(data);
		// tim kiem
		String s = "";
		while (checkLoop) {
			System.out.println("Nhập tên thiết bị");
			s = sc.nextLine();
			System.out.println("Danh sách máy tìm thấy");
			for (DanhSachMayTinh data : phanmt) {
				if (data.getMay().getTen().toUpperCase().equals(s.toUpperCase())) {
					System.out.println("*******************");
					System.out.println(data);
					System.out.println("*******************");
				}
			}
			System.out.println("Bạn có muốn tiếp tục không(y/n)");
			if (!sc.nextLine().equals("y"))
				break;
			s = "";
			System.out.println("--------------------------");
		}
	}

}
