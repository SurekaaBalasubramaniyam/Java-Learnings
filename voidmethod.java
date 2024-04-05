public class voidmethod{
	public static void main(String args[]){
		int a=45;
		int b=98;
		int sum=add(a,b);
		int sub=subtract(a,b);
		int mul=multiplication(a,b);
		division(45,98);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
	}
	public static int add(int n1,int n2){
		int sum=n1+n2;
		return sum;
	}
	public static int subtract(int n1,int n2){
		int sub=n1-n2;
		return sub;
	}
	public static int multiplication(int n1,int n2){
		int mul=n1*n2;
		return mul;
	}
	public static void division(int n1,int n2){
		int div=n1/n2;
		System.out.println(div);
	}
}