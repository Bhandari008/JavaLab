package interfacePackage;

public class InterfaceProperties implements ShapeInterface {
	
	// 1. use "implements" keyword
	// 2. interface is public by default


	public static void main(String[] args) {
		// 3. Cannot instantiate the interface
		// ShapeInterface si = new ShapeInterface(); error
		InterfaceProperties ip = new InterfaceProperties();
		System.out.println("Area = "+ip.calculateArea(4, 6) );
		ip.calculatePerimeter(5, 6);
		System.out.println("Perimeter = "+ip.calculatePerimeter(4, 6) );
		
	}
	// 4. The class implementing the interface must implement the method
	@Override
	public int calculatePerimeter(int length, int breadth) {
		return 2* (length + breadth);
	}

	@Override
	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}



}
