package bt39;

public class NhanVien {
	private int maNV;
	private String hoTen;
	private String diaChi;
	private boolean CBQL;
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isCBQL() {
		return CBQL;
	}
	public void setCBQL(boolean cBQL) {
		CBQL = cBQL;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ho ten: "+hoTen+",Dia Chi: "+diaChi+",Ma Nhan Vien "+maNV+", la can bo quan ly";
	}
}
