package DSA.Step3Arrays.Hard;
import java.util.Scanner;
public class A13FindRowOfPascalTriangleBetter {

	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int r;
		r=Sc.nextInt();
		int ans=1;
		for(int c=1;c<=r;c++) {		
			System.out.print(ans+" ");
			ans=ans*(r-c);
			ans=ans/c;
		}
		
	}

}
