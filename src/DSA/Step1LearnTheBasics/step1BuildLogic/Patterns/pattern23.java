package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern23 {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		
		int num,c=0;
		System.out.print("Enter rows = ");
		num=Sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				
			for(int j=1;j<=3;j++) {
				c++;
				System.out.print(c+" ");
				
			}
			}
			else {
			for(int j=3;j>=1;j--) {	
					System.out.print(c+" ");
				c--;
			 }
			}
			c=c+3;
			System.out.println("");
		}
	}

}
