package ushapackage;
// example of overloading 
//class Circle{
//	
//	double radius = 0;
//	String color = "red";
//	
//	// constructor w/o dimensions
//	Circle(){
//		radius = 0;
//		color = "red";
//	}
//	// constructor with dimensions double radius
//	Circle(double rd){
//		radius = rd;
//		color = "red";
//	}
//	// constructor with dimensions double radius
//	Circle(double rd,String col){
//		radius = rd;
//		color = col;
//	}
//
//	// compute and return radius
//	double getRadius(){
//		
//		return radius;
//	}
//	
//	// compute and return color
//	String getColor(){
//		
//		return color;
//	}
//	
//	// compute and set radius
//		void setRadius(double r){
//			
//			radius = r;
//			System.out.println("The radius is  set to "+radius);
//		}
//		
//		// compute and set color
//		void setColor(String c){
//			
//			color = c;
//			System.out.println("The color is  set to "+color);
//		}
//
//		// compute and return color
//		public String toString(){
//			
//			return "Circle[radius="+radius+",color="+color+"]";
//		}
//		// compute and return aread
//		double getArea(){
//			
//			return Math.PI*(radius*radius);
//		}
//
//}
//class Overload_assignment {
//
//	public static void main(String[] args) {
//		// calling Circle contructors
//		Circle  c1 = new Circle();
//		Circle  c2 = new Circle(10.25);
//		Circle  c3 = new Circle(20.25,"yellow");
//		//double radius;
//		//String color;
//		
//		// calling Circle c1 functions 
//		c1.setRadius(30); 
//		c1.setColor("pink");
//		System.out.println("The c1 color is  set to "+c1.getColor());
//		System.out.println("The c1 radius is  set to "+c1.getRadius());
//		System.out.println("The string is  "+c1.toString());
//		System.out.println("The c1 area is "+c1.getArea());
//		
//		System.out.println("The c2 color is  set to "+c2.getColor());
//		System.out.println("The c2 radius is  set to "+c2.getRadius());
//		System.out.println("The C2 string is  "+c2.toString());
//		System.out.println("The c2 area is "+c2.getArea());
//		
//		System.out.println("The  color is  set to "+c3.getColor());
//		System.out.println("The c3 radius is  set to "+c3.getRadius());
//		System.out.println("The string is  "+c3.toString());
//		System.out.println("The c3 area is "+c3.getArea());
//	}
//
//}

//class Time{
//	
//	int hour = 0;
//	int minute = 0;
//	int second = 0;
//		
//	// constructor w/o dimensions
//	Time(){
//		hour = 1;
//		minute =2;
//		second =3;
//	}
//	
//	Time(int h,int m,int s){
//		hour = h;
//		minute =m;
//		second =s;
//	}
//
//	// compute and return Hour
//	int getHour(){
//		return hour;
//	}
//	
//	// compute and return minute
//	int getMinute(){
//		return minute;
//	}
//	
//	// compute and return second
//		int getSecond(){
//			return second;
//		}
//	// compute and set Hour
//		void setHour(int h){
//			hour = h;
//			System.out.println("The Hour is  set to "+hour);
//		}
//		// compute and set Minute
//		void setMinute(int m){
//			minute = m;
//			System.out.println("The Minute is  set to "+minute);
//		}
//		// compute and set Second
//		void setSecond(int s){
//			second = s;
//			System.out.println("The Second is  set to "+second);
//		}
//		void setTime(int h,int m,int s){
//			hour = h;
//			minute = m;
//			second = s;
//			System.out.println("The Time  is  set to +h="+hour+"+m="+minute+"+s="+second);
//		}
//	
//		// compute and return color
//		public String toString(){
//			return " "+hour+":"+minute+":"+second+"";
//		}
//		// compute and return aread
//		Object nextSecond(){
//			second = second +1;
//			return Object.class;
//		}
//		
//		Object prevSecond(){
//			second = second -2;
//			return Object.class;
//		}
//
//
//}
//class Overload_assignment {
//
//	public static void main(String[] args) {
//		// calling Circle contructors
//		Time T = new Time(11,12,13);
//		
//		System.out.println("The hour is  "+T.getHour());
//		System.out.println("The minute is  "+T.getMinute());
//		System.out.println("The second is  "+T.getSecond());
//		System.out.println("The second is  "+T.toString());
//		T.nextSecond();
//		System.out.println("The next second is  "+T.toString());
//		T.prevSecond();
//		System.out.println("The previous second is  "+T.toString());
//		
//     }
//
//}

class Employee{
	
	int id = 0;
	String firstName= "";	
	String lastName= "";
	int salary =0;
	
	
	
	Employee(int i,String fn,String ln,int s){
		id = i;
		firstName= fn;	
		lastName= ln;
		salary =s;
	}

	// compute and return id
	int getID(){
		return id;
	}
	
	// compute and return First name 
	String getfirstName(){
		return firstName;
	}
	
	// compute and return Last name 
	String getlastName(){
		return lastName;
	}
	
	
	// compute and return Name
		String getName(){
			return firstName+" "+lastName;
		}
		
		// compute and return Salary  
		int getSalary(){
			return salary;
		}
		
		// compute and return Salary  
		int getAnnualSalary(){
			return salary*12;
		}
		// compute and return 2 % incremented Salary  
		int raiseSalary(){
			int increment = (2*salary)/100;
			return salary = salary+increment;
		}

		// compute and return color
		public String toString(){
			return "[id ="+id+",firstName="+firstName+",lastName="+lastName+",salary="+salary+"]";
			}
}
class Overload_assignment {

	public static void main(String[] args) {
		// calling Employee contructors
		Employee e = new Employee(145,"Adam","Smith",2000);
		
		System.out.println("The ID is  "+e.getID());
		System.out.println("The firstname is  "+e.getfirstName());
		System.out.println("The Lastname is  "+e.getlastName());
		System.out.println("The Name is  "+e.getName());
		System.out.println("The Salary is  "+e.getSalary());
		System.out.println("The Annual Salary is  "+e.getAnnualSalary());
		System.out.println("The Raised Salary is  "+e.raiseSalary());
		System.out.println("The Employee info "+e.toString());
     }

}
