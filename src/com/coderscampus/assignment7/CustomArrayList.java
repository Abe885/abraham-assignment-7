package com.coderscampus.assignment7;



public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = resizeItemsArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Failed attempted access at index " + index + "! Valid indices are between 0 and " + (size - 1) + ".");
		}
		return (T) items[index];
	}

			
	private Object[] resizeItemsArray() {
		Object[] newLargerArray = new Object[size * 2];
		for (int i = 0; i < size; i++) {
			newLargerArray[i] = items[i];
		}
		return newLargerArray;
	}


 // Test method:
	public int backingArrayCapacity() {

		return items.length;
	}
	
}
