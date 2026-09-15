COMP 313/413 Project 2 Report Template

TestList.java and TestIterator.java

	 also try with a LinkedList - does it make any difference?

		When I changed from an array list to a Linked list it made no difference in either file.
		All tests still passed.

TestList.java

	testRemoveObject()

		list.remove(5); // what does this method do?

			This removes the value at the index 5 which was the integer value 77.

		list.remove(Integer.valueOf(5)); // what does this one do?

			This removes the ACTUAL integer value "5" and not the value at the index of 5.
			Thus removing the INT value 5 at index of 4.

TestIterator.java

	testRemove()

		i.remove(); // what happens if you use list.remove(77)?/
		what happens if you use list.remove(Integer.valueOf(77))?

        If you used list.remove(77) it would throw an IndexOutOfBoundsException since 77 doesn't exist.
        If you used list.remove(Integer.valueOf(77)) it would bypass the iterator and throw a
        ConcurrentModificationException when it iterates again.

TestPerformance.java

	State how many times the tests were executed for each SIZE (10, 100, 1000 and 10000)
	to get the running time in milliseconds and how the test running times were recorded.

	SIZE 10
								  #1   #2   #3  ... (as many tests as you ran)
        testArrayListAddRemove:   14   14   14 ... (fill these in in ms)
        testLinkedListAddRemove:  14   14   13
		testArrayListAccess:       5    7    7
        testLinkedListAccess:      7    7    6

	SIZE 100
								  #1   #2   #3
        testArrayListAddRemove:   22   21   23  ... (fill these in in ms)
        testLinkedListAddRemove:  11   12   12
		testArrayListAccess:       7    5    5
        testLinkedListAccess:     20   22   20

	SIZE 1000
								  #1   #2   #3
        testArrayListAddRemove:  157  157  152   ... (fill these in in ms)
        testLinkedListAddRemove:  13   11   12
		testArrayListAccess:       5    5    5
        testLinkedListAccess:    419  397  391

	SIZE 10000
								  #1   #2   #3
        testArrayListAddRemove: 1644 1650 1634  ... (fill these in in ms)
        testLinkedListAddRemove:  13   11   14
		testArrayListAccess:       5    5    5
        testLinkedListAccess:   5095 5144 4962

	listAccess - which type of List is better to use, and why?

		for access an arraylist had a much faster time complexity which was almost instantaneous. That is why it is
		better for instant access.

	listAddRemove - which type of List is better to use, and why?

		for Removal a Linked List had a much faster removal time and proves to be the better option between the two.
