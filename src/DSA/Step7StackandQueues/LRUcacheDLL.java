package DSA.Step7StackandQueues;
import java.util.Map;
import java.util.HashMap;

class LRUNode{
	int key;
	int value;
	LRUNode next;
	LRUNode prev;
	
	public LRUNode(int key,int value){
		this.key = key;
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	public LRUNode(int key,int value,LRUNode next,LRUNode prev){
		this.key = key;
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
}

class LRUCache{
	int size;
	Map<Integer,LRUNode> mpp = new HashMap<>();
	LRUNode head = new LRUNode(-1,-1);
	LRUNode tail = new LRUNode(-1,-1);
	LRUNode temp  = tail;
	
	LRUCache(int capacity){
		size = capacity;
		mpp.clear();
		head.next = tail;
		tail.prev = head;
	}
	
	void deleteNode(LRUNode del) {
		mpp.remove(del.key);
		del.prev.next = del.next;
		del.next.prev = del.prev;				
	}
	
	void placeAfterHead(LRUNode mover) {
		mpp.put(mover.key, mover);
		mover.next = head.next;
		head.next.prev = mover;
		head.next = mover;
		mover.prev = head;
	}
	
	void put(int key,int value) {	
		if(size == mpp.size()) {
			deleteNode(tail.prev);
		}
		
		if(mpp.containsKey(key)) {
			deleteNode(mpp.get(key));
		}
		
        placeAfterHead(new LRUNode(key,value));
       	
	}
	
	int get(int key) {
		if(mpp.containsKey(key)) {	
			LRUNode update = mpp.get(key);
			deleteNode(update);
			placeAfterHead(update);	
			return update.value;
		}
		return -1;
	}
}

public class LRUcacheDLL {
	public static void main(String args[]) {
		LRUCache LRU = new LRUCache(4);
		LRU.put(2, 4);
		LRU.put(3, 9);
		LRU.put(4, 16);
		LRU.put(5, 25);
     	LRU.put(6, 36);
		LRU.put(7, 49);
		LRU.put(8, 64);
		LRU.put(5,8);
		LRU.put(1, 10);
//		LRU.put(12, 30);
//		LRU.put(55, 60);
//		LRU.put(55, 89);
		
		System.out.println(LRU.get(2));
		System.out.println(LRU.get(3));
		System.out.println(LRU.get(4));
		System.out.println(LRU.get(5));
		System.out.println(LRU.get(6));
		System.out.println(LRU.get(7));
		System.out.println(LRU.get(8));
		System.out.println(LRU.get(1));
		System.out.println(LRU.get(12));
		System.out.println(LRU.get(55));
	}
}
