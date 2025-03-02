package DSA.Step4BinarySearch.Medium;
import java.util.*;
public class A51NthRootOfAnIntegerBrute {
	static int Root(int m,int i) {
		int j=1,x=i;
		while(j<m) {
			i=i*x;
			j++;
		}
		return i;
	}
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int n=4;
		
		int m;
		m=Sc.nextInt();
		
		int ans=-1;
		
		for(int i=1;i<n;i++) {
			if(Root(m,i)==n) {
				ans = i;
				break;
			}
			else if(Root(m,i)>n){
				break;
			}
		}
		
		System.out.print(ans);
	}

}
