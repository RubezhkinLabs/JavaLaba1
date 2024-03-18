package main.java.com.example;

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
}