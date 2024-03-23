class dog1{
	String name;
	String breed;
	
	public dog1(){
		System.out.println("dog1 constructor");
	}
	public dog1(String name, String breed){
		this.name=name;
		this.breed=breed;
		System.out.println("dog1 constructor");
	}
	public String toString(){
		return name+ " " +breed;
	}
}
class dog2 extends dog1{
	private String color;
	
	public String getcolor(){
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	
	public dog2(){
		System.out.println("dog2 constructor");
	}
	public dog2(String name, String breed, String color){
		super(name, breed);
		this.color=color;
		System.out.println("dog2 constructor");
	}
	public String toString(){
		return name+ " " +breed+ " " +color;
	}
}
public class dogtest{
	public static void main(String[]args){
		dog1 d1=new dog1("ceasor", "labrador");
		System.out.println(d1);
		//dog2 d2=new dog2("simba", "labrador", "white");
		//System.out.println(d2);
		dog2 d2=new dog2("simba", "labrador", "white");
		d2.setcolor("black");
		System.out.println(d2);
	}
}
		
	