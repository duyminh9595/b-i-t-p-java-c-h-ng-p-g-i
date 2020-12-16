package bt42;

public class HoSo {
	static int soNguoi;
	String hoTen;
	public HoSo(String ht) {
		hoTen=ht;
		soNguoi++;
	}
	static void tongKet()
	{
		System.out.println("Ho Khau nay co "+soNguoi+" nguoi");
	}
	void xuatHoTen()
	{
		System.out.println(hoTen);
	}
}
