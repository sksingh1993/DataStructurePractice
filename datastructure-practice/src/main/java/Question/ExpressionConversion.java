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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionConversion ec=new ExpressionConversion();
		//System.out.println(ec.isOperator('*'));
		System.out.println("PostFix expression of :*-A/BC-/AKL : is :"+ ec.preFixToPostFix("*-A/BC-/AKL"));
		System.out.println("PreFix expression of :ABC/-AK/L-* : is :"+ec.postFixToPreFix("ABC/-AK/L-*"));
		System.out.println("InFix expression of :ABC/-AK/L-* : is :"+ec.postFixToInFix("ABC/-AK/L-*"));
		System.out.println("InFix expression of :*-A/BC-/AKL : is :"+ec.preFixToInFix("*-A/BC-/AKL"));

	}

}
