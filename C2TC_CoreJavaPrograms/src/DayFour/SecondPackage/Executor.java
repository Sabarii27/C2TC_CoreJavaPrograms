//Program to demonstrate accessing classes and methods of different package
package DayFour.SecondPackage;



public class Executor {
	public static void main(String[] args) {
		// accessing different package class
		DayFour.FirstPackage.Base b1 = new DayFour.FirstPackage.Base();

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}
