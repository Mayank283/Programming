/**
 * 
 */
package absint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Mayank
 *
 */
public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int [] array = new int[3];
		list.add(5);
		list.add(1);
		list.add(8);
		array[0] = 5;
		array[1] = 1;
		array[2] = 8;
		Collections.sort(list);
		Arrays.sort(array);
		System.out.println(list);
		System.out.println(array[0]);
	}
}
