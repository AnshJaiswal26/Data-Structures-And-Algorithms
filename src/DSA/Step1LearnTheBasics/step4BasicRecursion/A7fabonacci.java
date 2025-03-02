package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A7fabonacci {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		int n;
		n=Sc.nextInt();
		
		A7fabonacci fc =new A7fabonacci();
		System.out.print(fc.fab(n)+" ");
		
	}
	    public static int  fab(int n) {
		if(n<=1) {
			return n;
		}
		int last=fab(n-1);
		int slast=fab(n-2);
		
		return last+slast;
	}

}
