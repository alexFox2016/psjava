package org.psjava.example.ds;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.ds.stack.Stack;
import org.psjava.ds.stack.StackFactory;
import org.psjava.ds.stack.StackFactoryUsingDynamicArray;
import org.psjava.ds.stack.StackFactoryUsingLinkedList;

/**
 * @implementation {@link StackFactoryUsingDynamicArray}
 * @implementation {@link StackFactoryUsingLinkedList}
 */
public class StackExample {

	@Test
	public void example() {
		StackFactory factory = StackFactoryUsingDynamicArray.getInstance();

		Stack<String> stack = factory.create();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		// Operations

		boolean empty = stack.isEmpty(); // must be false
		String top = stack.top(); // must be "C"
		String pop1 = stack.pop(); // must be "C"
		String pop2 = stack.pop(); // must be "B"
		Assert.assertFalse(empty);
		Assert.assertEquals("C", top);
		Assert.assertEquals("C", pop1);
		Assert.assertEquals("B", pop2);

		// There are several implementations of stack.

		StackFactory factory1 = StackFactoryUsingDynamicArray.getInstance();
		StackFactory factory2 = StackFactoryUsingLinkedList.getInstance();
		Assert.assertNotNull(factory1);
		Assert.assertNotNull(factory2);

	}
}
