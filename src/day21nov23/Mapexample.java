package day21nov23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapexample {

	public static void main(String[] args) {
		
		/*HashMap<String,Integer> m=new HashMap<>();
		m.put("id", 10);
		m.put("rollno",11);
		m.put("code", 12);
		m.put("phone no", 13);
		
		System.out.println(m);
		//m.e
		
		
		for(Map.Entry<String,Integer> e: m.entrySet())
		{
			String key=e.getKey();
			Integer val=e.getValue();
			if(val%2==0)
			System.out.println(key+":"+val);
		}*/
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> m=new HashMap<>();
		m.put(1, 10);
		m.put(2,11);
		m.put(3, 12);
		m.put(4, 12);
		m.put(null, null);
		m.put(5, null);
		
		System.out.println(m);
		//m.e
		
		
		for(Map.Entry<Integer,Integer> e: m.entrySet())
		{
			Integer key=e.getKey();
			Integer val=e.getValue();
			//if(val%2==0)
			System.out.println(key+":"+val);
		}


	}

}
