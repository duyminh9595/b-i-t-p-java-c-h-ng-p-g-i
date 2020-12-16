package bt83;

public class NhanVien {
	private String maNV;
	private String phanXuong;
	private int soSP;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getPhanXuong() {
		return phanXuong;
	}
	public void setPhanXuong(String phanXuong) {
		this.phanXuong = phanXuong;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public int getChuan(String phanXuong)
	{
		if(phanXuong.equals("A"))
			return 300;
		else
			return 500;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maNV;
	}
}
