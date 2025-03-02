package DSA.Step3Arrays.Easy;
import java.util.Scanner;
import java.util.ArrayList;

public class B11UnionOfArray {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s1,s2;
		System.out.print("Enter the size of arr1 = ");
		s1=Sc.nextInt();
		
		int[] arr1 = new int[s1]; 
		for(int i=0;i<s1;i++) {
			arr1[i] = Sc.nextInt();
		}
		
		System.out.print("Enter the size of arr2 = ");
		s2=Sc.nextInt();
		
		int[] arr2 = new int[s2]; 
		for(int i=0;i<s2;i++) {
			arr2[i] = Sc.nextInt();
		}
		
		ArrayList<Integer> Union = FindUnion(arr1,arr2,s1,s2);
		
		System.out.print("Union of Arr1 and Arr2 is = ");
		for(int val : Union) {
			System.out.print(val+" ");
		}

	}
	
	public static ArrayList<Integer> FindUnion(int arr1[] ,int arr2[], int s1, int s2) {
		ArrayList<Integer> Union = new ArrayList<>();
		int i=0,j=0;
		
		while(i<s1 && j<s2) {
			if(arr1[i]<=arr2[j]) {
			    if(Union.size() == 0 || Union.get(Union.size()-1)!= arr1[i]) {
				    Union.add(arr1[i]);
			    }  
			    i++;
			}
			else {
				if(Union.size() == 0 || Union.get(Union.size()-1)!=arr2[j]) {
					Union.add(arr2[i]);
				}
				j++;
			}
		}
		while(i<s1) {
			if(Union.get(Union.size()-1)!=arr1[i]) {
			    Union.add(arr1[i]);
			}
			i++;
		}
		while(j<s2){
			if(Union.get(Union.size()-1)!=arr2[j]) {
				Union.add(arr2[j]);
			}
			j++;
		}
		
		return Union;
	}

}
