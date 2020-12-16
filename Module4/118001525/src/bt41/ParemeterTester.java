package bt41;

public class ParemeterTester {

	public static void changeValues(int f1,Num f2,Num f3)
	{
		System.out.println("Before changing the values: ");
		System.out.println("f1\tf2\tf3");
		System.out.println(f1+"\t"+f2+"\t"+f3+"\n");
		f1=999;
		f2.setValue(888);
		f3=new Num(777);
		System.out.println("After changing the values: ");
		System.out.println(f1+"\t"+f2+"\t"+f3+"\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=111;
		Num a2=new Num(222);
		Num a3=new Num(333);
		System.out.println("Before changing the values: ");
		System.out.println("a1\ta2\ta3");
		System.out.println(a1+"\t"+a2+"\t"+a3+"\n");
		changeValues(a1, a2, a3);
		System.out.println("After calling change values: ");
		System.out.println("a1\ta2\ta3");
		System.out.println(a1+"\t"+a2+"\t"+a3+"\n");
	}

}
