package buzz.xinyan.java.exercise;


public abstract class Shape {
	private String color;
	
	public Shape() {
		super();
	}
	public Shape(String color) {
		super();
		this.color = color;
	}
	public abstract void celPerimeter();
	public static void main(String[] args) {
		new Triangle().celPerimeter();
		new Circle2().celPerimeter();
	}
}
class Triangle extends Shape{
	//定义三边边长
	private double a = 1;
	private double b = 1;
	private double c = 1;
	
	@Override
	public void celPerimeter() {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
	}
	
}
class Circle2 extends Shape{
	private double radious  = 10;

	@Override
	public void celPerimeter() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI*(10*2));
	}
	
	
}