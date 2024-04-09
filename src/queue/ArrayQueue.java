package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * method checks if capacity is full, if not it should move the rear + 1
	 * @param item
	 */
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	/**
	 * method checks, if the queue is empty, if not move the rear -1
	 * @return
	 */
	public static int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			// TODO Elemente im Array verrücken
			for(int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}
		return firstElement;
	}
	
	/**
	 * method gives out the queue, if it is not empty
	 */
	public static void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	/**
	 * method checks, if queue is empty, if not it gives back the first element 
	 * @return
	 */
	public static int queueFront() {
		// TODO erstes Element ohne Löschen zurückgeben
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue is empty");
		} else {
			firstElement = queue[front];
		}
		return firstElement;
	}
	
	// HÜ: ArrayQueueTest Klasse erstellen - alle Methoden von ArrayQueue testen
	//	JavaDoc-Kommentare
	//	Kapitel 5 nochmals durcharbeiten
	
}
