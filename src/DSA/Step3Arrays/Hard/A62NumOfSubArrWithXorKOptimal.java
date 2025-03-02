package DSA.Step3Arrays.Hard;
import java.util.*;
public class A62NumOfSubArrWithXorKOptimal {
	public static void main(String args[]) {
		int [] arr = {4, 2, 2, 6, 4};
		int s = arr.length;
		int k=6;
		
		Map<Integer,Integer> mpp = new HashMap<>();
		int Xor=0;
		int frontXor=0;
		int count=0;
		mpp.put(0,1);
		
		for(int i=0;i<s;i++) {
			
			Xor = Xor^arr[i];
			
			frontXor = Xor^k;
			
			count=count+mpp.getOrDefault(frontXor,0);
			
		    mpp.put(Xor,mpp.getOrDefault(Xor, 0)+1);
			
		}
		System.out.print(count);
		
	}

}
