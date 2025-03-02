package DSA.Step3Arrays.Hard;
import java.util.Scanner;
public class A12FindRowOfPascalTriangleBrute {
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
		
		int r;
		r=Sc.nextInt();
		
		A11FindNcRInMinTimeBrute ncr = new A11FindNcRInMinTimeBrute();
		for(int c=1;c<=r;c++) {		
			System.out.print(ncr.Ncr(r-1,c-1)+" ");
		}
		
	}

}
