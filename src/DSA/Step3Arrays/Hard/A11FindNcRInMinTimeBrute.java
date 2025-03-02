package DSA.Step3Arrays.Hard;
import java.util.Scanner;
public class A11FindNcRInMinTimeBrute {
	
	static int Ncr(int N, int R) {
		int res =1;
		for(int i=0;i<R;i++) {
			res = res*(N-i);
			res = res/(i+1);	
		}
		
		return res;
	}
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int N;
		N = Sc.nextInt();
		
		int R;
		R = Sc.nextInt();
		
		A11FindNcRInMinTimeBrute ncr = new A11FindNcRInMinTimeBrute();
		
		
		System.out.print("Element is "+ncr.Ncr(N-1,R-1));
	}

}
