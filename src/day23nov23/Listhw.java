package day23nov23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listhw {
	public static void main(String[] ar)
	{
		List<Map<String,Map<String, List<Object>>>> l1= new ArrayList<>();
		
		  Map<String,Map<String,List<Object>>> map1= new HashMap<>();
		  
		  Map<String,List<Object>> map2= new HashMap<>();
		       
		      List<Object> lo=new ArrayList<>();
		           lo.add(10);
		           lo.add("Smita");
		           
		           List<Object> lo1=new ArrayList<>();
		           lo1.add(20);
		           lo1.add("Ayush");
	
		           
		           map2.put("aa", lo);
		           map2.put("bb", lo1);
		           map1.put("ccc", map2);
		           
		           l1.add(map1);
		           System.out.println(l1);
		           
		           for(Map<String,Map<String, List<Object>>> m1:l1)
		           {
		        	   for(Map.Entry<String, Map<String, List<Object>>> m2:m1.entrySet())
		        	   {
		        		   
		        		   Map<String, List<Object>> val= m2.getValue();
		        		   
		        		   for(Map.Entry<String, List<Object>> val1 : val.entrySet())
		        		   {
		        			   List<Object> val2= val1.getValue();
		        			   
		        			   for(Object obj:val2)
		        			   {
		        				   
		        				   System.out.println(obj);
		        			   }
		        		   }
		        		   
		        	   }
		           }
		           
		
	}
		// TODO Auto-generated method stub

	}


