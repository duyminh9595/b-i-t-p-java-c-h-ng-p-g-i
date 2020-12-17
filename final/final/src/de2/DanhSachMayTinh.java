package de2;

public class DanhSachMayTinh {
	private MayTinh may;
	private int sl;
	private String tinhtranng;
	private PhongThucHanh phong;
	public MayTinh getMay() {
		return may;
	}
	public void setMay(MayTinh may) {
		this.may = may;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getTinhtranng() {
		return tinhtranng;
	}
	public void setTinhtranng(String tinhtranng) {
		this.tinhtranng = tinhtranng;
	}
	
	public PhongThucHanh getPhong() {
		return phong;
	}
	public void setPhong(PhongThucHanh phong) {
		this.phong = phong;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phòng thực hành: "+phong+"\n"+may+". Số lượng: "+sl+". Tình trạng: "+tinhtranng;
	}
}
