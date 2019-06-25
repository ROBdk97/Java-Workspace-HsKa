package blatt11;

public class SysObjectBase {
	protected String name;
	protected String user;

	public SysObjectBase(String name) {
		this.name = name;
		this.user = System.getenv("USERNAME");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return user;
	}

	public void setOwner(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Class=" + this.getClass() + ", Name=" + this.name + ", User=" + this.user;
	}

}
