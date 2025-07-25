package Day5.pratice;

public class Trainer extends Person{
	
	private String session;
	private String designation;
	private String batcNo;
	
	public Trainer(int pid,String name,String city,String session, String designation, String batcNo) {
		super(pid,name,city);
		this.session = session;
		this.designation = designation;
		this.batcNo = batcNo;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBatcNo() {
		return batcNo;
	}
	public void setBatcNo(String batcNo) {
		this.batcNo = batcNo;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer id:"+super.getPid()+", "+"Trainer name:"+super.getName()+" ,"+"Trainer city:"+super.getCity()+", "+"session=" + session + ", designation=" + designation + ", batcNo=" + batcNo + "]";
	}
	

}
