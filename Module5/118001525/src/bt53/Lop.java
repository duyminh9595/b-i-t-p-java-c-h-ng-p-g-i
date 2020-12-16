package bt53;

import java.util.ArrayList;
import java.util.List;

public class Lop {
	private int malop;
	private String tenlop;
	private int siSo;
	private List<SinhVien>dssv;
	public int getMalop() {
		return malop;
	}
	public void setMalop(int malop) {
		this.malop = malop;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public int getSiSo() {
		return siSo;
	}
	public void setSiSo() {
		this.siSo = dssv.size();
	}
	public Lop()
	{
		malop=0;
		tenlop="";
		siSo=0;
		dssv=new ArrayList<SinhVien>();
	}
	public List<SinhVien> getDssv() {
		return dssv;
	}
	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
}
