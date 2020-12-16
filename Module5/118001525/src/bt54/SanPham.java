package bt54;

import java.text.DecimalFormat;

public class SanPham {
	private int masp;
	private String tensp;
	private double giaca;
	private String xuatxu;
	public int getMasp() {
		return masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getGiaca() {
		return giaca;
	}
	public void setGiaca(double giaca) {
		this.giaca = giaca;
	}
	public String getXuatxu() {
		return xuatxu;
	}
	public void setXuatxu(String xuatxu) {
		this.xuatxu = xuatxu;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ten SP: "+tensp+", Ma SP: "+
				masp+", Gia ca: "+new DecimalFormat("0,000").format(giaca)+
				", Nguon goc: "+xuatxu;
	}
}
