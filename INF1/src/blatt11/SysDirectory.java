package blatt11;

public class SysDirectory extends SysObjectBase {

	private SysObjectBase[] sysObjects;

	public SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Class=" + this.getClass().getSimpleName() + ", Name=" + this.name + ", User=" + this.user + ","
				+ " NumberOfObjects=" + this.sysObjects.length;
	}

	public static void main(String[] args) {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);
		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
		System.out.printf("%s\n", home);
		System.out.printf("%s\n", home.dirStructure(""));
	}

	/**
	 * Struktur des Verzeichnisses ermitteln
	 * 
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 **/
	public String dirStructure(String indent) {
		String returnString = null;
		for (SysObjectBase object : sysObjects) {
			returnString += object + "\n";
			if (object instanceof SysDirectory) {
				returnString += ((SysDirectory) object).dirStructure(indent);
			}
		}

		return returnString;
	}

	public SysObjectBase[] getSysObjects() {
		return sysObjects;
	}

	public void setSysObjects(SysObjectBase[] sysObjects) {
		this.sysObjects = sysObjects;
	}

}
