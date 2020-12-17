package de2;

import java.util.ArrayList;

public class PhongThucHanh {
	private int maphong;
	private String tenphong;
	private int somay;
	public PhongThucHanh()
	{
		maphong=somay=0;
		tenphong="";
	}
	public int getMaphong() {
		return maphong;
	}
	public void setMaphong(int maphong) {
		this.maphong = maphong;
	}
	public String getTenphong() {
		return tenphong;
	}
	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}
	public int getSomay() {
		return somay;
	}
	public void setSomay(int sl) {
		this.somay=sl;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mã phòng: "+maphong+" .Tên phòng: "+tenphong+". Số máy: "+somay;
	}
	
}
