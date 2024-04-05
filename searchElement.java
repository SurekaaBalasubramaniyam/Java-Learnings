import java.util.ArrayList;
import java.util.List;

public class searchElement{
	public static void main(String args[]){
		List<String> arr=new ArrayList<>();
		
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
		
		if(arr.contains ("B")){
			System.out.println("The element is found");
		}
		else{
			System.out.println("The element is not found");
		}
			
		if(arr.contains ("G")){
			System.out.println("The element is found");
		}
		else{
			System.out.println("The element is not found");
		}
	}
}
			