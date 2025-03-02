package DSA.Step2SortingTechniques;
import java.util.Scanner;
class QuickSort {
	public static void main(String args[]) {
		
		Scanner Sc= new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of an array = ");
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		System.out.print("Enter elements = ");
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
		
		QuickSort qs=new QuickSort();
		qs.quickSort(arr,0,s-1);
		
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pidx=partition(arr,low,high);
			
			quickSort(arr,low,pidx-1);
			quickSort(arr,pidx+1,high);
		}
	}
	
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
		if(arr[j]<pivot) {
			i++;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
		
		
	}

}
