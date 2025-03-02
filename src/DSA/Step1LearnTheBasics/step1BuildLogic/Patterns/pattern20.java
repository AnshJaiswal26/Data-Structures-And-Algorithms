package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pttern20 {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		
		int num,c=0;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num*2-(num*2-i*2-1);j++) {
				if(j<=i) {
				System.out.print(j+1+" ");
				c=j+1;
				}
				else {
					c--;
					System.out.print(c+" ");
				}
			}
			System.out.println("");
		}
	} 

}
