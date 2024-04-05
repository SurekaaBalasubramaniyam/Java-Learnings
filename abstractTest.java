abstract class mobilephone{
	abstract void display();
	
	public void name(){
		System.out.println("name");
	}
}
class oppo extends mobilephone{
	@Override
	void display(){
		System.out.println("oppo phone display");
	}
}
class oneplus extends mobilephone{
	@Override
	void display(){
		System.out.println("oneplus phone display");
	}
}
public class abstractTest{
	public static void main(String args[]){
		
		oppo o=new oppo();
		o.display();
		
		oneplus op=new oneplus();
		op.display();
		
		mobilephone m=new oppo();
		m.display();
		
		m=new oneplus();
		m.display();
		
		mobileservice.service(o);
	}
}
class mobileservice{
	public static void service(mobilephone m){
		System.out.println("service method");
		m.display();
	}
}
		
	
		
		