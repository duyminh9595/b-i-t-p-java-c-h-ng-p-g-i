package bt87;

public class SinhVien {

	private String ma;
	private String ten;
	private String gt;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		this.gt = gt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ma+" - "+ten+" - "+gt;
	}
}
