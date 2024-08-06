package dat22nov23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapofmap {

	public static void main(String[] args) {
		
		Map<String, List<Long>> m1=new HashMap();
		
		   List<Long> l1= new ArrayList();
		     l1.add(121l);
		     l1.add(131l);
		     
		     m1.put("ID", l1);
		     System.out.println(m1);
		     
		     for(Map.Entry<String,List<Long>> map:m1.entrySet())
		     {
		    	 List<Long> l2= map.getValue();
		    	 
		    	 for(Long l: l2)
		    	 {
		    		System.out.println(l); 
		    	 }
		    	 
		     }
		     
		// TODO Auto-generated method stub

	}

}
