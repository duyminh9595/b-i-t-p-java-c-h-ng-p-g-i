package bt56;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DanhMuc implements Serializable {
	private List<SanPham>dsList;
	private int madanhmuc;
	private String tendanhmuc;
	public List<SanPham> getDsList() {
		return dsList;
	}
	public void setDsList(List<SanPham> dsList) {
		this.dsList = dsList;
	}
	public int getMadanhmuc() {
		return madanhmuc;
	}
	public void setMadanhmuc(int madanhmuc) {
		this.madanhmuc = madanhmuc;
	}
	public String getTendanhmuc() {
		return tendanhmuc;
	}
	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	public DanhMuc()
	{
		dsList=new ArrayList<SanPham>();
		madanhmuc=0;
		tendanhmuc="";
	}
}
