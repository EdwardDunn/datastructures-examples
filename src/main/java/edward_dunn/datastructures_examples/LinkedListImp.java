package edward_dunn.datastructures_examples;

public class LinkedListImp {

	//singly linked list implementation
	class Node {
		//create new node
		Node next = null;
		
		int data;
		
		public Node (int d) {
			data = d;
		}
		
		public void appendToTail(int value) {
			//create new node to act as tail
			Node tail = new Node(value);
			
			//get instance of current list 
			Node n = this;
			
			//while list has next value, move n one place
			while(n.next != null) {
				n = n.next;
			}
			
			//append new end node to tail
			n.next = tail;
		}
	}
	
}
