package MAP_SET_LIST_PQUEUE;
import java.util.*;
public class LHMAP {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
		h.put(45,"Soma");
		h.put(52,"Pradip");
		h.put(24,"Tithi");
		h.put(28,"Rajib");
		h.put(1,"Leda");
		h.put(18,"Anirban");
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
