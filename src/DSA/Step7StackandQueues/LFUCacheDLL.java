package DSA.Step7StackandQueues;
import java.util.HashMap;
import java.util.Map;

class DLLNode{
	int key,value;
	DLLNode next,prev;
	int freq;
	
	DLLNode(int key,int value){
		this.key = key;
		this.value = value;
		this.next = null;
		this.prev = null;
		this.freq = 1;
	}
}

class List{
	DLLNode head;
	DLLNode tail;
	int listSize;
	
	List(){
		this.head = new DLLNode(0,0);
		this.tail = new DLLNode(0,0);
		this.listSize = 0;
		head.next = tail;
		tail.prev = head;
	}
	
	public void removeNode(DLLNode node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
		listSize--;
	}
	
	public void addNode(DLLNode node) {
		node.next = head.next;
		head.next.prev = node;
		
		head.next = node;
		node.prev = head;
		
		listSize++;
	}
}

class LFUcache{
	final int capacity;
	int curSize;
	int minFreq;
	
	Map<Integer,DLLNode> cache;
	Map<Integer,List> freqList;
	
	LFUcache(int capacity){
		this.capacity = capacity;
		this.curSize = 0;
		this.minFreq = 1;
		
		this.cache = new HashMap<>();
		this.freqList = new HashMap<>(); 
	}
	
	void put(int key,int value) {
		if(capacity==0) return;
		
		if(cache.containsKey(key)) {
			DLLNode curNode = cache.get(key);
			curNode.value = value;
			updateNode(curNode);
		}
		else {
			curSize++;
			if(curSize>capacity) {
				List minFreqList = freqList.get(minFreq);
				cache.remove(minFreqList.tail.prev.key);
				minFreqList.removeNode(minFreqList.tail.prev);
				curSize--;
			}
			
			minFreq = 1;
			
			List curList = freqList.getOrDefault(1, new List());
			DLLNode newNode = new DLLNode(key,value);
		    curList.addNode(newNode);
			freqList.put(1,curList);
			cache.put(key, newNode);
		}
	}
	
	int get(int key) {
		DLLNode curNode = cache.get(key);
		
		if(curNode == null) return -1;
		
		updateNode(curNode);
		return curNode.value;
	}
	
	void updateNode(DLLNode curNode) {
		int curFreq = curNode.freq;
		List curFreqList  = freqList.get(curFreq);
		curFreqList.removeNode(curNode);
		
		if(curFreq == minFreq && curFreqList.listSize == 0) {
			minFreq++;
		}
		
		curFreq++;
		
		List newList = freqList.getOrDefault(curFreq,new List());
		newList.addNode(curNode);
		freqList.put(curFreq, newList);
	}
}

public class LFUCacheDLL {
	public static void main(String args[]) {
		LFUcache LFU = new LFUcache(2);
		LFU.put(1, 1);
		LFU.put(2, 2);
		System.out.println(LFU.get(1));
		LFU.put(3, 3);
		System.out.println(LFU.get(2));
		LFU.put(4, 4);
		System.out.println(LFU.get(3));
		System.out.println(LFU.get(4));
		LFU.put(5, 5);
	}
}
