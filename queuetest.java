import java.util.ArrayDeque;
import java.util.Queue;

public class queuetest{
	public static void main(String args[]){
		Queue<Integer> queue=new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println(queue);
		System.out.println("peek " + queue.peek());
		
		queue.poll();
		System.out.println(queue);
	}
}

		
