package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class A8FactorysMethodsOfComparator {
	public static void main(String args[]) {
		ArrayList<Students> list = new ArrayList<>();
		list.add(new Students(4.5,"bob"));
		list.add(new Students(6.4,"jack"));
		list.add(new Students(6.0,"alice"));
		list.add(new Students(5.5,"gresey"));
		
		// sort objects based on cgpa in ascending order
		Comparator<Students> comp = Comparator.comparing(Students::getcgpa);
		list.sort(comp);
		
		for(Students s : list) {
			System.out.print("["+s.getName()+","+s.getcgpa()+"] ");
		}

		// sort objects based on cgpa in descending order
		Comparator<Students> comp1 = Comparator.comparing(Students::getcgpa).reversed();
		list.sort(comp1);
		
		System.out.print("\n");
		for(Students s : list) {
			System.out.print("["+s.getName()+","+s.getcgpa()+"] ");
		}
		
		// we can also sort objects having same cgpa based on alphabets
		Comparator<Students> comp3 = Comparator.comparingDouble(Students::getcgpa).thenComparing(Students::getName);
		list.sort(comp3);
		
		System.out.println();
		for(Students s : list) {
			System.out.print("["+s.getName()+","+s.getcgpa()+"] ");
		}
	}
}
