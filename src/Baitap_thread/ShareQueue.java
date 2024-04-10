package Baitap_thread;

import java.util.LinkedList;

public class ShareQueue {
  private int capacity;
  private LinkedList<Integer> queue;
public ShareQueue(int capacity) {
	this.capacity = capacity;
	queue= new LinkedList<Integer>();
}
public synchronized void produce(int item) throws InterruptedException{
	while(queue.size()== capacity) {
		wait();
	}
	queue.add(item);
	System.out.println("Produced:"+item);
	notifyAll();
}
public synchronized int consume() throws InterruptedException{
	while(queue.isEmpty()) {
		wait();
	}
	int consmedItem= queue.remove();
	System.out.println("Consumed:"+consmedItem);
	notifyAll();
	return consmedItem;
}
}
