
public class SinhVien {
	private int masinhvien;
	private String hoten;
	private String diachi;
	private int sdt;
	public SinhVien()
	{
		masinhvien=sdt=0;
		hoten=diachi="";
	}
	public int getMasinhvien() {
		return masinhvien;
	}
	public void setMasinhvien(int masinhvien) {
		this.masinhvien = masinhvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mã: "+masinhvien+" ,tên: "+hoten+" ,địa chỉ: "+diachi+" ,số điện thoại: "+sdt;
	}
}
