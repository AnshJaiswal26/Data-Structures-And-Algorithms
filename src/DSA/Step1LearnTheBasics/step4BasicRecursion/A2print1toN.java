package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A2print1toN {
	public static void main(String [] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		int n;
		n=Sc.nextInt();
		
		A2print1toN pr=new A2print1toN();
		pr.onetoN(1,n);
		
	}
	
	public void onetoN(int i,int n) {
		if(i==n+1) {
			return;
		}
		System.out.println(i);
		onetoN(i+1,n);
	}

}
