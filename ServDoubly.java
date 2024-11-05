package Service;

public class ServDoubly {
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node head;
	public ServDoubly() {
		super();
		this.head = null;
	}
//	public void addnode(int val) {
//		Node newnode = new Node(val);
//		if(head == null) {
//			head = newnode;
//		}
//		else {
//			Node temp=head;
//			while(temp.next!=null) {
//				temp=temp.next;
//			}
//			temp.next=newnode;
//			newnode.prev=temp;
//			newnode.next=null;
//		}
//		
//	}
	public void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	public void addsortednode(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			newnode.next=null;
		}
		else {
			Node temp=head;
			if(head.data>val) {
				newnode.next=temp;
				newnode.prev=head;
				temp.prev = newnode;
				head=newnode;
			}
			else 
			{
			while(temp.next!=null && temp.next.data<val) {
				temp=temp.next;
			}
//			if(temp.next!=null) {
//				newnode.next=temp;
//				newnode.prev=temp.prev;
//				temp.next.prev=newnode;
//				temp.prev = newnode;
				if(temp.next!=null) {
				newnode.next=temp.next;
				newnode.prev=temp.next.prev;
				temp.next = newnode;
				temp.next.prev=newnode;
			}else {
				 temp.next = newnode; 
		            newnode.prev = temp; 
		            newnode.next = null; 
			}
		}
		}
	}
	public void delbypos(int pos) {
		Node temp = head;
		if(pos==1) {
			head = temp.next;
			temp.next = null;
			temp = null;
		}
		else {
			for(int i=0; temp!=null && i<pos-1; i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("Not Found");
			}
		}
		}
	public void addbefore(int pos, int val) {
		Node newnode=new Node(val);
		Node temp=head;
		if(pos==1) {
			head=newnode;
			newnode.next=temp;
			newnode.prev=head;
			temp.prev=newnode;
		}
		else {
			for(int i=0;temp!=null && i<pos-2;i++) {
				temp=temp.next;
			}
			newnode.next=temp;
			temp.prev.next=newnode;
			newnode.prev = temp.prev;
			temp.prev=newnode;
			
		}
	}
	}

//for(int i=0;temp!=null &&i<pos-1;i++) {
//temp=temp.next;
//}
//if(temp!=null) {
//temp.next.next.prev=temp;
//temp.next=temp.next.next;
//temp.next.next=null;
//temp.next.prev=null;
//}

