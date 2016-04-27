interface Shape{
	public void draw();
	public void getArea(float l,float b);
}

class Rectangle{
	public void draw(){
		System.out.println("Area of Rectangle");
	}
	public void getArea(float l,float b){
		float area=l*b;
		System.out.println("Area of Rectangle"+area);
	}
}
class Triangle{
	public void draw(){
		System.out.println("Area of Triangle");
	}
	public void getArea(float l,float b){
		float area=(l*b)/2;
		System.out.println("Area of Triangle"+area);
	}
}
class assignment3{
	public static void 	main(String[] args) {
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		r.draw();
		t.draw();
		r.getArea(5,6);
		t.getArea(6,9);
	}
}