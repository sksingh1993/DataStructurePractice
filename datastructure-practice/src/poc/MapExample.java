package poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*     Test cases:   
 * input D: output   1,2,3,4,5,6,7,8,
 * input A: output   1,2,3
 * input B: output   4,5,6,7
 * input C: output   6,7
 * */
public class MapExample {
	private static Map<String,List<String>>map=new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="B 4 5 C-A 1 2 3-C 6 7-D A B 8";
		storeInMap(str);
		System.out.println(map);
		find("B");

	}
	private static void find(String key) {
		if(key.matches("[0-9]")) {
			System.out.print(key+",");
		}else {
			List<String>list=map.get(key);
			for(int i=0;i<list.size();i++) {
				find(list.get(i));
			}
		}
	}
	private static void storeInMap(String str) {
		String[] stArr=str.split("-");
		List<Object> list=new ArrayList();
		list.add(1);
		list.add("K");
		for(int i=0;i<stArr.length;i++) {
			String[] tempArr=stArr[i].split(" ");
			List<String>tempList=new ArrayList();
			for(int j=1;j<tempArr.length;j++) {
				tempList.add(tempArr[j]);
			}
			map.put(tempArr[0],tempList);
		}
	}
}
