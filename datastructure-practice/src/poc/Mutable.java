package poc;
public class Mutable extends Immutable {
     private int realValue;

     public Mutable(int value) {
         super(value);

         realValue = value;
     }

     public int getValue() {
         return realValue;
     }
     public void setValue(int newValue) {
         realValue = newValue;
     }

    public static void main(String[] arg){
		/*
		 * Mutable obj = new Mutable(4); Immutable immObj = (Immutable)obj;
		 * System.out.println(immObj.getValue()); obj.setValue(8);
		 * System.out.println(immObj.getValue());
		 */
    	B b=new B();
    	b.m1();
    	//b.m3();
    }
}

abstract class A{
	public abstract void m1();
	public abstract void m2();
	public void m3() {
		System.out.println("M3");
	}
}
class B implements I1,I2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1");
		
	}

	
	
}
interface I1{
	void m1();
}

interface I2{
	void m1();
}

