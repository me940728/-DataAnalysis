import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public class ArrayMap {
	public static void main(String[] args) {
		// HashMap ������ ���� List �������̽����� ArrayList ��ü�� �޸𸮿� ����
		List<HashMap<String, String>> rList = new ArrayList<>();
		// rList ������ ������ HashMap ��ü �޸𸮿� ����
		HashMap<String, String> pMap = new HashMap<>();// �ؽ����� Ű�� ������ String
		pMap.put("name", "�ֺ���"); //pMap�̸� �Ķ���� Map�� ���
		pMap.put("email", "me940728@naver.com");
		pMap.put("addr", "����");
		pMap.put("dept", "����");
		//�ֺ����� ������ ����� HashMap�� List ��ü�� ����
		rList.add(pMap);
		// ������ ����� ���� HashMap ���� �޸𸮿��� ���� -> �ʼ�
		pMap = null; // null ����
		// ȫ�浿 ���� ������ ���ѱ��� HahMap ������ ���Ӱ� �޸𸮿� �ø�
		pMap = new HashMap<>();// ������ ���� �ʱ�ȭ
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");
		pMap.put("dept", "�ð�");
		// ȫ�浿 ������ ����
		rList.add(pMap);
		pMap=null;
		Iterator<HashMap<String, String>> it = rList.iterator();
		while(it.hasNext()) {
		HashMap<String, String> rMap = it.next(); // HashMap�̶� rMap������ it������ ���� �־���
		System.out.println("######## �ݺ�����! ########");
		System.out.println("name : "+rMap.get("name"));
		System.out.println("email : "+rMap.get("email"));
		System.out.println("addr : "+rMap.get("addr"));
		System.out.println("dept : "+rMap.get("dept"));
		rMap = null;
		System.out.println("######## �ݺ���!  ########");
		}
	}
}
