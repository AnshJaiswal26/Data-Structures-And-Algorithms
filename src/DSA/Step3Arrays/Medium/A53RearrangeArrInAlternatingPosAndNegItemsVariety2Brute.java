package DSA.Step3Arrays.Medium;
import java.util.*;
public class A53RearrangeArrInAlternatingPosAndNegItemsVariety2Brute {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,-1,5,-2));
		int s=arr.size();
		
		ArrayList<Integer> ans = ReaarrangBySign(arr,s);
		
		for(int val : ans) {
			System.out.print(val+" ");
		}
	}
	
	public static ArrayList<Integer> ReaarrangBySign(ArrayList<Integer> arr,int s){
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for(int i=0;i<s;i++) {
			if(arr.get(i)>=0) {
				pos.add(arr.get(i));
			}
			else {
				neg.add(arr.get(i));
				}
		}
		
		if(pos.size()<neg.size()) {
			for(int i=0;i<pos.size();i++) {
				arr.set(2*i,pos.get(i));
				arr.set(2*i+1, neg.get(i));
			}
			int index = pos.size()*2;
			for(int i=pos.size();i<neg.size();i++) {
				arr.set(index, neg.get(i));
				index++;
			}
		}
		else {
			for(int i=0;i<neg.size();i++) {
				arr.set(2*i,pos.get(i));
				arr.set(2*i+1, neg.get(i));
			}
			int index = neg.size()*2;
			for(int i=neg.size();i<pos.size();i++) {
				arr.set(index, pos.get(i));
				index++;
			}
		}
		return arr;
	}
}
