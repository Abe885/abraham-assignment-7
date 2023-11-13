package com.coderscampus.assignment7;


public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		CustomArrayList<String> testArrayList = new CustomArrayList<>();
		
		for (int i = 1; i < 42; i++) {
			myCustomList.add("element " + i);
		}
		
		for (int i = 1; i < 81; i++) {
			testArrayList.add("element " + i);
		}
		
		testArrayList.add("element 21");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		System.out.println("------------------");
	 // Checking if the backing array resizes properly :
		for (int i = 0; i < testArrayList.getSize(); i++) {
			System.out.println(testArrayList.get(i));

		}
		System.out.println("Size of custom arrayList = " + testArrayList.getSize());
		System.out.println("Length of backing array inside CustomArrayList = " + testArrayList.backingArrayCapacity());
		
	}
}
