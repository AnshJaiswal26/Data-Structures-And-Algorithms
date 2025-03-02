package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A6reverseanarray {
	public static void main(String[] args ) {
		
		Scanner Sc= new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of an array = ");
		s=Sc.nextInt();
		
		int[] arr=new int[s];
		
		for(int i=0;i<s;i++) arr[i]=Sc.nextInt();
		
		A6reverseanarray rv=new A6reverseanarray();
		rv.reverse(0,arr,s);
		for(int i=0;i<s;i++) System.out.print(arr[i]+" ");
	}
	
	public void reverse(int i,int arr[],int s) {
		if(i>=s/2) {
			return;
		}
		int temp;
		temp=arr[i];
		arr[i]=arr[s-1-i];
		arr[s-1-i]=temp;
		reverse(i+1,arr,s);
		}
	
	
}
