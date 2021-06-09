package com.programming.leetcode;

public class Trie {

	private Trie children[];
	private boolean isEndsHere;

	/** Initialize your data structure here. */
	public Trie() {
		children = new Trie[26];
		isEndsHere = false;
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		Trie current = this;
		for (char c : word.toCharArray()) {
			if ((current.children[c - 'a']) == null)
				current.children[c - 'a'] = new Trie();
			current = current.children[c - 'a'];
		}

		current.isEndsHere = true;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		Trie current = this;
		for (char c : word.toCharArray()) {
			current = current.children[c - 'a'];
			if (current == null) {
				return false;
			}
			if (current.isEndsHere)
				return true;
		}

		return false;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given
	 * prefix.
	 */
	public boolean startsWith(String prefix) {
		Trie current = this;
		for (char c : prefix.toCharArray()) {
			current = current.children[c - 'a'];
			if (current == null) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Trie ob = new Trie();
		ob.insert("hello");
		System.out.println();
		boolean param_2 = ob.search("helloa");
		boolean param_3 = ob.startsWith("he");
	}

}
