package bt40;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		Address home = new Address();
		home.setCity("HCM");
		home.setState("Dong Nai");
		home.setStreetAddress("12/2");
		home.setZipCode(70000l);
		Address school =new Address();
		school.setCity("Binh Duong");
		school.setState("AA");
		school.setStreetAddress("3/3");
		school.setZipCode(30000);
		s.setHomeAddress(home);
		s.setSchoolAddress(school);
		s.setFirstName("Duy");
		s.setLastName("Minh");
		System.out.println(s);
	}

}
