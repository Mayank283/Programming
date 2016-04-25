package inherit;

public class Testinherit extends TestFather {

	public static void main(String[] args) {
		// TestFather t=new Testinherit();

		Testinherit t = new Testinherit();
		t.first();
		t.second();
		t.third();
	}

	public void second() {
		System.out.println("Child class function second called");
	}

	public void third() {
		System.out.println("Child class function third called");
	}
}

class TestFather {
	public void first() {
		System.out.println("Parent class First called");
	}

	public void second() {
		System.out.println("Parent class Second called");
	}
}