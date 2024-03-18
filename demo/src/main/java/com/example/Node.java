package main.java.com.example;

public class Node {

	private Int num;

	private Node nextElem;

	public Node(Int num, Node nextElem) {
		this.num = num;
		this.nextElem = nextElem;
	}

	public void setNum(Int num) {
		this.num = num;
	}
	
	public Int getNum() {
		return num;
	}

	public Node getNextElem() {
		return nextElem;
	}
	
	public void setNextElem(Node nextElem) {
		this.nextElem = nextElem;
	}
}