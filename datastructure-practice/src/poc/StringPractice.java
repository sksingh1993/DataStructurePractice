package poc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*------------------------Ascii code---------------
		String str="saks";
		int code=str.charAt(1);
		int a='b'-code;
		System.out.println(a);
		
		*/
		
		StringBuffer sb=new StringBuffer("abc");
		sb.append('z');
		String str="sks";
		int i=Integer.MIN_VALUE;
		 HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
		  
	        // Mapping string values to int keys 
	        hash_map.put(10, "Geeks"); 
	        hash_map.put(15, "4"); 
	        hash_map.put(20, "Geeks"); 
	        hash_map.put(25, "Welcomes"); 
	        hash_map.put(30, "You"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Using values() to get the set view of values 
	        System.out.println("The collection is: " + hash_map.values()); 
		Set<Integer>set=new HashSet(hash_map.values());
		List<Integer>list=new ArrayList();
		System.out.println(set);
		System.out.println(isValid("abbbaa"));
	}
	
	
	 static String isValid(String s) {
	        String str="YES";
	        Map<Character, Integer> map=new HashMap();
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            if(!map.containsKey(c)){
	                map.put(c,1);
	            }else{
	                int count=map.get(c);
	                count++;
	                map.put(c,count);
	                if(count>2){
	                    str="NO";
	                    break;
	                }
	            }
	        }
	    return str;

	    }
}
