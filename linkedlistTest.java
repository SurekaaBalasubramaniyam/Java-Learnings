import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlistTest{
	public static void main(String args[]){
		List<Integer> linkedlist=new LinkedList<>();
		
		linkedlist.add(35);
		linkedlist.add(45);
		System.out.println(linkedlist);
		
		linkedlist.add(0,55);
		System.out.println(linkedlist);
		
		linkedlist.set(1,65);
		System.out.println(linkedlist);
	}
}

