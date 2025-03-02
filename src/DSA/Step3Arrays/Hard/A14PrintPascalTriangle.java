package DSA.Step3Arrays.Hard;
import java.util.*;
public class A14PrintPascalTriangle {
	public static void main(String args[]) {
      Scanner Sc = new Scanner(System.in);
		 
		
		int r;
		r=Sc.nextInt();
		 
		List<List<Integer>> Pascal =new ArrayList<>(r);
		
		for(int i=1;i<=r;i++) {
			int ans=1;
			List<Integer> temp =new ArrayList<>(i);
			
		 for(int c=1;c<=i;c++) {	
			temp.add(ans);
			ans=ans*(i-c);
			ans=ans/c;
			
		 }
		 Pascal.add(i-1,temp);
		}
		
		for(List<Integer> row: Pascal) {
			
			System.out.println(row+" ");
		}
	}

}
