package bt60;

import java.util.Scanner;

public class ArtistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape hcn=new Rectangle(8,4);
		Artist a=new Artist();
		a.drawShape(hcn);
		System.out.println();
		RightTriangle tg= new RightTriangle(20);
		a.drawShape(tg);
		int dai=new Scanner(System.in).nextInt();
		int rong=new Scanner(System.in).nextInt();
		hcn=new Rectangle(dai,rong);
		a.drawShape(hcn);
	}

}
