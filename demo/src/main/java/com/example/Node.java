package main.java.com.example;

/**
 * ячейка списка
 * @param num число в ячейке
 * @param nextElem указатель на следующий элемент
 */
public class Node {

	private int num;

	private Node nextElem;

	public Node(int num, Node nextElem) {
		this.num = num;
		this.nextElem = nextElem;
	}
	
	//геттеры и сеттеры

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