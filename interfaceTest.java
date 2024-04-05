interface mobilephoneInt{
	void display();
}
interface musicInt{
	void play();
}
class oppoInt implements mobilephoneInt, musicInt{
	@Override
	public void display(){
		System.out.println("oppo phone display");
	}
	@Override
	public void play(){
		System.out.println("oppo music play");
	}
}
class oneplusInt implements mobilephoneInt{
	@Override
	public void display(){
		System.out.println("oneplus phone display");
	}
}

public class interfaceTest{
	public static void main(String args[]){
		
		oppoInt o=new oppoInt();
		o.display();
		o.play();
		
		oneplusInt op=new oneplusInt();
		op.display();
		
		mobilephoneInt m=new oppoInt();
		m.display();
		
		musicInt music=new oppoInt();
		music.play();
		
		m=new oneplusInt();
		m.display();
		
		mobilefeature.feature(op);
	}
}
class mobilefeature{
	public static void feature(mobilephoneInt m){
		System.out.println("feature method");
		m.display();
	}
}
		
		
		
	
	