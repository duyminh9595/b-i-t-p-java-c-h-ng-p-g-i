package bt38;

public class SinhVien {
	private int masv;
	private String hoten;
	private double diemLT;
	private double diemTH;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	public double diemTB()
	{
		return (diemLT+diemTH)/2;
	}
	public void xuat()
	{
		System.out.println("Ho ten "+hoten);
		System.out.println("MSSV "+masv);
		System.out.println("Diem Ly Thuyet "+diemLT);
		System.out.println("Diem Thuc Hanh "+diemTH);
		if(diemTB()>=5)
			System.out.println("Dau");
		else
			System.out.println("Rot");
	}
}
