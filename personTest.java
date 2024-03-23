class female{
	String name;
	int age;
	
	public female(){
		System.out.println("female constructor");
	}
	public female(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("female constructor");
	}
	public String toString(){
		return name+ " " +age;
	}
}
class knowledge extends female{
	String specification;
	
	public knowledge(){
		System.out.println("knowledge constructor");
	}
	public knowledge(String name, int age, String specification){
		super(name, age);
		this.specification=specification;
		System.out.println("knowledge constructor");
	}
	public String toString(){
		return name+ " " +age+ " " +specification;
	}
}
public class personTest{
	public static void main(String[]args){
		female f=new female("surekaa",21);
		System.out.println(f);
		knowledge k=new knowledge("surekaa",21,"software developer");
		System.out.println(k);
	}
}
		
	