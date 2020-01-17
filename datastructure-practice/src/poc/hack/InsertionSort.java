package poc.hack;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,4,3,5,6,2};
		int n=6;
		for(int i=0;i<n-1;i++) {
			if(arr[i+1]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				for(int j=0;j<n;j++) {
					System.out.print(arr[j]+" ");
				}
			}
			
			System.out.println();
		}
	}

}
