package poc;
@FunctionalInterface
public interface FuncInterface {
	void square(int a);
	
	default void d() {
		System.out.println("Defaults");
	}
	
	static void s() {
		System.out.println("Static");
	}

}
