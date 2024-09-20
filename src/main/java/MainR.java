public class Main {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4,4);
		Rectangle r2 = new Rectangle(5,8);
		
        System.out.println("First Rectangle:");
		r1.draw();
		
        System.out.println("Second Rectangle:");
		r2.draw();
		
        System.out.println("Scaling the first rectangle by a factor of 2:");
		r1.scale(2);
		r1.draw();
		
		System.out.println("The area of r1: " + r1.calcArea());
	
        System.out.println("The area of r2: " + r2.calcArea());
		
		System.out.println("The perimeter of r1: " + r1.calcPerimeter());
		
        System.out.println("The perimeter of r2: " + r2.calcPerimeter());
	
	}

}
