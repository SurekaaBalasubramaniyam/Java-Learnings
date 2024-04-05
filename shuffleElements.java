import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class shuffleElements{
	public static void main(String args[]){
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		System.out.println("List before shuffle:" + list);
		
		Collections.shuffle(list);
		System.out.println("List after shuffle:" + list);
	}
}