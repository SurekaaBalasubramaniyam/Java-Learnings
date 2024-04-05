	/*
	//construcor
	class vehicle{
		int wheel;
		String color;
	}
		public class thar{
			public static void main(String args[]){
				vehicle v1=new vehicle();
				System.out.println(v1.wheel);
				System.out.println(v1.color);
				
			}
		}*/
		//types
		class vehicle{
			//instance variable
			int wheel;
			String color;
			//no args constructor
			public vehicle(){
				System.out.println("no args constructor");
			}
			//args constructor
			public vehicle(int wheel, String color){
				System.out.println("args constructor");	
				this.wheel=wheel;
				this.color=color;
			}
			public String toString(){
					return wheel + " " + color;
			}		
		}
		//main class
		public class thar{
			public static void main(String args[]){
				vehicle v1=new vehicle();
				vehicle v2=new vehicle(4, "black");
				//to print values
				/*System.out.println(v1.wheel);
				System.out.println(v1.color);
				System.out.println(v2.wheel);
				System.out.println(v2.color);*/			
				//to print memory address
				System.out.println(v1);
				System.out.println(v2);
			}
		}
		