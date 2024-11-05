package test;

import Service.ServDoubly;

public class TestDoublyLL {
public static void main(String[] args) {
		ServDoubly dll = new ServDoubly();
//		dll.addnode(3);
		dll.addsortednode(2);
		dll.addsortednode(14);
		dll.addsortednode(33);
		dll.addsortednode(71);
		dll.addsortednode(11);
		dll.display();
		System.out.println("---------");
//		dll.delbypos(4);
//		dll.display();
		dll.addbefore(4,43);
		dll.display();
}
}