package DSA.Step1LearnTheBasics.step5BasicHashing;
import java.util.Scanner;
import java.util.Arrays;
public class A1repeatelements {
	public static void main(String args[]) {
		
		Scanner Sc= new Scanner(System.in);
		
		int s;
		s=Sc.nextInt();
		
		int[] arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=Sc.nextInt();
		}
			
		int[] hash = new int[100];
		Arrays.fill(hash, 0);
		for(int i=0;i<s;i++) {
			hash[arr[i]]=hash[arr[i]]+1;		
			}
		
		int z;
		z=Sc.nextInt();
		while(z>=1) {
			int num;
			num=Sc.nextInt();
			
			System.out.print(hash[num]);
			z--;
		}
		
	}

}
