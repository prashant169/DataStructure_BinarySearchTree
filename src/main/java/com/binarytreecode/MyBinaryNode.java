package com.binarytreecode;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

/*
 * uc2 public class MyBinaryNode<K extends Comparable<K>> { K key; public
 * MyBinaryNode<K> left; public MyBinaryNode<K> right;
 * 
 * public MyBinaryNode(K key) { this.key = key; this.left = null; this.right =
 * null; } }
 */