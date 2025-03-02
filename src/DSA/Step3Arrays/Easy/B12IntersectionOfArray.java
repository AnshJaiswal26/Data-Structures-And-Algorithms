package DSA.Step3Arrays.Easy;
import java.util.Scanner;
import java.util.ArrayList;
public class B12IntersectionOfArray {
	public static void main(String args[]) {
		Scanner Sc= new Scanner(System.in);
		int s1,s2;
		System.out.print("enter size of arr1 = ");
		s1=Sc.nextInt();
		
		System.out.print("enter elements of arr1 = ");
		int [] arr1 = new int[s1];
		for(int i=0;i<s1;i++) {
			arr1[i] = Sc.nextInt();
		}
		
		System.out.print("enter size of arr2 = ");
		s2=Sc.nextInt();
		
		System.out.print("enter elements of arr2 = ");
		int [] arr2 = new int[s2];
		for(int i=0;i<s2;i++) {
			arr2[i] = Sc.nextInt();
		}
		
		ArrayList<Integer> Intersection = FindIntersection(arr1,arr2,s1,s2);
		
		System.out.print("Intersection of arr1 and arr2 = ");
		for(int val : Intersection) {
			System.out.print(val+" ");
		}
		
	}
	
	public static ArrayList<Integer> FindIntersection(int arr1[],int arr2[],int s1,int s2){
		ArrayList<Integer> Intersection = new  ArrayList<>();
		int i=0,j=0;
		while(i<s1 && j<s2) {
		if(arr1[i]<arr2[j]) {
			i++;
		}
		else if(arr1[i]>arr2[j]) {
			j++;
		}
		else {
			Intersection.add(arr1[i]);
			i++;
			j++;
		}
	  }
		return Intersection;
	}
// 5 2 4 1 
// 2 5 3 6
}
