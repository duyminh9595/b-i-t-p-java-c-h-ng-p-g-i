package bt63;

import java.util.Scanner;

public class StringTooLong {
	public static class StringTooLongException extends Exception {
		public StringTooLongException() {
			System.out.println("\nString too long. Input again");
		}
	}

	public static void main(String[] args) throws StringTooLongException {
		Scanner sc = new Scanner(System.in);
		String s;
		boolean check = true;
		while (true) {
			System.out.println("Nhap du lieu");
			s = sc.nextLine();
			if (sc.nextLine().equalsIgnoreCase("done"))
				break;
		}
		try {
			if(s.length()>20)
				throw new StringTooLongException();
		} catch (StringTooLongException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
