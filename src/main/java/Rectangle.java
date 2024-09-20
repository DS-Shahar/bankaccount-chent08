public class Rectangle {
	
	private int length;
	private int width;
	
	
	//פעולה בונה
	public Rectangle (int length , int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	public void draw() {
		for(int i = 0 ; i<this.length ; i++) {
			for(int j = 0 ; j< this.width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int calcArea() {
		return( this.length * this.width ); 
	}
	
	public int calcPerimeter() {
		return(this.length * 2 + this.width * 2);
	}
	
	public void scale(int factor) {
		this.length = length * factor;
		this.width = width * factor;
	}
	
	public String toString() {
		return("Length: "+ this.length + ", Width: "+ this.width);
	}

}
