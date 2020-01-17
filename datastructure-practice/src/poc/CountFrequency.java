package poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArr = { 'z','a', 'a', 'b', 'b', 'b','z','a' };

		List<Character> list = new ArrayList();

		for (int i = 0; i < charArr.length; i++) {
			char data = charArr[i];

			if (list.contains(data)) {
				continue;
			}

			list.add(data);
			int count = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (data == charArr[j]) {
					count++;
				}
			}
			System.out.println("Count of\t" + data + "\t" + count);
		}
		Map<Character,Integer>map=new HashMap();
		for(int i=0;i<charArr.length;i++) {
			char data=charArr[i];
			if(map.containsKey(data)) {
				int count=map.get(data);
				map.put(data,++count);
			}else {
				map.put(data,1);
			}
		}
		System.out.println(map);

	}

}
