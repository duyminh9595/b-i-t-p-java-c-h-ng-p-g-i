package bt55;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls1 = new ArrayList<String>();
		List<String> ls2 = new ArrayList<String>();
		List<String> ls3 = new ArrayList<String>();
		List<String> ls4 = new ArrayList<String>();
		List<String> ls5 = new ArrayList<String>();
		List<String> ls6 = new ArrayList<String>();
		List<String> ls7 = new ArrayList<String>();
		List<String> ls8 = new ArrayList<String>();
		List<String> ls9 = new ArrayList<String>();
		List<String> ls10 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (true) {
			System.out.println("Nhap so: ");
			int n = sc.nextInt();
			if (n/ 10 == 0)
				ls1.add("*");
			if (n / 10 == 1)
				ls2.add("*");
			if (n / 10 == 2)
				ls3.add("*");
			if (n / 10 == 3)
				ls4.add("*");
			if (n / 10 == 4)
				ls5.add("*");
			if (n / 10 == 5)
				ls6.add("*");
			if (n / 10 == 6)
				ls7.add("*");
			if (n / 10 == 7)
				ls8.add("*");
			if (n / 10 == 8)
				ls9.add("*");
			if (n / 10 == 9)
				ls10.add("*");
			sc.nextLine();
			System.out.println("Tiep khong?y/n");
			String s=sc.nextLine();
			if (!s.equals("y"))
				break;
		}
		System.out.print("1-10  |");
		for(String s : ls1)System.out.print("*");
		System.out.println();
		System.out.print("11-20 |");
		for(String s : ls2)System.out.print("*");System.out.println();
		System.out.print("21-30 |");
		for(String s : ls3)System.out.print("*");System.out.println();
		System.out.print("31-40 |");
		for(String s : ls4)System.out.print("*");System.out.println();
		System.out.print("41-50 |");
		for(String s : ls5)System.out.print("*");System.out.println();
		System.out.print("51-60 |");
		for(String s : ls6)System.out.print("*");System.out.println();
		System.out.print("61-70 |");
		for(String s : ls7)System.out.print("*");System.out.println();
		System.out.print("71-80 |");
		for(String s : ls8)System.out.print("*");System.out.println();
		System.out.print("81-90 |");
		for(String s : ls9)System.out.print("*");System.out.println();
		System.out.print("91-100|");
		for(String s : ls10)System.out.print("*");System.out.println();
	}

}
