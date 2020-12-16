package bt65;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static void luuTextFile(String filename) {
		try {
			FileOutputStream fOut = new FileOutputStream(filename);
			PrintWriter print = new PrintWriter(fOut, true);
			Random rd = new Random();
			for (int i = 0; i < 10; i++) {
				String line = "";
				for (int j = 0; j < 10; j++) {
					line += rd.nextInt(100) + ";";
				}
				print.println(line);
			}
			print.close();
			fOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void inTong(String[] arr,int j) {
		int s = 0;
		for (int i = 0; i <= 9; i++) {
			s += Integer.parseInt(arr[i]);
		}
		System.out.println("Tong hang "+j+" la: " + s);
	}

	public static void docTextFile(String filename) {
		try {
			FileInputStream fIn = new FileInputStream(filename);
			Scanner sc = new Scanner(fIn);
			int i=1;
			while (sc.hasNextLine()) {
				String s=sc.nextLine();
				System.out.println(s);
				inTong(s.split(";"),i++);
			}
			fIn.close();
			sc.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// luuTextFile("data");
		docTextFile("data");
	}

}
