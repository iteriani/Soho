import java.util.Collections;
import java.util.PriorityQueue;

/* Implementation of Bi-Priority Queue by Thomas Nguyen */
public class BiQueue implements BiPriorityQueue{

	private PriorityQueue<Integer> minQueue;
	private PriorityQueue<Integer> maxQueue;
	
	public BiQueue(){
		minQueue = new PriorityQueue<Integer>();
		/* maxQueue reverses the order of a normal priority queue. */
		maxQueue = new PriorityQueue<Integer>(10, Collections.reverseOrder());
	}
	
	public boolean isEmpty(){
		return minQueue.size() == 0;
	}
	
	public int size(){
		return minQueue.size();
	}
	
	public int removeMin(){
		if(isEmpty()){
			throw new IllegalStateException();
		}
		int min = minQueue.remove();
		maxQueue.remove(min);

		return min;
	}
	
	public int removeMax(){
		if(isEmpty()){
			throw new IllegalStateException();
		}
		int max = maxQueue.remove();
		minQueue.remove(max);
		return max;
	}
	
	public int getMin(){
		return minQueue.peek();
	}
	
	public int getMax(){
		return maxQueue.peek();
	}	
	public void put(int x){
		minQueue.add(x);
		maxQueue.add(x);
	}
	

}