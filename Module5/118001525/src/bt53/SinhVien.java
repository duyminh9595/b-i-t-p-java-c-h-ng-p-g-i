package bt53;

public class SinhVien {
	private int masv;
	private String hoten;
	private String noisong;
	private Lop maLop;
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
	public String getNoisong() {
		return noisong;
	}
	public void setNoisong(String noisong) {
		this.noisong = noisong;
	}
	public Lop getMaLop() {
		return maLop;
	}
	public void setMaLop(Lop maLop) {
		this.maLop = maLop;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MaSV: "+masv+", Ho Ten: "+hoten+
				", Noi Song: "+noisong;
	}
}
