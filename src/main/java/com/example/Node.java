package com.example;

/**
 * Элемент списка
 */
public class Node {
	private int num;
	private Node nextElem;

	public Node(int num, Node nextElem) {
		this.num = num;
		this.nextElem = nextElem;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public Node getNextElem() {
		return nextElem;
	}
	
	public void setNextElem(Node nextElem) {
		this.nextElem = nextElem;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj.getClass() != Node.class)
			return false;
		else return this.num == ((Node) obj).num && this.nextElem == ((Node) obj).nextElem;
	}
}