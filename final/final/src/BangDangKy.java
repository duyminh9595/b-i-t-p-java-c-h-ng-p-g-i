import java.util.Date;

public class BangDangKy {
	private MonHoc mondangky;
	private SinhVien svdangky;
	private Date thoigiandangky;
	
	public Date getThoigiandangky() {
		return thoigiandangky;
	}
	public void setThoigiandangky(Date thoigiandangky) {
		this.thoigiandangky = thoigiandangky;
	}
	public MonHoc getMondangky() {
		return mondangky;
	}
	public void setMondangky(MonHoc mondangky) {
		this.mondangky = mondangky;
	}
	public SinhVien getSvdangky() {
		return svdangky;
	}
	public void setSvdangky(SinhVien svdangky) {
		this.svdangky = svdangky;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sinh Viên MS: "+svdangky.getMasinhvien()+" với tên: "+svdangky.getHoten() +" đã đăng ký môn "+mondangky.getTenmonhoc()+" với mã môn: "+mondangky.getMamonhoc()+" thời gian đăng ký: "+thoigiandangky;
	}
}
