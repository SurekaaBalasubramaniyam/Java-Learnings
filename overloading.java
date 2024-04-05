public class overloading{
	public static void main(String args[]){
		int a=67;
		int b=43;
		double d=46.7;
		
		System.out.println(add(a,b));
		System.out.println(add(d,b));
	}
	public static int add(int n,int m){
		return n+m;
	}
	/*public static double add(double n,int m){
		return n+m;
	}*/
	public static int add(double n,int m){
		return (int)n+m;
	}
}