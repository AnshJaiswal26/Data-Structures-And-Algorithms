package DSA.Step3Arrays.Medium;

public class A33MajorityElementNby2Optimal {
	public static void main(String args[]) {
		
	int[] arr= {7,7,5,2,7,7,2,2,7,7,6,3,7};
	int s = arr.length;
	int el=0,count=0;
	
	for(int i=0;i<s;i++) {
		if(count==0) {
			el=arr[i];
			count++;
		}
		else if(arr[i] == el) {
			count++;
		}
		else {
			count--;
		}
	}
	int count1=0;
	for(int i=0;i<s;i++) {
		if(el==arr[i]) {
			count1++;
		}
	 }
	
	if(count1>s/2) {
		System.out.print(el);
	}
	}

}
