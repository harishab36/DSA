package com.dsa.list;

import java.util.Arrays;

public class SerialList<E> {

	Object[] elements;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;

	public SerialList() {
		// TODO Auto-generated constructor stub
		elements = new Object[DEFAULT_SIZE];
	}

	public void add(E element) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}

	public void ensureCapacity() {
		int newSize = elements.length << 1;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E get(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index + " Where size is " + size);
		}
		return (E) elements[index];
	}

	public void remove(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index + " Where size is " + size);
		}

		elements = removeAndShift(index);
	}

	public Object[] removeAndShift(int index) {
		Object[] temp = new Object[size - 1];
		int k = 0;
		for (int i = 0; i < size; i++) {
			if (index != i) { // skip[ copying element if index is found.
				temp[k++] = elements[i];
			}
		}
		size--;
		return temp;
	}
	
	public int size() {
		return size;
	}
}
