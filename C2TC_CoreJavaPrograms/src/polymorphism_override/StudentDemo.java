package polymorphism_override;
class college{
	protected college getobject() {
		return new college();
	}
}

class Student extends college{
	@Override
	public Student getobject() {
		return new Student();
	}
}

public class StudentDemo {
	public static void main(String []args) {
		
	}

}
