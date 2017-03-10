package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Instead of int primitive type we can use AtomicInteger to make count thread safe
AtomicInteger is an immutable class can be use in multithreded environment
*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger  count = new AtomicInteger(0);
		
		public int increment() {
		
			return count.getAndIncrement();
		}
		
		public AtomicInteger getCount() {
			return count;
		}
		
		public void resetCount() {
			count = new AtomicInteger(0);
		}

	}
}