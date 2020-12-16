package bt32;

public class TimeTest {
	public static void main(String[] args) {
		Time t1, t2, t3, t4, t5, t6;
		t1 = new Time();
		t2 = new Time(2);
		t3 = new Time(21, 34);
		t4 = new Time(12, 25, 42);
		t5 = new Time(27, 74, 99);
		t6 = new Time(t4);
		String output = "";
		output = "Contructed with: " + "\nt1: all arguments defaulted" + "\n" + t1.toUniversalString() + "\n"
				+ t1.toString();
	}
}
