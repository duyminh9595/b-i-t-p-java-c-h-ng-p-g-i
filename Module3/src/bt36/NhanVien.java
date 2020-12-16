package bt36;

import java.text.DecimalFormat;

public class NhanVien {
	private String maNV;
	private int soSP;
	public NhanVien()
	{
		maNV="";
		soSP=0;
	}
	public NhanVien(String ma,int sp)
	{
		maNV=ma;
		soSP=sp;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public boolean coVuotChuan()
	{
		return (soSP>500);
	}
	public String getTongKet()
	{
		if(soSP>500)
			return "Vuợt";
		else
			return "";
	}
	public double getLuong()
	{
		if(soSP>500)
			return soSP*30000;
		else
			return soSP*20000;
	}
	public static void XuatTieuDe()
	{
		System.out.println("Mã Nhân Vien"+"\tSo Sản Phẩm\t"+"Lương\t\t"+"Tổng");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maNV+"\t\t"+soSP+"\t\t"+getLuong()+"\t\t"+getTongKet();
	}
}
