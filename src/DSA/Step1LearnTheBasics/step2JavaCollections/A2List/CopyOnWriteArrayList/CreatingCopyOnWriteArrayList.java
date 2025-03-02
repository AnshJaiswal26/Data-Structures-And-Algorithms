package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.ArrayList;
public class CreatingCopyOnWriteArrayList {
	public static void main(String args[]) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		// "Copy On Write" whenever a write operation
		// like adding or removing an element
		// instead of directly modifying the existing list
		// a new copy of the list is create and the modification is applied on that list
		// This ensures that while other thread reading the list while it's being modified are unaffected.
		
		// Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
		// Write Operations: A new copy of list is created for every modification.
		//                   The reference to the list is then updated so that subsequent reads use this new list.
		
		// useful when read operations are performed.
		// because it makes an copy of list on every modification.
		
		// here in ArrayList if add element or perform any type of modification
		// while reading complier throws an exception because we cannot modify and iteration simultaneously
		List<String> l = new ArrayList<>();
		l.add("Milk");
		l.add("curd");
		l.add("bread");
		l.add("eggs");
		
//		for(String s:l) {
//			System.out.println(s+" ");
//			if(s.equals("bread")) {
//				l.add("butter");
//				System.out.println("Adding butter while reading");
//			}
//		} 
		
		// instead ArrayList if we take CopyOnWriteArrayList it does not throws an exception
		// because it perform modifications on copy of the existing list 
		// and loop is running on a stable list and modifications perform on copied list
		
		list.add("Milk");
		list.add("curd");
		list.add("bread");
		list.add("eggs");
		
		for(String s:list) { // runs on stable snapshot or list
			System.out.println(s+" ");
			if(s.equals("bread")) {
				list.add("butter");// copy created
				System.out.println("Adding butter while reading");
			}
		}// after ending of the loop old list get updated by copy list
		
		System.out.println(list);
	}
}
