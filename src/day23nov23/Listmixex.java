package day23nov23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listmixex {

	public static void main(String[] args) {
		
		List<Map<String,Set<String>>> l1=new ArrayList<>();
		
		  Map<String,Set<String>> m1=new HashMap<>();
		  
		    Set<String> s1= new HashSet<>();
		    
		       s1.add("Cyber");
		       s1.add("Success");
		       
		      Set<String> s2=new HashSet();
		       s2.add("hi");
		       s2.add("asdf");
		       
		       Set<String> s3=new HashSet();
		       s3.add("aaa");
		       s3.add("abbb");
		  
		       
		       m1.put("Institute", s1);
		       m1.put("class", s2);
		       m1.put("company", s3);
		       System.out.println(m1);
		       l1.add(m1);
		       
		       System.out.println(l1);
		       
		       for(Map<String,Set<String>> var:l1){
		    	   
		    	   for(Map.Entry<String,Set<String>> mapobj:var.entrySet()){
		    		   String key= mapobj.getKey();
		    		   Set<String> set=mapobj.getValue();
		    		   
		    		  // System.out.println(key+":"+val);
		    		   
		    		   for(String values :set)
		    		   {
		    			   //System.out.println(values);
		    			   System.out.print(key+":"+values);
		    			   System.out.println();
		    		   }
		    	   }

		       }
		       
		      /* for(Map.Entry<String, Set<String>> map1obj: m1.entrySet())
		       {
		    	   
		    	   
		       }*/
		    
		  
		// TODO Auto-generated method stub

	}

}
