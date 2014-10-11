package net.zhuoweizhang.makeshift.java.util;

import java.util.*;

/** A null priority queue to shut Minecraft up. */

public class PriorityQueue<E> extends java.util.PriorityQueue<E> {
	public PriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
		super(1, comparator);
	}

	public boolean add(E input) {
		// do nothing
		return false;
	}

	public boolean isEmpty() {
		return true;
	}
}
