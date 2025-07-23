package entityclassassignment2;

public class ProductClass {
	private String id;
	private String idname;
	private String store;
	private String loc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdname() {
		return idname;
	}
	public void setIdname(String idname) {
		this.idname = idname;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "ProductClass [id=" + id + ", idname=" + idname + ", store=" + store + ", loc=" + loc + "]";
	}
	
	

}
