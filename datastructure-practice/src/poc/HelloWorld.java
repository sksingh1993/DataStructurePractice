package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HelloWorld {

	public static void main(String[] args) {
		String[] a= {
				"10101",
				"11100",
				"11010",
				"00101"
		};
		acmTeam(a);
	}
	static int[] acmTeam(String[] topic) {
		Map<Integer, Integer> map=new TreeMap();
		for(int k=0;k<topic.length-1;k++) {
			for(int i=k+1;i<topic.length;i++) {
				String str1=topic[k];
				String str2=topic[i];
				int count=0;
				for(int j=0;j<str1.length();j++) {
					char c1=str1.charAt(j);
					char c2=str2.charAt(j);
					if(c1!='0' || c2!='0') {
						count++;
					}
				}
				if(!map.containsKey(count)) {
					map.put(count, 1);
				}else {
					map.put(count,map.get(count)+1);
				}
				
				
			}
		}
		
		System.out.println(map);
		
		
		Set<Integer> set=map.keySet();
		System.out.println("set \t"+set);
		
		
		List<Integer> list=new ArrayList(set);
		System.out.println("list \t"+list);
		
		System.out.println(list.get(list.size()-1)+"\t"+map.get(list.get(list.size()-1)));
		
		return null;

    }
	
	static String[] cavityMap(String[] grid) {
        int len=grid.length;
        String[] resultGrid=new String[len];
        char[][] charMat=new char[len][len];
        for(int i=0;i<len;i++){
            char[] charArr=grid[i].toCharArray();
            for(int j=0;j<len;j++){
                charMat[i][j]=charArr[0];
            }
        }
        for(int i=1;i<len-1;i++)
        {
        for(int j=1;j<len-1;j++)
            {
            if(charMat[i][j]>charMat[i][j-1] && charMat[i][j]>charMat[i][j+1] && charMat[i][j]>charMat[i-1][j] && charMat[i][j]>charMat[i+1][j])
                {
                charMat[i][j]='X';
            }
        }
    }
    for(int i=0;i<len;i++){
        resultGrid[i]=String.valueOf(charMat[i]);
    }
        return resultGrid;

    }
	 
	
}
