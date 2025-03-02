package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;

import java.util.ArrayList;

class Students{
	double cgpa;
	String name;
	
	Students(double cgpa,String name){
		this.cgpa = cgpa;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getcgpa() {
		return cgpa;
	}
	
}

public class A7ComparatorOnObjects {
	public static void main(String args[]) {
		ArrayList<Students> data = new ArrayList<>();
		data.add(new Students(4.5,"bob"));
		data.add(new Students(6.0,"jack"));
		data.add(new Students(6.0,"alice"));
		data.add(new Students(5.5,"gresey"));
		
		// here we not sort objects directly we have to define custom comparison logic 
		// of objects
		
		// we cannot sort objects in double data type in lamda expression directly
		data.sort((o1,o2)-> (int) (o1.getcgpa()-o2.getcgpa()));
		// it cannot return in double so we have to modify it
		
		// by lamda expression
		// we can use this way to sort objects based on custom comparison logic 
		data.sort((a,b)-> {
			// Or 
			//  if(a.getcgpa()-b.getcgpa()<0) return -1;(- No change in  order)
			//  else if(a.getcgpa()-b.getcgpa()>0) return 1;(+ changing order)
			//  else return 0; (equal)
			
			if(a.getcgpa()>b.getcgpa()) return -1;
			else if(a.getcgpa()<b.getcgpa()) return 1;
			else return 0;
		});
		
		for(Students s : data) {
			System.out.print("["+s.getName()+","+s.getcgpa()+"] ");
		}
		
		// we can also sort objects having same cgpa based on alphabets
		data.sort((a,b)-> {
			if(a.getcgpa()>b.getcgpa()) return 1;
			else if(a.getcgpa()<b.getcgpa()) return -1;
			else return a.getName().compareTo(b.getName());
		});
		
		System.out.print("\n");
		for(Students s : data) {
			System.out.print("["+s.getName()+","+s.getcgpa()+"] ");
		}
		
	}
}
