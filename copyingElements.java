import java.util.ArrayList;
import java.util.List;

public class copyingElements{
	public static void main(String args[]){
		List<String> arr1=new ArrayList<>();
		arr1.add("apple");
		arr1.add("banana");
		arr1.add("grapes");
		arr1.add("mango");
		arr1.add("orange");
		System.out.println(arr1);
		
		List<String> arr2=new ArrayList<>();
		arr2.add("carrot");
		arr2.add("potato");
		arr2.add("beans");
		arr2.add("coliflower");
		arr2.add("capsicum");
		System.out.println(arr2);
		
		arr1.addAll(arr2);
		System.out.println(arr1);
	}
}
		
		