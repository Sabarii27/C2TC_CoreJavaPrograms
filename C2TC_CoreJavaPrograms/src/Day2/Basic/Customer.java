package Day2.Basic;

public class Customer {
		private int cid;
		private String Cname;
		private String city;
		public Customer() {
			this.cid=101;
			this.Cname="sabarii";
			this.city="pondy";
		}
		public Customer(int cid,String Cname,String city) {
			this.cid=cid;
			this.Cname=Cname;
			this.city=city;
			
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return Cname;
		}
		public void setCname(String cname) {
			Cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", Cname=" + Cname + ", city=" + city + "]";
		}
		
		
		
	}


