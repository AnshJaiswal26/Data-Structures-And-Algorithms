package DSA.Step2SortingTechniques;
import java.util.Scanner;
class BubbleSort {

	public static void main(String [] args) {
		Scanner Sc= new Scanner (System.in);
		int s,temp;
		System.out.print("enter the size of an array = ");
		s=Sc.nextInt();
		
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
	
		for(int i=0;i<arr.length;i++) {
			{
				int flag=0;
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=1;
					}			
				}
				if(flag==0) {
					break;
				}
			}	
		}
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");;
		}
	
	}
}
