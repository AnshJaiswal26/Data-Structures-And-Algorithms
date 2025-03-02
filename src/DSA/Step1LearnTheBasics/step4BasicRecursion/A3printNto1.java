package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A3printNto1 {
	public static void main(String [] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		int n;
		n=Sc.nextInt();
		
		A3printNto1 pr=new A3printNto1();
		pr.Nto1(1,n);
		
	}
	
	public void Nto1(int i,int n) {
		if(n==i-1) {
			return;
		}
		System.out.println(n);
		Nto1(i,n-i);
	}

}

