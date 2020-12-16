package bt50;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Random().nextInt(5)+1;
		CircleCollection data= new CircleCollection();
		for(int i=0;i<=n;i++)
			data.addCircle();
		for(int i=0;i<=n;i++)
		{
			System.out.println(data.getCircle(i));
		}
		System.out.println("Tong dien tich: "+data.tongDienTichHinhTron());
		System.out.println(data);
	}

}
