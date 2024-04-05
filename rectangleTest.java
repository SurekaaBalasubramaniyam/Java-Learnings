import java.util.*;
class rectangle{
	int height;
	int width;
	
	public rectangle(int height, int width){
		System.out.println("area and perimeter of the rectangle");
		this.height=height;
		this.width=width;
	}
	public void area(){
		area=height*width;
		System.out.println("area of the rectangle is:" + area);
	}
	public void perimeter(){
		perimeter=2*(height*width);
		System.out.println("perimeterof the rectangleis:" + perimeter);
	}
}
public class rectangleTest{
	public static void main(String args[]){
		rectangle r=new rectangle();
		r.height=2;
		r.width=3;
		System.out.println("height=" + r.height);
		System.out.println("width=" + r.height);
		r.area();
		r.perimeter();
	}
}
		
		
