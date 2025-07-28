package polymorphism_override;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//late binding,dynamic binding,runtime
		//Base class
		PLTraining p1= new PLTraining();
		p1.session("full dtack deveoper ");
		
		//JFS object
		p1=new JFS();
		p1.session("Method overiding");
		
		//Python object
		p1=new Python();
		p1.session("method overriding");

	}

}
