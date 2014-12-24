import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BiQueueTests {
	private BiPriorityQueue queue;
	
	@Before
	public void setUp(){
		queue = new BiQueue();
	}

	@Test
	public void Test1() {
		queue.put(15);
		queue.put(-77);
		queue.removeMin();
		queue.removeMax();
		assertEquals(queue.size(), 0);
	}
	
	@Test
	public void Test2(){
		queue.put(-45);
		queue.put(776);
		queue.removeMax();
		queue.put(-62);
		queue.put(42);
		queue.removeMin();
		queue.put(341);
		assertEquals(queue.removeMax(), 341);
		assertEquals(queue.removeMin(), -45);
	}
	
	@Test
	public void Test3(){
		queue.put(-45);
		assertEquals(queue.removeMax(), -45);
		assertEquals(queue.size(), 0);
	}
	
	@Test
	public void Test4(){
		queue.put(1);
		queue.put(1);
		queue.put(1);
		assertEquals(queue.size(), 3);
		assertEquals(queue.removeMin(), 1);
		assertEquals(queue.size(), 2);
		assertEquals(queue.removeMax(), 1);
		assertEquals(queue.size(), 1);
		assertEquals(queue.removeMin(), 1);
		assertEquals(queue.size(), 0);
	}

}
