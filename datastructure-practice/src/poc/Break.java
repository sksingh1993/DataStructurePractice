package poc;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
		pq.add(4);
		pq.add(5);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.peek());
		String str="sksingh";
		System.out.println(str.contains(String.valueOf('s')));
		String[] strArr= {"basdfj","asdlkjfdjsa","bnafvfnsd","oafhdlasd"};
		System.out.println(gemstones(strArr));

	}
	
	
	
	
	static int gemstones(String[] arr) {
        int count=0;
        Set<Character>set=new HashSet();
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            
            for(int j=0;j<str.length();j++){
            	boolean flag=true;
                char c=str.charAt(j);
                if(set.contains(c))
                	continue;
                for(int k=0;k<arr.length;k++){
                   // if(i!=k){
                        if(!arr[k].contains(String.valueOf(c))){
                            flag=false;
                            break;
                        }
                   // }
                }
                if(flag){
                    count++;
                }
                set.add(c);
            }
        }
    return count;
    }

}
