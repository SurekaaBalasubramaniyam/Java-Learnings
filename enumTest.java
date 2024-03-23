import java.util.EnumSet;

enum Temperature{
	Low(10),
	Medium(20),
	High(30),
	Critical(40);
	
	private int value;
	
	Temperature(int value){
		this.value=value;
	}
	public int getvalue(){
		return value;
	}
	
	static final EnumSet<Temperature> safeRange=EnumSet.of(Low,Medium);
	static final EnumSet<Temperature> hignRange=EnumSet.of(High,Critical);
}

public class enumTest{
	public static void main(String args[]){
		Temperature tempereture=Temperature.Medium;
	
		/*switch(tempereture){
			case Low:
				System.out.println("Low");
				break;
			case Medium:
				System.out.println("Medium");
				break;
			case High:
				System.out.println("High");
				break;
			case Critical:
				System.out.println("Critical");
				break;
			default:
				System.out.println("Low");
				break;
		}
		
		System.out.println(Temperature.Low.getvalue());
		System.out.println(Temperature.Low);*/
		
		for(Temperature temp:Temperature.values()){
			System.out.println(temp.getvalue());
		}
		int value=10;
		
		if(Temperature.safeRange.contains(Temperature.Medium)){
			System.out.println("pass");
		}
	}
}
	    