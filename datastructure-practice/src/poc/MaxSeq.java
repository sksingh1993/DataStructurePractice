package poc;

import java.util.ArrayList;
import java.util.List;

public class MaxSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,3,1,6,2};
		List<Integer>list=new ArrayList<>();
		list.add(1);
		for(int i=1;i<a.length;i++) {
			StringBuffer sb=new StringBuffer();
			int t=0;
			for(int j=0;j<=i;j++) {
				
				if(a[j]<=a[i]) {
					if(t<=a[j]) {
						sb.append(a[j]);
						t=a[j];
					}else {
						sb.deleteCharAt(sb.length()-1);
						sb.append(a[j]);
						t=a[j];
					}
					
				}
			}
			//System.out.println(sb);
			list.add(sb.length());
		}
		Object[] b=list.toArray();
		System.out.println(list);

	}

}
