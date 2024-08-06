package dat22nov23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapinsidemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Map<String,String>> m1=new HashMap();
		
		   Map<String,String> map= new HashMap();
		    map.put("Good", "Morning");
		    map.put("Best", "Eve");
		     
		     m1.put(1, map);
		     System.out.println(m1);
		     
		    for(Map.Entry<Integer,Map<String,String>> mp:m1.entrySet())
		     {
		    	Map<String,String> m4= mp.getValue();
		    	for(Map.Entry<String,String> m:m4.entrySet())
		    	{	
		    	               String Value=m.getValue();
		    	 /*for(String l: value)
		    	 {
		    		System.out.println(l); 
		    		
		    	 }*/
		    	               System.out.println(Value);
		    	 
		     }
		     }
	}

}
