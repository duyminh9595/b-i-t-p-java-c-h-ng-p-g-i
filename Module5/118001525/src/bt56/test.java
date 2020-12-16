package bt56;

public class test {
  public static void main(String[] args) {
	CuaHang data = new CuaHang();
	data.nhapThongTinDanhMucVaSP();
	data.lietKeHangTQ();
	MyFile.luuDoiTuong(data, "luuluu.data");
	//
	//data= (CuaHang) MyFile.docDoiTuong("luuluu.data");
}
}
