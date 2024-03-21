package com.example;

/**
 * @author Артем
 * <p>
 * Односвязный список
 */
public class List {
	private Node head;
	private int size;

	/**
	 * Конструктор по умолчанию
	 */
	public List() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Добавление элемента
	 * @param num элемент для вставки
	 * @param ind позиция для вставки
	 */
	public void addElem(int num, int ind) {
		if(size == 0)
			head = new Node(num, null);
		else if(ind == 0)
			head = new Node(num, head);
		else {
			Node ptr = head;
			// если с индексом перестарались, добавляется в самый конец
			for(int i = 0; i < Math.min(size, ind) - 1; i++)
				ptr = ptr.getNextElem();
			ptr.setNextElem(new Node(num, ptr.getNextElem()));
		}
		size++;
	}

	/**
	 * Удаление элемента
	 * @param ind индекс удаляемого элемента
	 * @return флаг о выполнении операции
	 */
	public boolean delElem(int ind) {
		if(ind >= size)
			return false;
		else {
			if(ind == 0)
				head = head.getNextElem();
			else {
				Node ptr = head;
				for(int i = 0; i < ind-1; i++)
					ptr = ptr.getNextElem();
				ptr.setNextElem(ptr.getNextElem().getNextElem());
			}
			size--;
			return true;
		}
	}

	/**
	 * Редактирование элемента
	 * @param num число, на которое меняется элемент
	 * @param ind индес элемента для замены
	 * @return флаг о выполнении операции
	 */
	public boolean editElem(int num, int ind) {
		if(ind >= size)
			return false;
		else {
			if(ind == 0)
				head = head.getNextElem();
			else {
				Node ptr = head;
				for(int i = 0; i < ind; i++)
					ptr = ptr.getNextElem();
				ptr.setNum(num);
			}
			return true;
		}
	}

	/**
	 * Получение значения элемента
	 * @param ind индекс
	 * @return значение элемента с данным индексом
	 * @throws ArrayIndexOutOfBoundsException попытка получить элемент с несуществующим индексом
	 */
	public int getElem(int ind) {
		if(ind >= size)
			throw new ArrayIndexOutOfBoundsException("No such index in list");
		else {
			Node ptr = head;
			for(int i = 0; i < ind; i++)
				ptr = ptr.getNextElem();
			return ptr.getNum();
		}
	}

	@Override
	public String toString() {
		Node ptr = head;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++){
			sb.append(ptr.getNum()).append(" ");
			ptr = ptr.getNextElem();
		}
		return sb.toString();
	}
}