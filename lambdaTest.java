import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;

interface funcInterface{
	void print(int x);
}
interface AddInterface{
	void add(int a,int b);
}
/*class subclass implements funcInterface{
	public void print(int x){
		System.out.println((2*x));
	}
}*/
public class lambdaTest{
	public static void main(String args[]){
		/*subclass s=new subclass();
		s.print(5);
		System.out.println(s);*/
		
		//lambda
		funcInterface fobj=(int x)->System.out.println(2*x);
		fobj.print(5);
		
		AddInterface aobj=(int a,int b)->System.out.println(a+b);
		aobj.add(10,20);
		
		//functional interface
		Predicate<String>p=(x)->x.equals("hello");
		System.out.println(p.test("hello123"));
		
		Consumer<Integer>conObj=(x)->System.out.println(x);
		conObj.accept(20);
		
		Supplier<String>suppObj=()->"hello";
		System.out.println(suppObj.get());
		
		Function<Integer,Integer>funObj=(x)->x*x;
		System.out.print(funObj.apply(10));
		
		BiFunction<Integer,Integer,Integer>biFunObj=(x,y)->x*y;
		System.out.print(biFunObj.apply(10,30));
	}
}