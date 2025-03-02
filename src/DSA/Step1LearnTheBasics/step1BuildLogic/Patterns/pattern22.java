package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern22 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int num,c=0;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			 System.out.print(i+" ");
			 c=i;
			for(int j=num-1;j>num-i;j--){					
				c=c+j;
				System.out.print(c+" ");
				
			}
			System.out.println("");
		
		}
	}

}


