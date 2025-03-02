package DSA.Step3Arrays.Hard;

public class A83Merge2SortedArrOptimal2 {
	static void swap(int[] arr1, int[] arr2, int p1, int p2) {
		if(arr1[p1]>arr2[p2]) {
		int temp = arr1[p1];
		arr1[p1]=arr2[p2];
		arr2[p2]=temp;
		}
	}
	public static void main(String args[]) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,6,8,9};
		
		int as1=arr1.length;
		int as2=arr2.length;
		int l = as1+as2;
		
		int gap = (l/2)+1;
		
		while(gap > 0){
			int p1=0;
			int p2 = p1+gap;
			
			while(p2<l) {
				if(p1<as1 && p2>=as1) {
					swap(arr1,arr2,p1,p2-as1);
				}
				else if(p1>=as1) {
					swap(arr2,arr2,p1-as1,p2-as1);
				}
				else {
					swap(arr1,arr1,p1,p2);		
				}
				p1++;
				p2++;
			}
			if(gap==1) break;
			gap = (gap/2)+(gap%2);
		}
		
		for(int i=0;i<as1;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<as2;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
