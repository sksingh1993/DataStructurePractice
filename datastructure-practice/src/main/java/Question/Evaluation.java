package Question;

import java.util.Stack;

public class Evaluation {
	public void infixEvaluation(String expression) {
		Stack<Character>operator=new Stack<Character>();
		Stack<Character>operand=new Stack<Character>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sksingh";
		happyLadybugs("RBY_YBR");
		

	}
	 static void happyLadybugs(String b) {
	        int[] ascii=new int[26];
	        boolean isUnique=false;
	        boolean isHappy=false;
	        System.out.println(b.length());
	        for(int i=0;i<b.length();i++){
	            char c=b.charAt(i);
	            if(c!='_'){
	                ascii[(int)c-65]++;
	            }
	        }
	         for(int i=0;i<26;i++){
	            System.out.print(ascii[i]+" ,");
	        }
	 }

}
