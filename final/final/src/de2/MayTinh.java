package de2;

public class MayTinh {
	private int sohieu;
	private String tenxuatxu;
	private int namnhap;
	private String cauhinh;
	private String ten;
	public MayTinh()
	{
		sohieu=namnhap=0;
		tenxuatxu=cauhinh="";
	}
	public int getSohieu() {
		return sohieu;
	}
	public void setSohieu(int sohieu) {
		this.sohieu = sohieu;
	}
	public String getTenxuatxu() {
		return tenxuatxu;
	}
	public void setTenxuatxu(String tenxuatxu) {
		if(tenxuatxu.equals("Nhập khẩu"))
		{
			this.tenxuatxu = "Nhập khẩu";
		}
		else if(tenxuatxu.equals("Nội địa"))
		{
			this.tenxuatxu = "Nội địa";
		}
		else if(tenxuatxu.equals("Liên doanh"))
		{
			this.tenxuatxu = "Liên doanh";
		}
		else
			this.tenxuatxu="";
	}
	public int getNamnhap() {
		return namnhap;
	}
	public void setNamnhap(int namnhap) {
		this.namnhap = namnhap;
	}
	public String getCauhinh() {
		return cauhinh;
	}
	public void setCauhinh(String cauhinh) {
		this.cauhinh = cauhinh;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Số hiệu "+sohieu+" , tên xuất xứ: "+tenxuatxu+" , năm nhập: "+namnhap+" , cấu hình: "+cauhinh;
	}
}
