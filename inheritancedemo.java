class vehicle{
	int wheel=4;
	String color="black";
	
	public vehicle(){
		System.out.println("vehicle constructor");
	}
	public vehicle(int wheel, String color){
		System.out.println("parent constructor");
		this.wheel=wheel;
		this.color=color;
	}
	public String toString(){
		return wheel+" "+color;
	}
}
class car extends vehicle{
	String name="Thar";
	
	public car(){
		System.out.println("car constructor");
	}
	public car(int wheel, String color, String name){
		super(wheel, color);
		this.name=name;
		System.out.println("child constructor");
	}
	public String toString(){
		return wheel+" "+color+" "+name;
	}
}

public class inheritancedemo{
	public static void main(String[]args){
		//vehicle v=new vehicle(4, "black");
		//System.out.println(v);
		car c=new car(4, "black", "Thar");
		System.out.println(c);
	}
}