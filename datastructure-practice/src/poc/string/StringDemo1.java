package poc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {65,67,69,95,91,97,2000};
		String str=new String(arr,1,6);
		System.out.println(str);
		
		String s1="abcdDCBA";
		System.out.println(s1.codePointAt(0)+"\t"+s1.codePointAt(s1.length()-1));
		System.out.println(s1.codePointCount(0, s1.length()));
		System.out.println("aa".compareTo("ba"));
		System.out.println(s1.hashCode());
		String s2="ababkkbcbcaabc";

	}

}
