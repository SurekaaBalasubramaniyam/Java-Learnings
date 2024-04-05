import java.util.HashMap;
import java.util.Map;

public class hashmapTest{
	public static void main(String args[]){
		Map<Integer, String> hashmap=new HashMap<>();
		hashmap.put(13,"surekaa");
		hashmap.put(17,"sumitha");
		hashmap.put(7,"deepika");
		hashmap.put(27,"dhivya");
		System.out.println(hashmap);
		
		for(Map.Entry<Integer, String> entry :hashmap.entrySet()){
			String name=entry.getValue();
			System.out.println("key value pair is:" + entry.getKey() + entry.getValue());
		}
		
		for(Integer k: hashmap.keySet()){
			System.out.println("key is:" + k);
		}
		
		for(String s: hashmap.values()){
			System.out.println("value is:" + s);
		}
	}
}
		
