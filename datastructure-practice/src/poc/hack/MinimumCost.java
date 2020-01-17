package poc.hack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Find the minimum cost from the given cost in 2-d Array
 * @Condition: if you select column index 0 then immediate next
 * iteration you should choose other than 0 index
 * */
public class MinimumCost {
	public static void main(String[] args) {
		int arr[][]= {
				{2,1,100},
				{100,10,20}
		};
		Result r1=new Result();
		r1.sum=2;
		r1.index=0;
		Result r2=new Result();
		r2.sum=1;
		r2.index=1;
		Result r3=new Result();
		r3.sum=100;
		r3.index=2;
		for(int i=1;i<arr.length;i++) {
			r1=calculate(arr[i],r1);
			r2=calculate(arr[i],r2);
			r3=calculate(arr[i],r3);
		}
		List<Result>list=new ArrayList<>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		System.out.println(list);
		Optional<Result>min=list.stream().min(Comparator.comparingInt(Result::getSum));
		System.out.println(min);
		
		Result result=list.stream().min((x,y)->x.sum-y.sum).get();
		System.out.println(result);
		
		Integer minimum =list.stream().map(r->r.getSum()).min((x,y)->x-y).get();
		List<Integer>l=list.stream().map(r->r.sum).collect(Collectors.toList());
		System.out.println(minimum);
	}
	
	public static Result calculate(int[] row,Result r) {
		switch(r.index) {
		case 0:
			if(row[1]<row[2]) {
				r.sum=r.sum+row[1];
				r.index=1;
			}else {
				r.sum=r.sum+row[2];
				r.index=2;
			}
			break;
		case 1:
			if(row[0]<row[2]) {
				r.sum=r.sum+row[0];
				r.index=0;
			}else {
				r.sum=r.sum+row[2];
				r.index=2;
			}
			break;
		case 2:
			if(row[1]<row[0]) {
				r.sum=r.sum+row[1];
				r.index=1;
			}else {
				r.sum=r.sum+row[0];
				r.index=0;
			}
			break;
		}
		return r;
	}
}

class Result{
	public Integer sum;
	public Integer index;
	
	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return String.format("Result [sum=%s, index=%s]", sum, index);
	}
	
	
	
}
