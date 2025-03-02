package DSA.Step1LearnTheBasics.step4BasicRecursion;
import java.util.Scanner;
class A1printNtimes {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		int count=0;
		A1printNtimes rt=new A1printNtimes();
		rt.call(count);
		
	}
	
	public void call(int c) {
		if(c==5) {
			return;
		}
		System.out.println("aj");
		c++;
		call(c);
		
	}

}
