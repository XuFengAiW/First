package pojo;
import pojo.Catagory;
public class product {
	public  int id ;
	 public String productname;
	 public String Descs;
	  public int cid;
	  public Catagory catagorys;
	public product(int id, String productname, String descs, int cid,
			Catagory catagorys) {
		super();
		this.id = id;
		this.productname = productname;
		Descs = descs;
		this.cid = cid;
		this.catagorys = catagorys;
	}
	public product() {
		super();
		
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", productname=" + productname
				+ ", Descs=" + Descs + ", cid=" + cid + ", catagorys="
				+ catagorys + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescs() {
		return Descs;
	}
	public void setDescs(String descs) {
		Descs = descs;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Catagory getCatagorys() {
		return catagorys;
	}
	public void setCatagorys(Catagory catagorys) {
		this.catagorys = catagorys;
	}
	
	
}
