import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("최별규");
		arr.add("최별규");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i+"번째 배열의 값은"+arr.get(i)+"입니다.");
		}
		
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println("이름"+name);
		}
	}

}
