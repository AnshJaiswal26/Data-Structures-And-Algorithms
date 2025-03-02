package DSA.Step3Arrays.Hard;

public class A81Merge2SortedArrBrute {
	public static void main(String args[]) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,6,8,9};
		
		int a1=arr1.length;
		int a2=arr2.length;
		
		
		int[] arr3 = new int[a1+a2]; 
		int p1 = 0;
		int p2 = 0;
		int index = 0;
		
		while(p1<a1 && p2<a2) {
				if(arr1[p1]<=arr2[p2] ) {	
					
					arr3[index]= arr1[p1];
					p1++;
					index++;
			}
				else{
					arr3[index]= arr2[p2];
					p2++; 
					index++;
				
			}
		}
		
		while(p1<a1) {
			arr3[index]= arr1[p1];
			p1++; 
			index++;
		}
		
		while(p2<a2) {
			arr3[index]= arr2[p2];
			p2++; 
			index++;
		}
		
		for(int i=0;i<(a1+a2);i++) {
			if(i<a1) arr1[i]=arr3[i];
			else arr2[i-a1]=arr3[i];
		}
		
		for(int i=0;i<a1;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<a2;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
