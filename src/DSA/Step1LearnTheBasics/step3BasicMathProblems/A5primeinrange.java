package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class Primeinrange {
	public static void main(String [] args) {
		Scanner Sc=new Scanner(System.in);
		
		int r1,r2,c=0;
		System.out.println("Enter Range = ");
		r1=Sc.nextInt();
		System.out.println(" to ");
		r2=Sc.nextInt();
		
		for(int i=2;i<=r2;i++) {
			int n=i;
			for(int j=2;j<=n/2;j++) {
		       if(i%j==0) {
		    	   c++;
		       }
		
	   }
			if(c==0) {
			System.out.print(i+" ");
			} 
			c=0;
		}
   }
}
