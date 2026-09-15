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
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  0.013 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: 0.013 val2 val3 val4 val5 val6
		testArrayListAccess:     0.007 val2 val3 val4 val5 val6
        testLinkedListAccess:    0.013 val2 val3 val4 val5 val6

	SIZE 100
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  val1 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	SIZE 1000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  val1 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	SIZE 10000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  val1 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	listAccess - which type of List is better to use, and why?

		Your answer here.

	listAddRemove - which type of List is better to use, and why?

		Your answer here.
