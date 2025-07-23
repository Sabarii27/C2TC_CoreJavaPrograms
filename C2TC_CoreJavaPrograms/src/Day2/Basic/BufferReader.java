package Day2.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter your Name:");
		name=br.readLine();
		
		int age;
		System.out.println("Enter the age:");
		age=Integer.parseInt(br.readLine());
		
		float avg;
		System.out.println("enter the avg:");
		avg=Float.parseFloat(br.readLine());
		
		System.out.println("name:"+name+" "+"age:"+age+" "+"avg:"+avg);
		

	}

}
