package poc;

import java.util.HashMap;
import java.util.Map;

class Test{
	
	final int i;
	
	public Test(int i) {
		this.i=i;
	}
	
	public int get() {
		
		return i;
	}
	


}


public class SubTest extends Test{
	int i;
	public SubTest(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public int get() {
		return i;
	}
	
	public static void main(String[] args) {
		//Test st=new SubTest(5);
		
		Map<String,Integer>map=new HashMap();
		Object a=map.put("A",10);
		
		int b=map.put("A",20);
		System.out.println(a+"\t"+b);
		int x=3;
		int y=15;
		
		
		
	}
}
