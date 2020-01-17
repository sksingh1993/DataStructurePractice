package poc.java8;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>gender=Optional.of("Male");
		String ans1="Yes";
		String ans2=null;
		System.out.println(gender);
		System.out.println(gender.get());
		Optional<Object> t=Optional.empty();
		System.out.println(Optional.empty());
		Optional<String> s=Optional.ofNullable(ans1);
		System.out.println(s);
		System.out.println(Optional.ofNullable(ans1).get());
		System.out.println(Optional.ofNullable(ans2));

	}

}
