package br.curso.poo.triangle;

public class MainTriangule {

	public static void main(String[] args) throws Exception {
		System.out.println(Triangle.isIsosceles(5, 1, 1));
		System.out.println(Triangle.isScalene(1, 2, 5));
		System.out.println(Triangle.isEquilateral(2, 2, 2));

		Triangle t = new Triangle(2, 2, 2){};
		EquilateralTriangule e = new EquilateralTriangule(2,2,2);
		System.out.println(t.getArea() == e.getArea());

		Triangle r = new Triangle(1,2,5){};
		ScaleneTriangule s = new ScaleneTriangule(1,2,5);
		System.out.println(r.getArea() == s.getArea());

		Triangle i = new Triangle(5,1,1){};
		IsoscelesTriangule is = new IsoscelesTriangule(5,1,1);
		System.out.println(i.getArea() == is.getArea());


	}
}