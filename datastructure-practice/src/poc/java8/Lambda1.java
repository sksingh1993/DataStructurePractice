package poc.java8;

public class Lambda1 {
	public static void main(String args[]) {
		Drawable d=()->System.out.println("Hello Python world!");
		
		d.draw();
		d.m1();
		System.out.println(d.add(1, 2));
	}
}
@FunctionalInterface
interface Drawable{
	void draw();
	default void m1() {
		System.out.println("without argument");
	}
	default int add(int a,int b) {
		return a+b;
	}
	
}
