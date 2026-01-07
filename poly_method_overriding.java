package mypkgfirst;


class Shape
{
    double area;

    void calculateArea()
    {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape
{
    double l, b;

    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }

    void calculateArea()
    {
        area = l * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Square extends Shape
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    void calculateArea()
    {
        area = side * side;
        System.out.println("Area of Square = " + area);
    }
}

public class poly_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        Shape s;

		        s = new Rectangle(10, 5);
		        s.calculateArea();

		        s = new Square(4);
		        s.calculateArea();
		    }
		}
	}


