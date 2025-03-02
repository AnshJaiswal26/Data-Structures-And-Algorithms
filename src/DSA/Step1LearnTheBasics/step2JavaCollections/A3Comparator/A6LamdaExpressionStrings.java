package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;

import java.util.ArrayList;
import java.util.Arrays;

//Lamda expression only works in java 8 or above
public class A6LamdaExpressionStrings {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("mango","apple","orange","banana"));
		list.sort(null);// by default sort based on alphabets in ascending order
		System.out.println(list);
		
		list.sort((a,b)-> b.compareTo(a));//sort based on alphabets in descending order
		System.out.println(list);
		
		list.sort((a,b)-> a.length()-b.length());//sort based on length in descending order
		System.out.println(list);
		
		list.sort((a,b)-> b.length()-a.length());//sort based on length in descending order
		System.out.print(list);
	}
}
