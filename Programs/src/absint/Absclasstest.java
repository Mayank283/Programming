package absint;

public class Absclasstest implements Infclass {

	public static void main(String[] args) {
		Absclasstest a = new Absclasstest();
		a.name();
		Infclass.name1();
	}

	@Override
	public void name() {
		System.out.println("interface overriden");
	}
}