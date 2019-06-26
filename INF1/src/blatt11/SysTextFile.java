package blatt11;

public class SysTextFile extends SysObjectBase {

	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	private String type;
	private String text = "";

	public static void main(String[] args) {
		SysTextFile stf = new SysTextFile("Hello", "java");
		stf.setText("public class HelloWorld{/*...*/}");
		System.out.printf("%s:\n  %s\n\n", stf, stf.getText());
	}

	@Override
	public String toString() {
		return "Class=" + this.getClass().getSimpleName() + ", Name=" + this.name + "," + " User=" + this.user
				+ ", Type=" + this.type + ", Length=" + this.text.length();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
