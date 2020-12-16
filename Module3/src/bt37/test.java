package bt37;


public class test {
	public static void main(String[] args) {
		CNhanVien nv1=new CNhanVien("Duy", "Minh", 800);
		CNhanVien nv2=new CNhanVien("Ga", "Vit", 100);
		System.out.println("Luong nv1: "+nv1.getLuong());
		System.out.println("Luong nv2: "+nv2.getLuong());
		if(nv1.getmSoSP()>nv2.getmSoSP())
		{
			System.out.println("Lon hon");
		}
		else 
			System.out.println("Be hon");
		if(nv1.LonHon(nv2))
		{
			System.out.println("Lon hon");
		}
		else 
			System.out.println("Be hon");
	}
}
