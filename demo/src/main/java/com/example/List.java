package main.java.com.example;

import java.io.Console;

public class List {
	private Node head;
	private int size;

	public List() {
		this.head = null;
		this.size = 0;
	}

	public void addElem(int num, int ind){
		if(ind == 0 || size == 0){
			head = new Node(num, null);
		}
		else{
			Node ptr = head;
			for(int i = 0; i < Math.min(size, ind)-1; i++){
				ptr = ptr.getNextElem();
			}
			ptr.setNextElem(new Node(num, ptr.getNextElem()));
		}
		size++;
	}

	public void printAllElems(){
		Node ptr;
		for(int i = 0; i < size; i++){
			System.out.print(ptr.getNum() + " ");
			ptr = ptr.getNextElem();
		}
	}
}