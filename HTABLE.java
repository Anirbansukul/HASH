package MAP_SET_LIST_PQUEUE;
import java.util.*;
public class HTABLE {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(1,"Leda");
		h.put(18,"Anirban");
		h.put(24,"Tithi");
		h.put(28,"Rajib");
		h.put(45,"Soma");
		h.put(52,"Pradip");
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
