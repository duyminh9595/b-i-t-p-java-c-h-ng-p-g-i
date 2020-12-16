package bt45;

import java.util.ArrayList;

public class Staff {
	private ArrayList<StaffMember>staffList;
	public void payday()
	{
		for(StaffMember nv: staffList)
			System.out.println(nv);
	}
	public Staff()
	{
		staffList=new ArrayList<>();
		Hourly e= new Hourly();
		e.name="Minh";
		e.address="Bien Hoa";
		e.phone="113";
		e.socialSecurityNumber="118001525";
		e.payRate=2.5d;
		e.addHours(3);
		staffList.add(e);
		Executive a= new Executive();
		a.name="Dang";
		a.address="Phan thiet";
		a.phone="114";
		a.socialSecurityNumber="313213";
		a.awardBonus(300);
		a.payRate=1d;
		staffList.add(a);
		Volunteer b= new Volunteer();
		b.name="Quy";
		b.address="Khong biet";
		b.phone="115";
		staffList.add(b);
	}
}
