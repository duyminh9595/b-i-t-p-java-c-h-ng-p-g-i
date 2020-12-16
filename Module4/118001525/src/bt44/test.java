package bt44;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woman p =new Woman();
		Calendar c=Calendar.getInstance();
		c.set(Calendar.MONDAY,11);
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.DATE, 05);
		p.dOB=c.getTime();
		p.setFirstname("Duy Minh");
		System.out.println(p.toString());
	}

}
