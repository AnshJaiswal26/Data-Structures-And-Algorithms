package DSA.Step2SortingTechniques;
import java.util.Scanner;
class MergeSort {
	
	public static void main(String [] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		int s;
		System.out.print("Enter the size of an array = ");
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		System.out.print("Enter the elements of an array = ");
		
		for(int i=0;i<s;i++) {
			arr[i]= Sc.nextInt();
		}
		
		MergeSort ss = new MergeSort();
		ss.divide(arr,0,s-1);
		
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void divide(int arr[],int start,int end ) {
		int mid;
		if(start>=end) {
			return;
		}
		mid=start+(end-start)/2;
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,mid,end);
		
	}
	
	public void merge(int arr[],int start,int mid,int end) {
		int[] temparr = new int[end-start+1];
		int left=start;
		int right=mid+1;
		int idx=0;
		
		while(left<=mid && right<=end) {
		if(arr[left]<=arr[right]) {
			temparr[idx]=arr[left];
			idx++;
			left++;
		}
		else{
			temparr[idx]=arr[right];
			idx++;
			right++;
		}
		}
		while(left<=mid) {
			temparr[idx]=arr[left];
			idx++;
			left++;
		}
		while(right<=end) {
			temparr[idx]=arr[right];
			idx++;
			right++;
		}
		for(int i=0,j=start;i<temparr.length;i++,j++) {
			arr[j]=temparr[i];
		}
	}

}
  