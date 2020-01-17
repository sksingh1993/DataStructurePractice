package poc;

import java.util.Scanner;

public class PrintInDiagonalPattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int data=0;
		for(int i=0;i<n;i++) {
			a[0][i]=++data;
			int j=1;
			int k=i-1;
			while(!(j<0||j>=n||k>=n||k<0)) {
				a[j][k]=++data;
				j++;
				k--;
			}
		}
		for(int i=1;i<n;i++) {
			a[i][n-1]=++data;
			int j=i+1;
			int k=n-2;
			while(!(j<0||j>=n||k>=n||k<0)) {
				a[j][k]=++data;
				j++;
				k--;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}

	}

}
