package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	CustomList<String> sut;

	@BeforeEach
	void setUp() {
		sut = new CustomArrayList<>();
	}

	@Test
	void should_add_new_element() {
		sut.add("Test 1");
		String expectedResult = sut.get(0);
		int expectedSize = sut.getSize();

		assertEquals(("Test 1"), expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void should_add_11_elements() {

		for (int i = 0; i < 11; i++) {
			sut.add("Element " + i);
		}

		for (int i = 0; i < 11; i++) {
			assertEquals("Element " + i, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}

	@Test
	void should_add_item_to_specified_index() {
		for (int i = 0; i < 5; i++) {
			sut.add("Element " + i + 1);
		}
		sut.add(4, "index 4 insertion");
		assertEquals("index 4 insertion", sut.get(4));

	}

	@Test
	void should_remove_element_and_shift_accordingly() {
		sut.add("Element1");
		sut.add("Element2");
		assertEquals("Element2", sut.remove(1));
		assertEquals(1, sut.getSize());
	}

	@Test
	void custom_arraylist_should_resizeS() {

		for (int i = 0; i < 15; i++) {
			sut.add("Element " + i);
		}

		assertEquals(15, sut.getSize());
		for (int i = 0; i < 15; i++) {
			assertEquals("Element " + i, sut.get(i));
		}
		assertTrue(((CustomArrayList<String>) sut).backingArrayCapacity() == 20);
	}

	@Test
	void should_remove_element_from_start() {
		sut.add("Element1");
		sut.add("Element2");
		sut.add("Element3");
		assertEquals("Element1", sut.remove(0));
		assertEquals("Element2", sut.get(0));
	}

	@Test
	void should_remove_element_from_middle() {
		sut.add("Element1");
		sut.add("Element2");
		sut.add("Element3");
		assertEquals("Element2", sut.remove(1));
		assertEquals("Element3", sut.get(1));
	}

	@Test
	void should_remove_element_from_end() {
		sut.add("Element1");
		sut.add("Element2");
		sut.add("Element3");
		assertEquals("Element3", sut.remove(2));
		assertEquals(2, sut.getSize());
	}


	@Test
	void should_throw_IndexOutOfBoundsException_when_get_invalid_index() {
		sut.add("Element");
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(1));
	}

	@Test
	void should_throw_IndexOutOfBoundsException_when_add_at_invalid_index() {
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(1, "Element"));
	}

	@Test
	void should_throw_IndexOutOfBoundsException_when_remove_invalid_index() {
			assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(0));

		}
	}