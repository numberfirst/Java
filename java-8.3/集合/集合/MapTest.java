package 集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("a", "qq");
		map.put("f", "qq");
		map.put('d', "qq");
		map.put('l', "qq");
		System.out.println(map);
		System.out.println(map.containsKey(10));
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection c=map.values();
		Iterator it1= c.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		

	}

}
