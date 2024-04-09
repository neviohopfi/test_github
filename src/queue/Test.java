package queue;

public class Test {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue queue = new ArrayQueue(10);
		queue.queueEnqueue(5);
		queue.queueEnqueue(8);
		queue.queueDequeue();
		queue.queueDisplay();
		queue.queueFront();
	}

}
