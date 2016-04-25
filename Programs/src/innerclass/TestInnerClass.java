package innerclass;

public class TestInnerClass {

	public static void main(String[] args) {

		FirstClass in = new FirstClass();
		in.fMethod();
		FirstClass.Insideclass s = in.new Insideclass();
		s.fMethodIn();
	}

}

class FirstClass {

	public void fMethod() {
		System.out.println("Fmethod Done");
	}

	class Insideclass {
		public void fMethodIn() {
			System.out.println("fMethodIn Done");
		}
	}

}