package poc.hack;
/*
 * Calculate the number of iteration to complete your task.
 * Suppose you are standing in a queue of movie ticket,
 * @input: you have given number of ticket required to each one,
 * and your position in the queue, queue index start from 0
 * @Condtion:You will be get only one ticket on counter,
 * if you need more then you have to go back to last of the queue and wait your turn. 
 * */
public class QueueWaiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number of ticket required to each person
		int arr[]= {3,1,3,5,6,1,2};
		//your position in queue
		int index=0;
		int tern=0;
		if(index!=(arr.length-1)) {
			int temp=arr[index]-1;
			tern+=index+1;
			
			for(int i=index;i>=0;i--) {
				int t=arr[i]-1;
				if(t>temp) {
					tern+=temp;
				}else {
					tern+=t;
				}
			}
			for(int j=index+1;j<arr.length;j++) {
				if(arr[j]>temp) {
					tern+=temp;
				}else {
					tern+=arr[j];
				}
			}
		}else {
			for(int i=index;i>=0;i--) {
				int temp=arr[index];
				if(arr[i]>temp) {
					tern+=temp;
				}else {
					tern+=arr[i];
				}
			}
		}
		System.out.println(tern);

	}

}
