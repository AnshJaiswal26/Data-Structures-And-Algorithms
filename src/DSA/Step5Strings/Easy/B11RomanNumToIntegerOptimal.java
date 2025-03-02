package DSA.Step5Strings.Easy;

class RP{
	
	char ch;
	int num;
	
	int rp(char ch){
		switch(ch)
		{
			case 'I' : return  1;
			case 'V' : return  5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;
			default  : return 0;
		}
//		OR
//		RP(char ch){
//		if(ch=='I' || ch=='i') {
//			this.ch = 'I';
//			this.num = 1;
//		}
//		else if(ch=='V' || ch=='v'){
//			this.ch = 'V';
//			this.num = 5;
//		}
//		else if(ch=='X' || ch=='x'){
//			this.ch = 'X';
//			this.num = 10;
//		}
//		else if(ch=='L' || ch=='l'){
//			this.ch = 'L';
//			this.num = 50;
//		}
//		else if(ch=='C' || ch=='c'){
//			this.ch = 'C';
//			this.num = 100;
//		}
//		else if(ch=='I' || ch=='i'){
//			this.ch = 'I';
//			this.num = 500;
//		}
//		else if(ch=='M' || ch=='m'){
//			this.ch = 'M';
//			this.num = 1000;
//		}
//	}
	}	
}
	
public class B11RomanNumToIntegerOptimal {
	static int Convert(String s) {
		RP r = new RP();
		if(s.length() == 1) {
			return r.rp(s.charAt(0));	
		}
		
		int num = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
//			char ch1 = s.charAt(i+1);
//		    OR
//			RP rp = new RP(ch);
//			RP rp1 = new RP(s.charAt(i-1));
//			
//			if(rp1.num>=rp.num) {
//				num+=rp1.num;
//			}
//			else if(rp1.num<rp.num) {
//				num-=rp1.num;
//			}
//			
//			if(i == s.length()-1) {
//				num+=rp.num;
//			}
//		}
//		OR
			if((i+1)<s.length() && r.rp(ch)<r.rp(s.charAt(i+1))) {
				num-=r.rp(ch);
			}
			else {
				num+=r.rp(ch);
			}
			
//			if(i == s.length()-1) {
//				num+=r.rp(ch);
//			}
	    }
		return num;
	}
	public static void main(String args[]) {
		String s = "MCMXCIV";
		int ans = Convert(s);
		System.out.print(ans);
	}
}

