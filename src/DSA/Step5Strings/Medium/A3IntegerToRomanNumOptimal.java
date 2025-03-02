package DSA.Step5Strings.Medium;

public class A3IntegerToRomanNumOptimal {
	
	static String Convert(int num) {
		 int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
 		 String[] sym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
 		 
 		 String ans = "";
 		 for(int i=0;i<13;i++) {
 			 if(num == 0) break;
 			 
 			 int times = num/val[i];
 			  
 			 while(times>0) {
 				 ans+=sym[i];
 				 times--;
 			 }
 			 
 			 num = num%val[i];
 		 }
 		 
 		 return ans;
 	}
	public static void main(String args[]) {
		int  s = 1994;
		String ans = Convert(s);
		
		System.out.print(ans);
	}
}


