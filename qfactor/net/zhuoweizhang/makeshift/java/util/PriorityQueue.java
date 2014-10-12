package net.zhuoweizhang.makeshift.java.util;

import java.util.*;

/** A modified queue backed by an array list. */

public class PriorityQueue<E> extends java.util.PriorityQueue<E> {
	private List<E> backingList;
	private int currentIndex = 0;
	public PriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
		super(1, comparator);
		backingList = new ArrayList<E>(initialCapacity);
	}

	public boolean add(E input) {
		return backingList.add(input);
	}

	public E remove() {
		int index = currentIndex++;
		E retval = backingList.get(index);
		return retval;
	}

	public boolean isEmpty() {
		return currentIndex >= backingList.size();
	}
}
