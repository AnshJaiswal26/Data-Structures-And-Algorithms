package DSA.Step6LinkedList.SLL.Hard;

class Nodeb{
	int data;
	Nodeb next;
	Nodeb back;
	String url;
	
	Nodeb(int data){
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
	Nodeb(String url){
		this.url = url;
		this.next = null;
		this.back = null;
	}
	
	Nodeb(int data, Nodeb next,Nodeb back){
		this.data = data;
		this.next = next;
		this.back = back;
	}
	
	Nodeb(String url, Nodeb next, Nodeb back){
		this.url = url;
		this.next = next;
		this.back = back;
	}
}

class Browser{
	Nodeb currPage;
	
	Browser(String url){
		Nodeb Newnode = new Nodeb(url);
		currPage = Newnode;
		System.out.print("Home page - ");
		System.out.println(currPage.url);
	}
	
	void Visit (String url){

		Nodeb Newnode = new Nodeb(url);
		currPage.next = Newnode;
		Newnode.back = currPage;
		currPage = Newnode;
		System.out.print("current page - ");
		System.out.println(currPage.url);
	}
	
	void Back(int steps) {
		while(steps>0) {
			if(currPage.back!=null) currPage = currPage.back;
			else break;
			steps--;
		}
		System.out.print("current page - ");
		System.out.println(currPage.url);
		return; 
	}
	
	void Forward(int steps) {
		
		while(steps>0) {
			if(currPage.next!=null) currPage = currPage.next;
			else break;
			steps--;
		}
		System.out.print("current page - ");
		System.out.println(currPage.url);
		return; 
	}
}

public class A7BrowserHistoryDLL {
	public static void main(String args[]) {
		Browser browse = new Browser("https://www.google.com");
			browse.Visit("whatsapp");
			browse.Visit("instagram");
			browse.Visit("facebook");
			browse.Back(1);
			browse.Forward(1);
	}
}
