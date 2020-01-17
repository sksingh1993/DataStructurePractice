package poc.java8;

public class DefaultMethodDemo implements A,B{
	public void m1() {
		System.out.println("Iml class method m1");
	}
	
	public void m2() {
		// TODO Auto-generated method stub
		A.super.m2();
	}
	
	public static void m3() {
		System.out.println("Iml class method m3");
	}
	public static void main(String args[]) {
		DefaultMethodDemo obj=new DefaultMethodDemo();
		obj.m1();
		obj.m2();
		A.m3();
		obj.m3();
	}

}

interface A{
	public abstract void m1();
	
	default void m2() {
		System.out.println("Default method of Intf A");
	}
	
	public static void m3() {
		System.out.println("Static method of Intf A");
	}
	
	
}

interface B{
	public abstract void m1();
	
	default void m2() {
		System.out.println("Default method of Intf B");
	}
	
	public static void m3() {
		System.out.println("Static method of Intf B");
	}
	
	
}