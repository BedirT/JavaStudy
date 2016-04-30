public class Inherit{
	
	class Figure{
		void display(){
			System.out.println("Figure");
		}
	}
	
	class Rectangle extends Figure{
		void display(){
			System.out.println("Rectangle");
		}
		void display(String s){
			System.out.println(s);
		}
	}
	
	class Box extends Figure{
		void display(){
			System.out.println("Box");
		}
		void display(String s){
			System.out.println("This is printed" + s);
		}
		void aMethod(){
			System.out.println("This is printed");
		}
	}
	
	Inherit(){
		
		Figure f = new Figure();
		Rectangle r = new Rectangle();
		Box b = new Box();
		f.display();
		f = r;
		f.display("one");
		f = b; // Reference type is figure but the class is box
		f.display("two"); // So you cannot use a function int the box class
		// because the reference type is Figure still.
		
	}
	
	public static void main(String[] args){
		new Inherit();
	}
}