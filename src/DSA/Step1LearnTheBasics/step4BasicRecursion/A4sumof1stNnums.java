package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A4sumof1stNnums {
	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		int n;
		n=Sc.nextInt();
		
		A4sumof1stNnums sn= new A4sumof1stNnums();
		sn.sumofn(n,0);
		
	}
	public void sumofn(int i,int sum) {
		if(i<0) {
			System.out.print(sum);
			return;
		}
		sumofn(i-1,sum+i);
		
	}

}
