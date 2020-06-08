import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public class ArrayMap {
	public static void main(String[] args) {
		// HashMap 저장을 위한 List 인터페이스에서 ArrayList 객체를 메모리에 생성
		List<HashMap<String, String>> rList = new ArrayList<>();
		// rList 변수에 저장할 HashMap 객체 메모리에 형성
		HashMap<String, String> pMap = new HashMap<>();// 해쉬맵의 키는 무조건 String
		pMap.put("name", "최별규"); //pMap이면 파라미터 Map의 약어
		pMap.put("email", "me940728@naver.com");
		pMap.put("addr", "서울");
		pMap.put("dept", "데분");
		//최별규의 정보가 저장된 HashMap을 List 객체에 저장
		rList.add(pMap);
		// 저장후 사용이 끝난 HashMap 변수 메모리에서 삭제 -> 필수
		pMap = null; // null 선언
		// 홍길동 정보 저장을 위한기존 HahMap 변수를 새롭게 메모리에 올림
		pMap = new HashMap<>();// 변수의 재사용 초기화
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "경기");
		pMap.put("dept", "시각");
		// 홍길동 정보를 저장
		rList.add(pMap);
		pMap=null;
		Iterator<HashMap<String, String>> it = rList.iterator();
		while(it.hasNext()) {
		HashMap<String, String> rMap = it.next(); // HashMap이란 rMap변수에 it변수의 값을 넣어줌
		System.out.println("######## 반복시작! ########");
		System.out.println("name : "+rMap.get("name"));
		System.out.println("email : "+rMap.get("email"));
		System.out.println("addr : "+rMap.get("addr"));
		System.out.println("dept : "+rMap.get("dept"));
		rMap = null;
		System.out.println("######## 반복끝!  ########");
		}
	}
}
