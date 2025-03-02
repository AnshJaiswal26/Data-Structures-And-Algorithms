package DSA.Step3Arrays.Medium;
import java.util.*;
public class A6NextPermutation {
	public static void main(String args[]) {
	
	ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,2,1));
	int s= arr.size();
	
	ArrayList<Integer> ans = Permutation(arr,s);
	
	for(int val: ans ) {
		System.out.print(val+" ");
	 }
    }
	
	public static ArrayList<Integer> Permutation(ArrayList<Integer> arr ,int s){
		
		int index=-1;
		for(int i=s-2;i>=0;i--) {
			if(arr.get(i)<arr.get(i+1)) {
				index=i;
				break;
			}
		}
		
		if(index==-1) {
			Collections.reverse(arr);
			return arr;
		}
		
		for(int i=s-1;i>index;i--) {
			if(arr.get(i)>arr.get(index)) {
				int temp = arr.get(i);
				arr.set(i, arr.get(index));
				arr.set(index, temp);
				break;
			}
		}
		
	    List<Integer> sublist = arr.subList(index+1, s);
	    Collections.reverse(sublist);
	    
	    return arr;
	}
}
