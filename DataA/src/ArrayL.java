import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("�ֺ���");
		arr.add("�ֺ���");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i+"��° �迭�� ����"+arr.get(i)+"�Դϴ�.");
		}
		
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println("�̸�"+name);
		}
	}

}
