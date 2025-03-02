package DSA.Step2SortingTechniques;
import java.util.Scanner;
class SelectionSort {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		
		int s,temp=0,min;
		System.out.print("Enter size of an array = ");
		s=Sc.nextInt();
		
		int[] arr=new int[s];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
