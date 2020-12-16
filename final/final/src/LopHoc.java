import java.util.ArrayList;

public class LopHoc {
	private MonHoc mon;
	private ArrayList<SinhVien>dsSV;
	public LopHoc()
	{
		mon=new MonHoc();
		dsSV=new ArrayList<>();
	}
	public MonHoc getMon() {
		return mon;
	}
	public void setMon(MonHoc mon) {
		this.mon = mon;
	}
	public ArrayList<SinhVien> getDsSV() {
		return dsSV;
	}
	public void setDsSV(ArrayList<SinhVien> dsSV) {
		this.dsSV = dsSV;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
