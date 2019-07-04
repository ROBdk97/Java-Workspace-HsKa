package blatt11;

import java.util.ArrayList;
import java.util.List;

public class SysDirectory extends SysObjectBase {

	/**
	 * Liste an SysObjectBase elementen
	 */
	private SysObjectBase[] sysObjects;

	/*
	 * Konstruktor
	 * 
	 * @param name ist der Name des Verzeichnis
	 * 
	 * @param sysObjects die Elemente im Verzeichnis
	 */
	public SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}

	/**
	 * Verzeichnisse nach Ressource durchsuchen, deren Namen eine Teilzeichenkette
	 * enthält. Bei jedem Treffer wird der Name der Ressource ausgegeben.
	 *
	 * @param searchFor Zeichenkette nach der in den Namen der Ressourcen gesucht
	 *                  wird
	 */
	public void findName(String searchFor) {
		for (SysObjectBase object : sysObjects) {
			if (object.name.contains(searchFor)) {
				System.out.println(object.getName());
			}
			if (object instanceof SysDirectory) {
				((SysDirectory) object).findName(searchFor);
			}
		}
	}

	@Override
	public String toString() {
		return super.toString() + "," + " NumberOfObjects=" + this.sysObjects.length;
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
		System.out.printf("%s\n", home.dirStructure("| - "));
		String find = "e";
		System.out.println("\nFind '" + find + "':");
		home.findName(find);
	}

	/**
	 * Struktur des Verzeichnisses ermitteln
	 * 
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 **/
	public String dirStructure(String indent) {
		String returnString = "";
		for (SysObjectBase object : sysObjects) {
			returnString += indent + object.toString() + "\n";
			if (object instanceof SysDirectory) {
				returnString += ((SysDirectory) object).dirStructure(indent + indent);
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

	/**
	 * Hatte lw und hier kann man beliebigviele SysObjectBase Elemente dem
	 * existierenden Array sysObjects hinzufüben
	 * 
	 * @param sysObjects die hinzugefügt werden sollen
	 */
	public void addSysObjects(SysObjectBase... sysObjects) {
		List<SysObjectBase> temp = new ArrayList<SysObjectBase>();
		for (SysObjectBase sysObjectBase : this.sysObjects) {
			temp.add(sysObjectBase);
		}
		for (SysObjectBase sysObjectBase : sysObjects) {
			temp.add(sysObjectBase);
		}
		this.sysObjects = new SysObjectBase[temp.size()];
		this.sysObjects = temp.toArray(this.sysObjects);
	}

}
