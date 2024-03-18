package main.java.com.example;

import java.io.Console;

/**
 * List односвязный список
 * @param head указатель на первый элемент
 * @param size размер списка
 */
public class List {
	private Node head;
	private int size;

	//конструктор по умолчанию
	public List() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * добавление элемента
	 * @param num число, которое нужно вставить
	 * @param ind позиция, куда нужно поставить
	 */
	public void addElem(int num, int ind){
		if(size == 0){
			head = new Node(num, null);
		}
		else if(ind == 0)
		{
			head = new Node(num, head);
		}
		else{
			Node ptr = head;
			for(int i = 0; i < Math.min(size, ind)-1; i++){ // если с индексом перестарались, добавляется в самый конец
				ptr = ptr.getNextElem();
			}
			ptr.setNextElem(new Node(num, ptr.getNextElem()));
		}
		size++;
	}

	/**
	 * удаление элемента
	 * @param ind индекс удаляемого элемента
	 * @return флаг о выполнении операции
	 */
	public boolean delElem(int ind){
		if(ind>=size){
			return false;
		}
		else{
			if(ind == 0){
				head = head.getNextElem();
			}
			else{
				Node ptr = head;
				for(int i = 0; i < ind-1; i++){
					ptr = ptr.getNextElem();
				}
				ptr.setNextElem(ptr.getNextElem().getNextElem());
			}
			size--;
			return true;
		}
	}

	/**
	 * редактирование элемента
	 * @param num число на которое меняется элемент
	 * @param ind индес, где заменить надо
	 * @return флаг о выполнении операции
	 */
	public boolean editElem(int num, int ind){
		if(ind>=size){
			return false;
		}
		else{
			if(ind == 0){
				head = head.getNextElem();
			}
			else{
				Node ptr = head;
				for(int i = 0; i < ind; i++){
					ptr = ptr.getNextElem();
				}
				ptr.setNum(num);
			}
			return true;
		}
	}

	/**
	 * Получение значения элемента
	 * @param ind индекс
	 * @return число в указанной ячейке
	 */
	public int getElem(int ind){
		if(ind >= size){
			return Integer.MIN_VALUE; // я не придумал, как умнее намекнуть пользователю, что он выбрал не тот индекс, хотел null, но как я понял, в java на инт null нет
		}	
		else{
			Node ptr = head;
			for(int i = 0; i < ind; i++){
				ptr = ptr.getNextElem();
			}
			return ptr.getNum();
		}
	}

	@Override
	public String toString() {
		Node ptr = head;
		String res = "";
		for(int i = 0; i < size; i++){
			res += ptr.getNum() + " ";
			ptr = ptr.getNextElem();
		}
		return res;
	}
}