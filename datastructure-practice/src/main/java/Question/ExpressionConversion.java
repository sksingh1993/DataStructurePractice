package Question;

import java.util.Stack;

public class ExpressionConversion {
	
	public boolean isOperator(char c) {
		switch(c) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
		return true;
		}
		return false;
	}
	public int precedence(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default :
			return -1;
		}
	}
	public String preFixToPostFix(String expression) {
		Stack<String>stack=new Stack<String>();
		for(int i=expression.length()-1;i>=0;i--) {
			char c=expression.charAt(i);
			if(isOperator(c)) {
				String exp1=stack.pop();
				String exp2=stack.pop();
				String exp=exp1+exp2+c;
				stack.push(exp);
			}else {
				stack.push(c+"");
			}
		}
		return stack.pop();
	}
	public String postFixToPreFix(String expression) {
		Stack<String>stack=new Stack<String>();
		for(int i=0;i<expression.length();i++) {
			char c=expression.charAt(i);
			if(isOperator(c)) {
				String exp1=stack.pop();
				String exp2=stack.pop();
				String exp=c+exp2+exp1;
				stack.push(exp);
			}else {
				stack.push(c+"");
			}
		}
		return stack.pop();
	}
	
	public String postFixToInFix(String expression) {
		Stack<String>stack=new Stack<String>();
		for(int i=0;i<expression.length();i++) {
			char c=expression.charAt(i);
			if(isOperator(c)) {
				String exp1=stack.pop();
				String exp2=stack.pop();
				String exp="("+exp2+c+exp1+")";
				stack.push(exp);
			}else {
				stack.push(c+"");
			}
		}
		return stack.pop();
	}
	public String preFixToInFix(String expression) {
		Stack<String>stack=new Stack<String>();
		for(int i=expression.length()-1;i>=0;i--) {
			char c=expression.charAt(i);
			if(isOperator(c)) {
				String exp1=stack.pop();
				String exp2=stack.pop();
				String exp="("+exp1+c+exp2+")";
				stack.push(exp);
			}else {
				stack.push(c+"");
			}
		}
		return stack.pop();
	}
	public String inFixToPostFix(String expression) {
		StringBuffer sb=new StringBuffer();
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
			char c=expression.charAt(i);
			if(precedence(c)>0) {
				while(!stack.isEmpty() && precedence(stack.peek())>precedence(c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}else if(c=='(') {
				stack.push(c);
			}else if(c==')') {
				while(!stack.isEmpty()) {
					char temp=stack.pop();
					if(temp=='(') {
						break;
					}else {
						sb.append(temp);
					}
					
				}
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
	
	public String inFixToPreFix(String expression) {
		StringBuffer input=new StringBuffer(expression);
		//System.out.println("Input String Buffer"+input);
		input.reverse();
		//System.out.println("Reversed String Buffer"+input);
		char[] charArray=input.toString().toCharArray();
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(c=='(') {
				charArray[i]=')';
			}else if(c==')') {
				charArray[i]='(';
			}
		}
		expression=String.copyValueOf(charArray);
		//System.out.println(input);
		//System.out.println(expression);
		return new StringBuffer(inFixToPostFix(expression)).reverse().toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionConversion ec=new ExpressionConversion();
		//System.out.println(ec.isOperator('*'));
		System.out.println("PostFix expression of :*-A/BC-/AKL : is :"+ ec.preFixToPostFix("*-A/BC-/AKL"));
		System.out.println("PreFix expression of :ABC/-AK/L-* : is :"+ec.postFixToPreFix("ABC/-AK/L-*"));
		System.out.println("InFix expression of :ABC/-AK/L-* : is :"+ec.postFixToInFix("ABC/-AK/L-*"));
		System.out.println("InFix expression of :*-A/BC-/AKL : is :"+ec.preFixToInFix("*-A/BC-/AKL"));
		System.out.println("PostFix expression of :((A-(B/C))*((A/K)-L)) : is :"+ec.inFixToPostFix("((A-(B/C))*((A/K)-L))"));
		System.out.println("PreFix expression of :((A-(B/C))*((A/K)-L)) : is :"+ec.inFixToPreFix("((A-(B/C))*((A/K)-L))"));
	}

}
