package sorting;

public class MergeSort {
	void sort(int[] arr,int f,int l) {
		if(f<l) {
			int m=(f+l)/2;
			sort(arr, f,m);
			sort(arr,m+1,l);
			merge(arr,f,m,l);
		}
	}

	 void merge(int[] arr, int f, int m, int l) {
		// TODO Auto-generated method stub
		 int n1=m-f+1;
		 int n2=l-m;
		 int[] arr1=new int[n1];
		 int[] arr2=new int[n2];
		 for(int i=0;i<n1;i++) {
			 arr1[i]=arr[f+i];
		 }
		 for(int i=0;i<n2;i++) {
			 arr2[i]=arr[m+1+i];
		 }
		 
		 int i=0;
		 int j=0;
		 int k=f;
		 while(i<n1 && j<n2) {
			 if(arr1[i]<arr2[j]) {
				 arr[k++]=arr1[i++];
			 }else {
				 arr[k++]=arr2[j++];
			 }
		 }
		 while(i<n1) {
			 arr[k++]=arr1[i++];
		 }
		 while(j<n2) {
			 arr[k++]=arr2[j++];
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,1,2,7,3,4,6,5,8,0};
		System.out.println("UnSorted Array");
		printArray(arr);
		MergeSort obj=new MergeSort();
		obj.sort(arr, 0, arr.length-1);
		System.out.println("Sorted Array");
		printArray(arr);

	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
