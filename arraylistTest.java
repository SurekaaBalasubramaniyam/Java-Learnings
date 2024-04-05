import java.util.ArrayList;
import java.util.List;

class vehicleCollection{
	private int wheel;
	private String color;
	
	public vehicleCollection(int wheel, String color){
		this.wheel=wheel;
		this.color=color;
	}
	public int getwheel(){
		return wheel;
	}
	public void setwheel(int wheel){
		this.wheel=wheel;
	}
	public String getcolor(){
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String toString(){
		return wheel+ " " + color;
	}
}
public class arraylistTest{
	public static void main(String args[]){
		
		List<vehicleCollection> vehicleList=new ArrayList<>();
		
		vehicleCollection v1=new vehicleCollection(4,"black");
		vehicleCollection v2=new vehicleCollection(4,"white");
		
		vehicleList.add(v1);
		vehicleList.add(v2);
		System.out.println(vehicleList);
		
		vehicleCollection v3=vehicleList.get(1);
		v3.setwheel(3);
		System.out.println(vehicleList);
		
		vehicleCollection v4=new vehicleCollection(8,"yellow"); 
		
		vehicleList.add(v4);
		System.out.println(vehicleList);
	}
}
		
		
		