package pekan1;
import java.util.ArrayList;
public class ArrayListGetElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new
		ArrayList<Integer>();
		// add the number
		list.add(9);
		list.add(5);
		list.add(6);
		System.out.println(list);
		// get metghod
		Integer n = list.get(1);
		System.out.println("Pada Indeks ke 1 angkanya adalah: " + n);

	}

}
