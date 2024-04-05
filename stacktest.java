import java.util.Stack;

public class stacktest{
	public static void main(String args[]){
		Stack<Integer> stack=new Stack<>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		
		System.out.println(stack);
		System.out.println("peek " + stack.peek());
		System.out.println(stack);
		
		System.out.println("pop " + stack.pop());
		System.out.println(stack);
	}
}

		
