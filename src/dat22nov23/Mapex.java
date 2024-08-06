package dat22nov23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapex {

	public static void main(String[] args) {
		
		
		Map<String,List<String>> map=new HashMap<>();
		
		List<String> l1= new ArrayList();
		  l1.add("Sonali");
		  l1.add("Deepali");
		  
		  map.put("name", l1);
		  System.out.println(map);
		  
		  for(Map.Entry<String,List<String>> m1:map.entrySet())
		  {
			  List<String> l2=m1.getValue();
			  
			  for(String s:l2)
			  {
				  
				  System.out.println(s);
			  }
		  }
		  
		
	}

}
