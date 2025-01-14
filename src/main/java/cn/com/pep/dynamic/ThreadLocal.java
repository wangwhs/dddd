
package cn.com.pep.dynamic;

import java.lang.ref.*;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class provides thread-local variables. These variables differ from their
 * normal counterparts in that each thread that accesses one (via its
 * <tt>get</tt> or <tt>set</tt> method) has its own, independently initialized
 * copy of the variable. <tt>ThreadLocal</tt> instances are typically private
 * static fields in classes that wish to associate state with a thread (e.g., a
 * user ID or Transaction ID).
 *
 * <p>
 * For example, the class below generates unique identifiers local to each
 * thread. A thread's id is assigned the first time it invokes
 * <tt>ThreadId.get()</tt> and remains unchanged on subsequent calls.
 * 
 * <pre>
 * import java.util.concurrent.atomic.AtomicInteger;
 *
 * public class ThreadId {
 * 	// Atomic integer containing the next thread ID to be assigned
 * 	private static final AtomicInteger nextId = new AtomicInteger(0);
 *
 * 	// Thread local variable containing each thread's ID
 * 	private static final ThreadLocal&lt;Integer> threadId = new ThreadLocal&lt;Integer>() {
 * 		&#64;Override
 * 		protected Integer initialValue() {
 * 			return nextId.getAndIncrement();
 * 		}
 * 	};
 *
 * 	// Returns the current thread's unique ID, assigning it if necessary
 * 	public static int get() {
 * 		return threadId.get();
 * 	}
 * }
 * </pre>
 * <p>
 * Each thread holds an implicit reference to its copy of a thread-local
 * variable as long as the thread is alive and the <tt>ThreadLocal</tt> instance
 * is accessible; after a thread goes away, all of its copies of thread-local
 * instances are subject to garbage collection (unless other references to these
 * copies exist).
 *
 * @author Josh Bloch and Doug Lea
 * @since 1.2
 */
public class ThreadLocal<T> {
	/**
	 * ThreadLocals rely on per-thread linear-probe hash maps attached to each
	 * thread (Thread.threadLocals and inheritableThreadLocals). The ThreadLocal
	 * objects act as keys, searched via threadLocalHashCode. This is a custom hash
	 * code (useful only within ThreadLocalMaps) that eliminates collisions in the
	 * common case where consecutively constructed ThreadLocals are used by the same
	 * threads, while remaining well-behaved in less common cases.
	 */
	private final int threadLocalHashCode = nextHashCode();

	/**
	 * The next hash code to be given out. Updated atomically. Starts at zero.
	 */
	private static AtomicInteger nextHashCode = new AtomicInteger();

	/**
	 * The difference between successively generated hash codes - turns implicit
	 * sequential thread-local IDs into near-optimally spread multiplicative hash
	 * values for power-of-two-sized tables.
	 */
	private static final int HASH_INCREMENT = 0x61c88647;

	/**
	 * Returns the next hash code.
	 */
	private static int nextHashCode() {
		return nextHashCode.getAndAdd(HASH_INCREMENT);
	}

	/**
	 * Returns the current thread's "initial value" for this thread-local variable.
	 * This method will be invoked the first time a thread accesses the variable
	 * with the {@link #get} method, unless the thread previously invoked the
	 * {@link #set} method, in which case the <tt>initialValue</tt> method will not
	 * be invoked for the thread. Normally, this method is invoked at most once per
	 * thread, but it may be invoked again in case of subsequent invocations of
	 * {@link #remove} followed by {@link #get}.
	 *
	 * <p>
	 * This implementation simply returns <tt>null</tt>; if the programmer desires
	 * thread-local variables to have an initial value other than <tt>null</tt>,
	 * <tt>ThreadLocal</tt> must be subclassed, and this method overridden.
	 * Typically, an anonymous inner class will be used.
	 *
	 * @return the initial value for this thread-local
	 */
	protected T initialValue() {
		return null;
	}

	/**
	 * Creates a thread local variable.
	 */
	public ThreadLocal() {
	}

	/**
	 * Returns the value in the current thread's copy of this thread-local variable.
	 * If the variable has no value for the current thread, it is first initialized
	 * to the value returned by an invocation of the {@link #initialValue} method.
	 *
	 * @return the current thread's value of this thread-local
	 */
	public T get() {
		Thread t = Thread.currentThread();
		ThreadLocalMap map = getMap(t);
		if (map != null) {
			ThreadLocalMap.Entry e = map.getEntry(this);
			if (e != null)
				return (T) e.value;
		}
		return setInitialValue();
	}

	/**
	 * Variant of set() to establish initialValue. Used instead of set() in case
	 * user has overridden the set() method.
	 *
	 * @return the initial value
	 */
	private T setInitialValue() {
		T value = initialValue();
		Thread t = Thread.currentThread();
		ThreadLocalMap map = getMap(t);
		if (map != null)
			map.set(this, value);
		else
			createMap(t, value);
		return value;
	}

	/**
	 * Sets the current thread's copy of this thread-local variable to the specified
	 * value. Most subclasses will have no need to override this method, relying
	 * solely on the {@link #initialValue} method to set the values of
	 * thread-locals.
	 *
	 * @param value the value to be stored in the current thread's copy of this
	 *              thread-local.
	 */
	public void set(T value) {
		Thread t = Thread.currentThread();
		ThreadLocalMap map = getMap(t);
		if (map != null)
			map.set(this, value);
		else
			createMap(t, value);
	}

	/**
	 * Removes the current thread's value for this thread-local variable. If this
	 * thread-local variable is subsequently {@linkplain #get read} by the current
	 * thread, its value will be reinitialized by invoking its {@link #initialValue}
	 * method, unless its value is {@linkplain #set set} by the current thread in
	 * the interim. This may result in multiple invocations of the
	 * <tt>initialValue</tt> method in the current thread.
	 *
	 * @since 1.5
	 */
	public void remove() {
		ThreadLocalMap m = getMap(Thread.currentThread());
		if (m != null)
			m.remove(this);
	}

	/**
	 * Get the map associated with a ThreadLocal. Overridden in
	 * InheritableThreadLocal.
	 *
	 * @param t the current thread
	 * @return the map
	 */
	ThreadLocalMap getMap(Thread t) {
		// TODO
//        return t.threadLocals;
		return null;
	}

	/**
	 * Create the map associated with a ThreadLocal. Overridden in
	 * InheritableThreadLocal.
	 *
	 * @param t          the current thread
	 * @param firstValue value for the initial entry of the map
	 * @param map        the map to store.
	 */
	void createMap(Thread t, T firstValue) {
		// TODO
		// t.threadLocals = new ThreadLocalMap(this, firstValue);
	}

	/**
	 * Factory method to create map of inherited thread locals. Designed to be
	 * called only from Thread constructor.
	 *
	 * @param parentMap the map associated with parent thread
	 * @return a map containing the parent's inheritable bindings
	 */
	static ThreadLocalMap createInheritedMap(ThreadLocalMap parentMap) {
		return new ThreadLocalMap(parentMap);
	}

	/**
	 * Method childValue is visibly defined in subclass InheritableThreadLocal, but
	 * is internally defined here for the sake of providing createInheritedMap
	 * factory method without needing to subclass the map class in
	 * InheritableThreadLocal. This technique is preferable to the alternative of
	 * embedding instanceof tests in methods.
	 */
	T childValue(T parentValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * ThreadLocalMap is a customized hash map suitable only for maintaining thread
	 * local values. No operations are exported outside of the ThreadLocal class.
	 * The class is package private to allow declaration of fields in class Thread.
	 * To help deal with very large and long-lived usages, the hash table entries
	 * use WeakReferences for keys. However, since reference queues are not used,
	 * stale entries are guaranteed to be removed only when the table starts running
	 * out of space.
	 */
	static class ThreadLocalMap {

		/**
		 * The entries in this hash map extend WeakReference, using its main ref field
		 * as the key (which is always a ThreadLocal object). Note that null keys (i.e.
		 * entry.get() == null) mean that the key is no longer referenced, so the entry
		 * can be expunged from table. Such entries are referred to as "stale entries"
		 * in the code that follows.
		 */
		static class Entry extends WeakReference<ThreadLocal> {
			/** The value associated with this ThreadLocal. */
			Object value;

			Entry(ThreadLocal k, Object v) {
				super(k);
				value = v;
			}
		}

		/**
		 * The initial capacity -- MUST be a power of two.
		 */
		private static final int INITIAL_CAPACITY = 16;

		/**
		 * The table, resized as necessary. table.length MUST always be a power of two.
		 */
		private Entry[] table;

		/**
		 * The number of entries in the table.
		 */
		private int size = 0;

		/**
		 * The next size value at which to resize.
		 */
		private int threshold; // Default to 0

		/**
		 * Set the resize threshold to maintain at worst a 2/3 load factor.
		 */
		private void setThreshold(int len) {
			threshold = len * 2 / 3;
		}

		/**
		 * Increment i modulo len.
		 */
		private static int nextIndex(int i, int len) {
			return ((i + 1 < len) ? i + 1 : 0);
		}

		/**
		 * Decrement i modulo len.
		 */
		private static int prevIndex(int i, int len) {
			return ((i - 1 >= 0) ? i - 1 : len - 1);
		}

		/**
		 * Construct a new map initially containing (firstKey, firstValue).
		 * ThreadLocalMaps are constructed lazily, so we only create one when we have at
		 * least one entry to put in it.
		 */
		ThreadLocalMap(ThreadLocal firstKey, Object firstValue) {
			table = new Entry[INITIAL_CAPACITY];
			int i = firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
			table[i] = new Entry(firstKey, firstValue);
			size = 1;
			setThreshold(INITIAL_CAPACITY);
		}

		/**
		 * Construct a new map including all Inheritable ThreadLocals from given parent
		 * map. Called only by createInheritedMap.
		 *
		 * @param parentMap the map associated with parent thread.
		 */
		private ThreadLocalMap(ThreadLocalMap parentMap) {
			Entry[] parentTable = parentMap.table;
			int len = parentTable.length;
			setThreshold(len);
			table = new Entry[len];

			for (int j = 0; j < len; j++) {
				Entry e = parentTable[j];
				if (e != null) {
					ThreadLocal key = e.get();
					if (key != null) {
						Object value = key.childValue(e.value);
						Entry c = new Entry(key, value);
						int h = key.threadLocalHashCode & (len - 1);
						while (table[h] != null)
							h = nextIndex(h, len);
						table[h] = c;
						size++;
					}
				}
			}
		}

		/**
		 * Get the entry associated with key. This method itself handles only the fast
		 * path: a direct hit of existing key. It otherwise relays to getEntryAfterMiss.
		 * This is designed to maximize performance for direct hits, in part by making
		 * this method readily inlinable.
		 *
		 * @param key the thread local object
		 * @return the entry associated with key, or null if no such
		 */
		private Entry getEntry(ThreadLocal<?> key) {
			int i = key.threadLocalHashCode & (table.length - 1);
			Entry e = table[i];
			if (e != null && key == e.get()) {
				return e;
			} else {
				return getEntryAfterMiss(key, i, e);
			}
		}

		/**
		 * Version of getEntry method for use when key is not found in its direct hash
		 * slot.
		 *
		 * @param key the thread local object
		 * @param i   the table index for key's hash code
		 * @param e   the entry at table[i]
		 * @return the entry associated with key, or null if no such
		 */
		@SuppressWarnings("rawtypes")
		private Entry getEntryAfterMiss(ThreadLocal key, int i, Entry e) {
			Entry[] tab = table;
			int len = table.length;
			/* 开始线性探测 */
			while (e != null) {
				ThreadLocal k = e.get();
				/* 探测成功直接返回 */
				if (key == k) {
					return e;
				}

				/* 探测到了控制，开启一个连续段清理 */
				if (k == null) {
					expungeStaleEntry(i);
				} else {
					/* 窗口滑动 */
					i = nextIndex(i, len);
				}
				e = tab[i];
			}
			/* 这个连续段中没有探测成功,说明不存在 */
			return null;
		}

		/**
		 * Set the value associated with key.
		 *
		 * @param key   the thread local object
		 * @param value the value to be set
		 */
		@SuppressWarnings("rawtypes")
		private void set(ThreadLocal key, Object value) {
			Entry[] tab = table;
			int len = table.length;
			int i = key.threadLocalHashCode & (len - 1);
			/* 开始线性探测 */
			for (Entry e = tab[i]; (e = tab[i]) != null; i = nextIndex(i, len)) {
				ThreadLocal k = e.get();
				/* 探测成功 */
				if (k == key) {
					tab[i].value = value;
					return;
				}

				/* 探测到了空值，进行替换 */
				if (k == null) {
					replaceStaleEntry(key, value, i);
					return;
				}
			}

			/* 上面那条完整链上没有探测到 */
			tab[i] = new Entry(key, value);
			int sz = ++size;
			/* 先进行一次分段清理，在进行一次全量清理，清理过后如果超出阈值，进行重新三列 */
			if (!cleanSomeSlots(expungeStaleEntry(i), sz) && sz > threshold) {
				rehash();
			}
		}

		/**
		 * Remove the entry for key.
		 */
		@SuppressWarnings("rawtypes")
		private void remove(ThreadLocal key) {
			Entry[] tab = table;
			int len = tab.length;
			int i = key.threadLocalHashCode & (len - 1);
			for (Entry e = tab[i]; (e = tab[i]) != null; i = nextIndex(i, len)) {
				ThreadLocal k = e.get();
				/* 探测成功 */
				if (key == k) {
					e.clear();
					expungeStaleEntry(i);
					return;
				}
			}
		}

		/**
		 * Replace a stale entry encountered during a set operation with an entry for
		 * the specified key. The value passed in the value parameter is stored in the
		 * entry, whether or not an entry already exists for the specified key.
		 *
		 * As a side effect, this method expunges all stale entries in the "run"
		 * containing the stale entry. (A run is a sequence of entries between two null
		 * slots.)
		 *
		 * @param key       the key
		 * @param value     the value to be associated with key
		 * @param staleSlot index of the first stale entry encountered while searching
		 *                  for key.
		 */
		@SuppressWarnings("rawtypes")
		private void replaceStaleEntry(ThreadLocal key, Object value, int staleSlot) {
			Entry[] tab = table;
			int len = table.length;
			Entry e;

			/* 进行分段清理的起始位置 */
			int slotToExpunge = staleSlot;
			/* 向前探测 */
			for (int i = staleSlot; (e = tab[i]) != null; i = prevIndex(i, len)) {
				ThreadLocal k = e.get();
				/* 探测到了过期的引用，则将清理标记向前移动 */
				if (k == null) {
					slotToExpunge = i;
				}
			}

			/* 向后探测 */
			for (int i = staleSlot; (e = tab[i]) != null; i = nextIndex(i, len)) {
				ThreadLocal k = e.get();

				/* 探测成功 */
				if (k == key) {
					/* 值替换,将此位置的slot与staleslot交换，获取的时候提高检索效率 */
					e.value = value;
					tab[i] = tab[staleSlot];
					tab[staleSlot] = e;

					/* 前半部分没有探测到过期的引用，将将清理的边界后移 */
					if (staleSlot == slotToExpunge) {
						slotToExpunge = i;
					}
					cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
					return;
				}

				/* 前半部分没有探测到过期的引用,移动清理的边界 */
				if (k == null && staleSlot == slotToExpunge) {
					slotToExpunge = i;
				}
			}

			/* 前后两部分都探测不成功，则将在这个位置上创建一个新的entry */
			tab[staleSlot].value = null;
			tab[staleSlot] = new Entry(key, value);
			if (staleSlot != slotToExpunge) {
				cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
			}
		}

		/**
		 * Expunge a stale entry by rehashing any possibly colliding entries lying
		 * between staleSlot and the next null slot. This also expunges any other stale
		 * entries encountered before the trailing null. See Knuth, Section 6.4
		 *
		 * @param staleSlot index of slot known to have null key
		 * @return the index of the next null slot after staleSlot (all between
		 *         staleSlot and this slot will have been checked for expunging).
		 */
		@SuppressWarnings("rawtypes")
		private int expungeStaleEntry(int staleSlot) {
			Entry[] tab = table;
			int len = table.length;
			/* 清除当前的无效引用 */
			tab[staleSlot].value = null;
			tab[staleSlot] = null;
			size--;

			Entry e;
			int i;
			/* 从当前位置先后探测,清除掉无效引用 */
			for (i = nextIndex(staleSlot, len); (e = tab[i]) != null; i = nextIndex(i, len)) {
				ThreadLocal k = e.get();
				/* 探测到失效的引用清除掉 */
				if (k == null) {
					e.value = null;
					tab[i] = null;
					size--;
				} else {
					/* 探测到不为空的引用重新调整位置 */
					int h = k.threadLocalHashCode & (len - 1);
					tab[i] = null;
					/* 说明之前存放的时候发生了碰撞 */
					if (h != i) {
						/* 开始线性探测 */
						while (tab[h] != null) {
							h = nextIndex(h, len);
						}
						tab[h] = e;
					}
				}
			}
			/* 探测结束，探测到这条链上第一个为空的slot */
			return i;
		}

		/**
		 * Heuristically scan some cells looking for stale entries. This is invoked when
		 * either a new element is added, or another stale one has been expunged. It
		 * performs a logarithmic number of scans, as a balance between no scanning
		 * (fast but retains garbage) and a number of scans proportional to number of
		 * elements, that would find all garbage but would cause some insertions to take
		 * O(n) time.
		 *
		 * @param i a position known NOT to hold a stale entry. The scan starts at the
		 *          element after i.
		 *
		 * @param n scan control: <tt>log2(n)</tt> cells are scanned, unless a stale
		 *          entry is found, in which case <tt>log2(table.length)-1</tt>
		 *          additional cells are scanned. When called from insertions, this
		 *          parameter is the number of elements, but when from
		 *          replaceStaleEntry, it is the table length. (Note: all this could be
		 *          changed to be either more or less aggressive by weighting n instead
		 *          of just using straight log n. But this version is simple, fast, and
		 *          seems to work well.)
		 *
		 * @return true if any stale entries have been removed.
		 */
		private boolean cleanSomeSlots(int i, int n) {
			Entry[] tab = table;
			int len = table.length;
			boolean removed = false;

			do {
				i = nextIndex(i, len);
				Entry e = tab[i];
				if (e != null && e.get() == null) {
					tab[i].value = null;
					i = expungeStaleEntry(i);
					n = len;
					removed = true;
				}
			} while ((n >>> 1) != 0);
			return removed;
		}

		/**
		 * Re-pack and/or re-size the table. First scan the entire table removing stale
		 * entries. If this doesn't sufficiently shrink the size of the table, double
		 * the table size.
		 */
		private void rehash() {
			expungeStaleEntries();

			// Use lower threshold for doubling to avoid hysteresis
			if (size >= threshold - threshold / 4)
				resize();
		}

		/**
		 * Double the capacity of the table.
		 */
		@SuppressWarnings("rawtypes")
		private void resize() {
			Entry[] tab = table;
			int len = table.length;
			int newLen = 2 * len;
			Entry[] newTab = new Entry[newLen];
			int count = 0;

			for (int i = 0; i < len; i++) {
				Entry e = tab[i];
				if (e != null) {
					ThreadLocal k = e.get();
					if (k == null) {
						tab[i].value = null;
					}else {
						int h = k.threadLocalHashCode & (newLen -1);
						while (newTab[h] != null) {
							h = nextIndex(h, newLen);
						}
						tab[h] = e;
						count++;
					}
				}
			}
			
			setThreshold(count);
			size = count;
			table = newTab;
		}

		/**
		 * Expunge all stale entries in the table.
		 */
		private void expungeStaleEntries() {
			Entry[] tab = table;
			int len = table.length;
			
			for (int i = 0; i < len; i++) {
				Entry e = tab[i];
				if (e != null && e.get() == null) {
					tab[i].value = null;
					tab[i] = null;
					expungeStaleEntry(i);
				}
			}
		}
	}
}
