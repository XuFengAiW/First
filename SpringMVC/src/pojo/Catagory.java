package pojo;

public class Catagory {
	public int id;
	public String Name;
	public String Explain;
	public Catagory(int id, String name, String explain) {
		super();
		this.id = id;
		Name = name;
		Explain = explain;
	}
	public Catagory() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getExplain() {
		return Explain;
	}
	public void setExplain(String explain) {
		Explain = explain;
	}
	@Override
	public String toString() {
		return "Catagory [id=" + id + ", Name=" + Name + ", Explain=" + Explain
				+ "]";
	}
	
	
}
