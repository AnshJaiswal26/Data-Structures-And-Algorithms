package Java_Concepts.ExceptionHandling.Unchecked;

public class StackTrace {
	static void method3() {
		int[] arr = new int[5];
		arr[5] = 5;
	}
	
	static void method2() {
		method3();
	}
	
	static void method1() {
		method2();
	}
	
	public static void main(String args[]) {
        try {
	       method1();
		}catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}
}
