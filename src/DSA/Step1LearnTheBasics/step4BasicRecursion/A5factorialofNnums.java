package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A5factorialofNnums {
	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		int n;
		n=Sc.nextInt();
		
		A5factorialofNnums sn= new A5factorialofNnums();
		sn.factofn(n,1);
		
	}
	public void factofn(int i,int fact) {
		if(i==0) {
			System.out.print(fact);
			return;
		}
		factofn(i-1,fact*i);
		
	}

}
