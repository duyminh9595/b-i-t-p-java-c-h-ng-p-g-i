package bt53;

import java.util.ArrayList;

public class Truong {
	ArrayList<Lop>dsLop;
	public Truong()
	{
		dsLop=new ArrayList<>();
	}
	public void xuatDsTungLop()
	{
		for(Lop data:dsLop)
		{
			System.out.println("Ten Lop"+data.getTenlop());
			for(SinhVien sv:data.getDssv())
			{
				System.out.println(sv);
			}
			System.out.println("---------------");
		}
	}
}
