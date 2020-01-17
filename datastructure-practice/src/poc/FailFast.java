package poc;

import java.util.HashSet;
import java.util.Set;

public class FailFast {
	
	public static void main(String[] args) {
		Set<String> ts=new HashSet();
		ts.add("1");
		ts.add("a");
		System.out.println(ts);
	}

}
