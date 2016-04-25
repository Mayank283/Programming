package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public static void main(String[] args) {
		Box box = new Box();
		box.setWidth(50);
		box.setHeight(30);

		try {
			FileOutputStream f = new FileOutputStream("goo.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(box);
			o.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			ObjectInputStream n = new ObjectInputStream(new FileInputStream("goo.ser"));

			Box b1 = (Box) n.readObject();
			System.out.println(b1.getWidth());
			n.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
