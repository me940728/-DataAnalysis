import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		java.util.Map<String, String> pMap = new HashMap<>();
		// 상위 Map 이라는 인터페이스 하부에 HashMap 객체를 불러와 사용홤
		pMap.put("name", "최별규");
		pMap.put("email", "me940728@naver.com");
		pMap.put("dept", "DataAl");
		
		System.out.println("--------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("--------------------");
	}

}
