package Kaesten;

public abstract class AbstractRing {

	abstract Object add(Object b);

	abstract Object mul(Object b);

}

class IntegerRing extends AbstractRing {
	Integer a;

	IntegerRing(int a) {
		this.a = a;
	}

	Object add(Object b) {
		return this.a + (Integer) b;
	};

	Object mul(Object b) {
		return this.a * (Integer) b;
	};

	public static void main(String[] args) {
		IntegerRing a = new IntegerRing(5);
		System.out.println(a.mul(5));
	}

}
