package poc;

import java.util.Scanner;

public class LastPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int lastPrimeIndex=getPositionOfLastPrime(n);
		System.out.println(lastPrimeIndex);
		System.out.println(isPrime(n));
		
	}

	private static int getPositionOfLastPrime(int n) {
		// TODO Auto-generated method stub
		int lastPrimeIndex=0;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				lastPrimeIndex++;
			}
		}
		
		return lastPrimeIndex;
	}

	private static boolean isPrime(int i) {
		if(i==1 || i==0) {
			return false;
		}
		
		for(int j=2;j<=i/2;j++) {
			if(i%j==0)
				return false;
		}
		return true;
	}
	
	

}
