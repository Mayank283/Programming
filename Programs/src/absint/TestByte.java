package absint;

public class TestByte {

	public static void main(String[] args) {
		String a ="Luck!";
		byte[] bytes = a.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
	}
}
