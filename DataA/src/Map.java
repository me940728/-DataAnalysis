import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		java.util.Map<String, String> pMap = new HashMap<>();
		// ���� Map �̶�� �������̽� �Ϻο� HashMap ��ü�� �ҷ��� ����c
		pMap.put("name", "�ֺ���");
		pMap.put("email", "me940728@naver.com");
		pMap.put("dept", "DataAl");
		
		System.out.println("--------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("--------------------");
	}

}
