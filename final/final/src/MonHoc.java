
public class MonHoc {
	private int mamonhoc;
	private String tenmonhoc;
	private String loaimon;
	private int sotiet;
	public int getSotiet() {
		return sotiet;
	}
	public void setSotiet(int sotiet) {
		this.sotiet = sotiet;
	}
	public MonHoc()
	{
		mamonhoc=0;
		tenmonhoc=loaimon="";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mã mốn: "+mamonhoc+" ,tên môn: "+tenmonhoc+" ,loại môn: "+loaimon+" ,số tiết: "+sotiet;
	}
	public int getMamonhoc() {
		return mamonhoc;
	}
	public void setMamonhoc(int mamonhoc) {
		this.mamonhoc = mamonhoc;
	}
	public String getTenmonhoc() {
		return tenmonhoc;
	}
	public void setTenmonhoc(String tenmonhoc) {
		this.tenmonhoc=tenmonhoc;
	}
	public String getLoaimon() {
		return loaimon;
	}
	public void setLoaimon(String loaimon) {
		if(loaimon.equals(("dai cuong")))
		{
			this.loaimon="Đại cương";
		}
		else if(loaimon.equals("Cơ sở ngành"))
		{
			this.loaimon="Cơ sở ngành";
		}
		else if(loaimon.equals("Chuyên ngành bắt buộc"))
		{
			this.loaimon="Chuyên ngành bắt buộc";
		}
		else if(loaimon.equals("Chuyên ngành tự chọn"))
		{
			this.loaimon="Chuyên ngành tự chọn";
		}
		else
			this.loaimon="";
	}
	
}
