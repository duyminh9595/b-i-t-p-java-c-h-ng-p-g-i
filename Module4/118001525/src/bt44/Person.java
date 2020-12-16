package bt44;

import java.util.Date;

public abstract class Person implements Mammal{

	@Override
	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub
		dOB=dob;
	}

	@Override
	public int getAgeAsDays() {
		// TODO Auto-generated method stub
		return new Date().getYear()-dOB.getYear();
	}
	public String firstname;
	public String getFirstname() {
		return firstname;
	}

	public abstract void setFirstname(String firstname);
	Address dcNha;
	BloodGroup blood;
	Date dOB ;
	public Person()
	{
		dcNha=new Address();
		blood=new BloodGroup();
	}
}
