import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoundedQueueTest {
	BoundedQueue a= new BoundedQueue(2);
	
	@Test
	void testBoundedQueue() {
		try {
			new BoundedQueue(5);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	@Test
	void testEnQueue() {
		a.enQueue(1);
		a.enQueue(2);
		System.out.println("enQueue test: "+a.toString());
	}
	@Test
	void testDeQueue() {
		a.enQueue(1);
		a.deQueue();
		System.out.println("deQueue test: "+a.toString());
	}
	@Test
	void testIsEmpty() {
		boolean empty = true;
		assertEquals(a.isEmpty(),empty);
		System.out.println("isEmpty test: Queue empty? "+ a.isEmpty());
	}
	@Test
	void testIsFull() {
		boolean full = false;
		assertEquals(a.isFull(),full);
		System.out.println("isFull test: Queue full? "+ a.isFull());
	}
	@Test
	void testToString() {
		a.toString();
	}
}
