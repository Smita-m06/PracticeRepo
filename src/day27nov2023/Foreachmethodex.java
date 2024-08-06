package day27nov2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Foreachmethodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Map<String,List<String>>> m1=new HashMap();
		
		   Map<String,List<String>> map= new HashMap();
		         List<String> l1= new ArrayList<>();
		                l1.add("Cyber");
		                l1.add("Success");
		     
		                
		     map.put("Name", l1);
		     m1.put(1, map);
		     System.out.println(m1);
		     
		    m1.forEach((key,val)->{
		    	
		    	map.forEach((k,v)->{
		    		l1.forEach((val1)->{
		    		System.out.println(val1);
		    	});
		    		
		    	});
		    });
		    /* {
		    	Map<String,List<String>> m4= mp.getValue();
		    	for(Map.Entry<String,List<String>> m:m4.entrySet())
		    	{	
		    	               List<String> l=m.getValue();
		    	               
		    	 for(String list: l)
		    	 {
		    		System.out.println(list); 
		    		
		    	 }
		    	               //System.out.println(Value);
		    	 
		     }*/
		     


	}

}
