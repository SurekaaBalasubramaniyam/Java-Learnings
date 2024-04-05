class vehicle{
	private int wheel;
	private String color;
	
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
		return wheel + " " + color;
	}
}
public class encapsulationdemo{
	public static void main(String args[]){
		vehicle v=new vehicle();
		v.setwheel(5);
		v.setcolor("red");
		System.out.println(v);
	}
}