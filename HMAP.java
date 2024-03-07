package MAP_SET_LIST_PQUEUE;
import java.util.*;
public class HMAP {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Leda");
		h.put(18,"Anirban");
		h.put(24,"Tithi");
		h.put(28,"Rajib");
		h.put(45,"Soma");
		h.put(52,"Pradip");
		//System.out.println(h.keySet());
		//System.out.println(h.values());
		//System.out.println(h.entrySet());
		//System.out.println(h.get(65));
		//System.out.println(h.containsKey(56));
		//System.out.println(h.containsValue("Tithi"))
        //System.out.println(h)
        // System.out.println(h.remove(67));
        //System.out.println(h);
		Set set=h.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry ob=(Map.Entry)itr.next();//casting
			System.out.println("Keys are:"+ob.getKey()+"\n"+" Values are:"+ob.getValue());
		}
		
	}

}
