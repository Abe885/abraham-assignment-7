# Assignment 6: Enhancing CustomArrayList with Test-Driven Development

## Overview
In this assignment, we're focusing on applying the principles of Test-Driven Development (TDD) to enhance and refactor our existing project from Assignment 5. The core objective is to expand the functionality of our `CustomArrayList` implementation, ensuring that all new features adhere to the updated interface requirements.

## Objectives
- **Implement Test-Driven Development:** Write tests first, then develop features that pass these tests.
- **Extend `CustomArrayList`:** Enhance the functionality based on the updated `CustomList` interface.
- **Refactoring:** Improve and optimize the existing code from Assignment 5 as needed.

## Updated CustomList Interface
The `CustomList` interface has been expanded with the following methods:

1. **add(T item):** Adds a new item to the `CustomList`. Returns `true` if successful.
2. **add(int index, T item):** Inserts an item at the specified index. Throws `IndexOutOfBoundsException` if the index is invalid.
3. **getSize():** Returns the number of elements in the `CustomList`.
4. **get(int index):** Retrieves the element at the specified index. Throws `IndexOutOfBoundsException` if the index is invalid.
5. **remove(int index):** Removes the element at the specified index, shuffling subsequent elements to the left. Throws `IndexOutOfBoundsException` if the index is invalid.

## Task Requirements
- Implement all methods defined in the `CustomList` interface.
- Ensure robustness through comprehensive unit tests.
- Follow TDD principles: write tests before implementing functionalities.
- Document your code and testing process.

## Submission Guidelines
- Push your code to this repository.
- Ensure your final commit includes all source code and test cases.
- Submit your repository link on the course submission portal.

---
