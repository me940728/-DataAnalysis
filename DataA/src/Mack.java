import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Mack{
    public static void main(String[] args){
    	List<Map<String, String>> rList = new ArrayList<>();
    	Map<String, String> pMap = new HashMap<String, String>();
    	pMap.put("name", "������");
    	pMap.put("Email", "h.lee@");
    	pMap.put("addr", "����");
    	rList.add(pMap);
    	pMap=null;
    	
    	pMap=new HashMap<String, String>();
    	pMap.put("name", "ȫ�浿");
    	pMap.put("Email", "g.hong@");
    	pMap.put("addr", "���");
    	rList.add(pMap);
    	pMap=null;
    	
    	Iterator<Map<String, String>> it = rList.iterator();
    	while(it.hasNext()) {
    	Map<String, String> rMap = it.next();
    	System.out.println(rMap.get("name"));
    	System.out.println(rMap.get("Email"));
    	System.out.println(rMap.get("addr"));
    	rMap=null;
    	}
    }
}