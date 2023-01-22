package Cqueue.q2;



public class CqueeMain {
	public static void main(String[] args) {
		Cquee q = new Cquee();

	   
	    q.deQueue();

	    q.enQueue(10);
	    q.enQueue(25);
	    q.enQueue(38);
	    q.enQueue(45);
	    q.enQueue(60);

	    q.enQueue(70);

	    q.display();

	    int elem1 = q.deQueue();
	    int elem2 = q.deQueue();

	    if (elem1 != -1|| elem2 != -1) {
	      System.out.println("Deleted Elements  is " + elem1+" & "+ elem2);
	    }
	    q.display();

	    q.enQueue(70);

	    q.display();

	    // Fails to enqueue because front == rear + 1
	    q.enQueue(8);
	}
}
