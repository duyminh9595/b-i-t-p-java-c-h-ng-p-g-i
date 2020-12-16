package bt35;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CHinhTamGiac t=new CHinhTamGiac(3,4, 5);
		if(t.laTamGiac())
		{
			t.chuViTamGiac();
			t.dienTichTamGiac();
		}
		else
		{
			System.out.println("Khong phai tam giac");
		}
	}

}
