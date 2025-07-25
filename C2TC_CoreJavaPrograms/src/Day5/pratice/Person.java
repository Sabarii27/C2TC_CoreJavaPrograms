package Day5.pratice;

public class Person {
	private int Pid;
	private String Name;
	private String City;
	
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	public Person(int pid, String name, String city) {
		super();
		this.Pid = pid;
		this.Name = name;
		this.City = city;
	}

	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		this.Pid = pid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	
	

}
