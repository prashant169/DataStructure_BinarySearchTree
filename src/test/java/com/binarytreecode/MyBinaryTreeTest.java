package com.binarytreecode;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void givenThreeNumbers_WhenAddedToBST_ShouldReturnSize() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
}


/*
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
	@Test
	public void givenThreeNumbersWhenAddedToBSTShouldReturnSize() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
*/